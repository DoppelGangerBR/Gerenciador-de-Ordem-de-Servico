
package Controller;

import DAO.OrdemServicoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ValidaOS {
    private String NomeCliente,EnderecoCliente,NumeroEnderecoCliente,BairroCliente,CidadeCliente,TelefoneCliente,CelularCliente,CpfCnpjCliente;
    private String EquipamentoOs,MarcaEquipOs,ModeloEquipOs,NumeroSerieOs,AcessorioObservacaoOs,ProblemaReclamadoOs;
    private int idUsuario;
    private int idCliente;
    private String data;
    OrdemServicoDAO EnviaOSproBanco = new OrdemServicoDAO();
    public ValidaOS() {
        
    }
    public void VerificaCamposObrigatorios() throws SQLException{
        if(getNomeCliente().equals("") || getTelefoneCliente().equals("") || getCelularCliente().equals("") || getCpfCnpjCliente().equals("")){
            JOptionPane.showMessageDialog(null, "Erro, preencha todos os campos");
        }else{
            EnviaOSproBanco.setIdCliente(getIdCliente());
            EnviaOSproBanco.setIdCliente(getIdCliente());
            EnviaOSproBanco.setAcessorioObservacaoOs(getAcessorioObservacaoOs());
            EnviaOSproBanco.setEquipamentoOs(getEquipamentoOs());
            EnviaOSproBanco.setProblemaReclamadoOs(getProblemaReclamadoOs());
            EnviaOSproBanco.setNumeroSerieOs(getNumeroSerieOs());
            EnviaOSproBanco.setModeloEquipOs(getModeloEquipOs());
            EnviaOSproBanco.setMarcaEquipOs(getMarcaEquipOs());
            EnviaOSproBanco.GravaOs();
            JOptionPane.showMessageDialog(null, "OK, passou pelo Controller");
        }
        
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public OrdemServicoDAO getEnviaOSproBanco() {
        return EnviaOSproBanco;
    }

    public void setEnviaOSproBanco(OrdemServicoDAO EnviaOSproBanco) {
        this.EnviaOSproBanco = EnviaOSproBanco;
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
    
}