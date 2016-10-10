package DAO;

import Controller.DatasHoras;
import Model.EntidadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.*;

public class OrdemServicoDAO extends EntidadeConexao {

    private String NomeCliente, EnderecoCliente, NumeroEnderecoCliente, BairroCliente, CidadeCliente, TelefoneCliente, CelularCliente, CpfCnpjCliente;
    private String EquipamentoOs, MarcaEquipOs, ModeloEquipOs, NumeroSerieOs, AcessorioOs, ProblemaReclamadoOs, ObsOs;

    private int idUsuario;
    private String idCliente;
    private String id_os;
    private String data;
    private String sql;

    public boolean GravaOs() throws SQLException {
        DatasHoras dataAtual = new DatasHoras();
        Connection conexao = abreConexao();
        PreparedStatement prs;
        data = dataAtual.retornaData();
        String sql = "INSERT INTO ordem_servico(usuario_id,cadastro_clientes_id,data_abertura,modelo,problema_reclamado,marca,equipamento"
                + ",numero_serie,acessorios,obsos,aberta_fechada) VALUES('" + getIdUsuario() + "','" + getIdCliente() + "','" + data + "','" + getModeloEquipOs() + "','" + getProblemaReclamadoOs() + "','" + getMarcaEquipOs() + "','" + getEquipamentoOs() + "','" + getNumeroSerieOs() + "','" + getAcessorioOs() + "','" + getObsOs() + "',1)";
        try {
            prs = conexao.prepareStatement(sql);
            prs.executeUpdate();            
            conexao.close();
            return true;
        } catch (SQLException e) {
            conexao.close();
            return false;
        } finally {
            conexao.close();
        }
    }

    //CONTINUAR CÓDIGO ABAIXO!
    public DefaultTableModel AlimentaTabelaOs() throws SQLException {
        try {
            DatasHoras dataAtual = new DatasHoras();
            data = dataAtual.retornaData();
            DefaultTableModel dm = new DefaultTableModel();
            Connection conexao = abreConexao();
            ResultSet rset = null;
            PreparedStatement prs = null;
            dm.addColumn("Nº OS");
            dm.addColumn("Cod. Cliente");
            dm.addColumn("Cliente");
            dm.addColumn("Telefone");
            dm.addColumn("Descrição");
            String sql = "SELECT id_os,id_cliente,nome,telefone,problema_reclamado FROM ordem_servico,cadastro_clientes WHERE cadastro_clientes_id = id_cliente ORDER BY id_os DESC";
            prs = conexao.prepareStatement(sql);
            rset = prs.executeQuery();
            while (rset.next()) {
                String id_os = rset.getString(1);
                String id_cliente = rset.getString(2);
                String nome = rset.getString(3);
                String telefone = rset.getString(4);
                String problema_reclamado = rset.getString(5);
                dm.addRow(new String[]{id_os, id_cliente, nome, telefone, problema_reclamado});                
            }
            rset.close();
            prs.close();
            conexao.close();
            return dm;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao gerar tabela");
        }
        return null;
    }
    //SQL para calcular diferença de dias
    //SELECT DATE_PART('day',data_abertura::date) - DATE_PART('day',now()::date) from ordem_servico
    //O Select abaixo é mais efetivo    
    //SELECT data_abertura::date - now()::date,id_os,aberta_fechada from ordem_servico

    public void VerificaDataESetaStatus() throws SQLException {
        Connection conexao = abreConexao();
        JOptionPane.showMessageDialog(null, "ENTROU");
        try {
            PreparedStatement prs;
            ResultSet rset;
            String sql = "SELECT data_abertura::date - now()::date,id_os,aberta_fechada from ordem_servico";
            //"SELECT DATE_PART('day',data_abertura::date) - DATE_PART('day',now()::date),id_os,aberta_fechada from ordem_servico";
            Statement stmt = conexao.createStatement();
            Statement stmt2 = conexao.createStatement();
            stmt.executeQuery(sql);
            rset = stmt.getResultSet();
            while (rset.next()) {
                int dif = rset.getInt(1);
                int id_os = rset.getInt(2);
                int aberto_fechado = rset.getInt(3);
                if (aberto_fechado != 0) {
                    if (dif < -2 && dif > -6) {
                        sql = "UPDATE ordem_servico SET status_os = 2 WHERE id_os = '" + id_os + "'";
                        stmt2.executeUpdate(sql);
                        //System.err.println("O ID: " + id_os + " foi movido para status 2(3 a 6 dias de atraso)");
                        //System.err.println("Atrasado em: " + dif + " dias");
                        //System.err.println("ID " + id_os + " Alterado para status 2: " + id_os);
                    }
                    if (dif <= -6 && dif > -10) {
                        sql = "UPDATE ordem_servico SET status_os = 3 WHERE id_os = '" + id_os + "'";
                        stmt2.executeUpdate(sql);
                        //System.err.println("O ID: " + id_os + " foi movido para status 3(7 ou mais dias de atraso)");
                        //System.err.println("Atrasado em: " + dif + " dias");
                        //System.err.println("ID " + id_os + " Alterado para status 3: " + id_os);
                    }
                    //System.err.println("OS: "+id_os+" esta aberta");
                } else if (aberto_fechado == 0) {
                    //System.err.println("A O.S " + id_os + " ESTA FECHADA e não sera alterada");
                }

            }
            JOptionPane.showMessageDialog(null, "[OK]");
            conexao.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO" + e.getMessage());
        }
    }

