package Controller;

import DAO.ClientesDAO;
import View.TelaCadastroAlteracaoVisualizacaoClientes;
import java.sql.SQLException;



public class ValidaCliente {
    private String Nome,Telefone,Celular,CpfCnpj,Endereco,Numero,Bairro,Cidade,Estado,Mensagem,TituloMensagem,id_cliente;    

    
    private Boolean statusCadastro;
    TelaCadastroAlteracaoVisualizacaoClientes retornoMensagens = new TelaCadastroAlteracaoVisualizacaoClientes();
    public void validaCadastroAlteracaoRemocao() throws SQLException{
        if(getNome().equals("") || getTelefone().equals("") || getCpfCnpj().equals("") || getNome() == null || getTelefone() == null || getCpfCnpj() == null){
            retornoMensagens.setStatus(false);
            retornoMensagens.setMensagem("Por favor, preencha todos os campos que possum (*)");
            retornoMensagens.exibeMensagens();
        }else{
            if(getId_cliente() == null){
                ClientesDAO gravaCliente = new ClientesDAO();                
                gravaCliente.setNome(getNome());
                gravaCliente.setTelefone(getTelefone());
                gravaCliente.setCelular(getCelular());
                gravaCliente.setCpfCnpj(getCpfCnpj());
                gravaCliente.setEndereco(getEndereco());
                gravaCliente.setEstado(getEstado());
                gravaCliente.setBairro(getBairro());
                gravaCliente.setNumero(getNumero());
                gravaCliente.setCidade(getCidade());
                gravaCliente.cadastraCliente();   
            }else{
                ClientesDAO AlteraCliente = new ClientesDAO();
                AlteraCliente.setId_cliente(getId_cliente());
                AlteraCliente.setNome(getNome());
                AlteraCliente.setTelefone(getTelefone());
                AlteraCliente.setCelular(getCelular());
                AlteraCliente.setCpfCnpj(getCpfCnpj());
                AlteraCliente.setEndereco(getEndereco());
                AlteraCliente.setEstado(getEstado());
                AlteraCliente.setBairro(getBairro());
                AlteraCliente.setNumero(getNumero());
                AlteraCliente.setCidade(getCidade());
                AlteraCliente.AlteraDadosCliente();
            }
        }
    }
    public void removeCliente() throws SQLException{
        ClientesDAO RemoCliente = new ClientesDAO();        
        RemoCliente.setId_cliente(getId_cliente());
        RemoCliente.removeCliente();
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
    public void enviaStatusPraView(){
        TelaCadastroAlteracaoVisualizacaoClientes retornaStatus = new TelaCadastroAlteracaoVisualizacaoClientes();
        retornaStatus.setStatus(getStatusCadastro());
        retornaStatus.exibeMensagens();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCpfCnpj() {
        return CpfCnpj;
    }

    public void setCpfCnpj(String CpfCnpj) {
        this.CpfCnpj = CpfCnpj;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Boolean getStatusCadastro() {
        return statusCadastro;
    }

    public void setStatusCadastro(Boolean statusCadastro) {
        this.statusCadastro = statusCadastro;
    }
    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    public String getTituloMensagem() {
        return TituloMensagem;
    }

    public void setTituloMensagem(String TituloMensagem) {
        this.TituloMensagem = TituloMensagem;
    }
    
}
