
package Controller;

import DAO.OrdemServicoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class ValidaOS {
    private String NomeCliente,EnderecoCliente,NumeroEnderecoCliente,BairroCliente,CidadeCliente,TelefoneCliente,CelularCliente,CpfCnpjCliente;
    private String EquipamentoOs,MarcaEquipOs,ModeloEquipOs,NumeroSerieOs,AcessorioOs,ProblemaReclamadoOs,ObsOs;
    private String idUsuario;
    private String idCliente;
    private String id_os;

    
    private String data;
    OrdemServicoDAO EnviaOSproBanco = new OrdemServicoDAO();
    public ValidaOS() {
        
    }
    public boolean VerificaCamposObrigatorios() throws SQLException, JRException{
        if(getNomeCliente().equals("") || getTelefoneCliente().equals("") || getCelularCliente().equals("") || getCpfCnpjCliente().equals("")){
            JOptionPane.showMessageDialog(null, "Erro, preencha todos os campos");
        }else{            
            EnviaOSproBanco.setIdCliente(getIdCliente());
            EnviaOSproBanco.setAcessorioOs(getAcessorioOs());
            EnviaOSproBanco.setEquipamentoOs(getEquipamentoOs());
            EnviaOSproBanco.setProblemaReclamadoOs(getProblemaReclamadoOs());
            EnviaOSproBanco.setNumeroSerieOs(getNumeroSerieOs());
            EnviaOSproBanco.setModeloEquipOs(getModeloEquipOs());
            EnviaOSproBanco.setMarcaEquipOs(getMarcaEquipOs());
            EnviaOSproBanco.setObsOs(getObsOs());
            EnviaOSproBanco.setId_os(getId_os());
            boolean status = EnviaOSproBanco.GravaOs();
            if(status == true){
                JOptionPane.showMessageDialog(null, "OS Gravada com sucesso");
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja imprimir a OS?","Imprimir?",JOptionPane.YES_NO_OPTION);
                if(resposta == JOptionPane.YES_OPTION){
                    EnviaOSproBanco.setId_os(getId_os());
                    EnviaOSproBanco.setIdCliente(getIdCliente());
                    EnviaOSproBanco.Imprime();
                    return true;
                }                              
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Falha na criação da O.S tente novamente");
                return false;
            }
            
        }
        return true;
    }
    public void fechaOs() throws SQLException{
        OrdemServicoDAO fechaOs = new OrdemServicoDAO();
        fechaOs.setId_os(getId_os());
        fechaOs.fechaOs();
    }
    public String[] visualizaOs() throws SQLException{
        OrdemServicoDAO buscaDadosOs = new OrdemServicoDAO();
        String dadosOs[] = new String[18];
        buscaDadosOs.setId_os(getId_os());
        buscaDadosOs.setIdCliente(getIdCliente());
        buscaDadosOs.visualizaOs();
        dadosOs = buscaDadosOs.visualizaOs();
        //JOptionPane.showMessageDialog(null, dadosOs);
        return dadosOs;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
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