    public void fechaOs() throws SQLException {
        Connection conexao = abreConexao();
        try {
            String sql = "UPDATE ordem_servico SET aberta_fechada = 0 WHERE id_os = '" + getId_os() + "'";
            PreparedStatement prs;
            prs = conexao.prepareStatement(sql);
            prs.executeUpdate();
            JOptionPane.showMessageDialog(null, "OS finalizada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void Imprime() throws JRException, SQLException {
        Connection conexao = abreConexao();
        try {
            JasperDesign jasperDesign = JRXmlLoader.load(getClass().getResourceAsStream("/Modelo_OS.jrxml"));
            String sql = "SELECT * FROM ordem_servico,cadastro_clientes WHERE id_os = '"+getId_os()+"' and id_cliente ='"+getIdCliente()+"'";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jasperDesign.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conexao);

            JasperPrintManager.printReport(jasperPrint, true);
            //JasperViewer.viewReport(jasperPrint, false);
            conexao.close();
        } catch (Exception e) {
            conexao.close();
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public int retornaID() throws SQLException{
        Connection conexao = abreConexao();
        int id = 0;
        try{
            PreparedStatement prs;
            ResultSet rset;
            String sql = "SELECT id_os FROM ordem_servico";
            prs = conexao.prepareStatement(sql);        
            rset = prs.executeQuery();
            while(rset.next()){
                id = rset.getInt("id_os");
            }
            id = id + 1;
            conexao.close();
            return id;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return 0;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getEnderecoCliente() {
        return EnderecoCliente;
    }

    public void setEnderecoCliente(String EnderecoCliente) {
        this.EnderecoCliente = EnderecoCliente;
    }

    public String getNumeroEnderecoCliente() {
        return NumeroEnderecoCliente;
    }

    public void setNumeroEnderecoCliente(String NumeroEnderecoCliente) {
        this.NumeroEnderecoCliente = NumeroEnderecoCliente;
    }

    public String getBairroCliente() {
        return BairroCliente;
    }

    public void setBairroCliente(String BairroCliente) {
        this.BairroCliente = BairroCliente;
    }

    public String getCidadeCliente() {
        return CidadeCliente;
    }

    public void setCidadeCliente(String CidadeCliente) {
        this.CidadeCliente = CidadeCliente;
    }

    public String getTelefoneCliente() {
        return TelefoneCliente;
    }

    public void setTelefoneCliente(String TelefoneCliente) {
        this.TelefoneCliente = TelefoneCliente;
    }

    public String getCelularCliente() {
        return CelularCliente;
    }

    public void setCelularCliente(String CelularCliente) {
        this.CelularCliente = CelularCliente;
    }

    public String getCpfCnpjCliente() {
        return CpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String CpfCnpjCliente) {
        this.CpfCnpjCliente = CpfCnpjCliente;
    }

    public String getEquipamentoOs() {
        return EquipamentoOs;
    }

    public void setEquipamentoOs(String EquipamentoOs) {
        this.EquipamentoOs = EquipamentoOs;
    }

    public String getMarcaEquipOs() {
        return MarcaEquipOs;
    }

    public void setMarcaEquipOs(String MarcaEquipOs) {
        this.MarcaEquipOs = MarcaEquipOs;
    }

    public String getModeloEquipOs() {
        return ModeloEquipOs;
    }

    public void setModeloEquipOs(String ModeloEquipOs) {
        this.ModeloEquipOs = ModeloEquipOs;
    }

    public String getNumeroSerieOs() {
        return NumeroSerieOs;
    }

    public void setNumeroSerieOs(String NumeroSerieOs) {
        this.NumeroSerieOs = NumeroSerieOs;
    }

    public String getAcessorioOs() {
        return AcessorioOs;
    }

    public void setAcessorioOs(String AcessorioObservacaoOs) {
        this.AcessorioOs = AcessorioObservacaoOs;
    }

    public String getProblemaReclamadoOs() {
        return ProblemaReclamadoOs;
    }

    public void setProblemaReclamadoOs(String ProblemaReclamadoOs) {
        this.ProblemaReclamadoOs = ProblemaReclamadoOs;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getId_os() {
        return id_os;
    }

    public void setId_os(String id_os) {
        this.id_os = id_os;
    }

    public String getObsOs() {
        return ObsOs;
    }

    public void setObsOs(String ObsOs) {
        this.ObsOs = ObsOs;
    }

}
