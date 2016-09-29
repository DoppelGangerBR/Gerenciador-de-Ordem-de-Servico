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

public class OrdemServicoDAO extends EntidadeConexao {

    private String NomeCliente, EnderecoCliente, NumeroEnderecoCliente, BairroCliente, CidadeCliente, TelefoneCliente, CelularCliente, CpfCnpjCliente;
    private String EquipamentoOs, MarcaEquipOs, ModeloEquipOs, NumeroSerieOs, AcessorioObservacaoOs, ProblemaReclamadoOs;
    private int idUsuario;
    private int idCliente;
    private String id_os;
    private String data;

    public void GravaOs() throws SQLException {
        DatasHoras dataAtual = new DatasHoras();
        Connection conexao = abreConexao();
        PreparedStatement prs;
        data = dataAtual.retornaData();
        String sql = "INSERT INTO ordem_servico(usuario_id,cadastro_clientes_id,data_abertura,modelo,problema_reclamado,marca,equipamento"
                + ",numero_serie,acessorios_obs) VALUES('" + getIdUsuario() + "','" + getIdCliente() + "','" + data + "','" + getModeloEquipOs() + "','" + getProblemaReclamadoOs() + "','" + getMarcaEquipOs() + "','" + getEquipamentoOs() + "','" + getNumeroSerieOs() + "','" + getAcessorioObservacaoOs() + "')";
        try {
            prs = conexao.prepareStatement(sql);
            prs.executeUpdate();
            //JOptionPane.showMessageDialog(null, "OS REGISTRADA");
            conexao.close();
        } catch (SQLException e) {
            conexao.close();
            //JOptionPane.showMessageDialog(null, "Falha no DAO da OS");
            JOptionPane.showConfirmDialog(null, e.getMessage());
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
            dm.addColumn("Cliente");
            dm.addColumn("Telefone");
            dm.addColumn("Descrição");
            String sql = "SELECT id_os,nome,telefone,problema_reclamado FROM ordem_servico,cadastro_clientes WHERE cadastro_clientes_id = id_cliente";
            prs = conexao.prepareStatement(sql);
            rset = prs.executeQuery();
            while (rset.next()) {
                String id_os = rset.getString(1);
                String nome = rset.getString(2);
                String telefone = rset.getString(3);
                String problema_reclamado = rset.getString(4);
                dm.addRow(new String[]{id_os, nome, telefone, problema_reclamado});
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
                if (aberto_fechado == 1) {
                    if (dif < -2 && dif > -6) {
                        sql = "UPDATE ordem_servico SET status_os = 2 WHERE id_os = '" + id_os + "'";
                        stmt2.executeUpdate(sql);
                        System.err.println("O ID: " + id_os + " foi movido para status 2(3 a 6 dias de atraso)");
                        System.err.println("Atrasado em: " + dif + " dias");
                        System.err.println("ID " + id_os + " Alterado para status 2: " + id_os);
                    }if (dif <= -6 && dif > -10) {
                        sql = "UPDATE ordem_servico SET status_os = 3 WHERE id_os = '" + id_os + "'";
                        stmt2.executeUpdate(sql);
                        System.err.println("O ID: " + id_os + " foi movido para status 3(7 ou mais dias de atraso)");
                        System.err.println("Atrasado em: " + dif + " dias");
                        System.err.println("ID " + id_os + " Alterado para status 3: " + id_os);
                    }
                }else if(aberto_fechado == 0){
                    System.err.println("A O.S "+id_os+" ESTA FECHADA e não sera alterada");
                }
                System.err.println("ID: "+id_os+"\nAtraso: "+dif);
                

            }
            JOptionPane.showMessageDialog(null, "[OK]");
            conexao.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO" + e.getMessage());
        }
    }
    public void fechaOs() throws SQLException{
        Connection conexao = abreConexao();
        try{
            String sql = "UPDATE ordem_servico SET aberta_fechada = 0 WHERE id_os = '"+getId_os()+"'";
            PreparedStatement prs = null;
            prs = conexao.prepareStatement(sql);
            prs.executeUpdate();
            conexao.close();
            JOptionPane.showMessageDialog(null, "O.S Finalizada com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO "+e.getMessage());
        }
    }

    public String getId_os() {
        return id_os;
    }

    public void setId_os(String id_os) {
        this.id_os = id_os;
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

    public String getAcessorioObservacaoOs() {
        return AcessorioObservacaoOs;
    }

    public void setAcessorioObservacaoOs(String AcessorioObservacaoOs) {
        this.AcessorioObservacaoOs = AcessorioObservacaoOs;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}
