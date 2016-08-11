
package DAO;

import Model.EntidadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OrdemServicoDAO extends EntidadeConexao{
    private String NomeCliente,EnderecoCliente,NumeroEnderecoCliente,BairroCliente,CidadeCliente,TelefoneCliente,CelularCliente,CpfCnpjCliente;
    private String EquipamentoOs,MarcaEquipOs,ModeloEquipOs,NumeroSerieOs,AcessorioObservacaoOs,ProblemaReclamadoOs;
    private int idUsuario;
    private int idCliente;
    private String data;
    
    
    public void GravaOs() throws SQLException{
        Connection conexao = abreConexao();
        PreparedStatement prs;
        data = "Dia de hoje";
        String sql = "INSERT INTO ordem_servico(usuario_id,cadastro_clientes_id,data_2,modelo,problema_reclamado,marca,equipamento"
                + ",numero_serie,acessorios_obs) VALUES('"+getIdUsuario()+"','"+getIdCliente()+"','"+data+"','"+getModeloEquipOs()+"','"+getProblemaReclamadoOs()+"','"+getMarcaEquipOs()+"','"+ getEquipamentoOs()+"','"+getNumeroSerieOs()+"','"+getAcessorioObservacaoOs()+"')";           
            try{
                prs = conexao.prepareStatement(sql);
                prs.executeUpdate();
                JOptionPane.showMessageDialog(null, "OS REGISTRADA");
                conexao.close();
            }catch(SQLException e){
                conexao.close();
                JOptionPane.showMessageDialog(null, "Falha no DAO da OS");
                JOptionPane.showConfirmDialog(null, e.getMessage());
            }finally{
                conexao.close();
            }
                
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
