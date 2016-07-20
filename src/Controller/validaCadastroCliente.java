package Controller;

import DAO.ClientesDAO;
import View.TelaCadastroClientes;
import java.sql.SQLException;

public class validaCadastroCliente {
    private String Nome,Telefone,Celular,CpfCnpj,Endereco,Numero,Bairro,Cidade,Estado,Mensagem,TituloMensagem;    

    
    private Boolean statusCadastro;
    TelaCadastroClientes retornoMensagens = new TelaCadastroClientes();
    public void validaCampos() throws SQLException{
        if(getNome().equals("") || getTelefone().equals("") || getCpfCnpj().equals("") || getNome() == null || getTelefone() == null || getCpfCnpj() == null){
            retornoMensagens.setStatusCadastro(false);
            retornoMensagens.setMensagem("Por favor, preencha todos os campos que possum (*)");
            retornoMensagens.exibeMensagens();
        }else{
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
            
        }
    }
    public void enviaStatusPraView(){
        TelaCadastroClientes retornaStatus = new TelaCadastroClientes();
        retornaStatus.setStatusCadastro(getStatusCadastro());
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
