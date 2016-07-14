
package DAO;

import Controller.validaCadastroCliente;
import Model.EntidadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClientesDAO extends EntidadeConexao{
    private String Nome,Telefone,Celular,CpfCnpj,Endereco,Numero,Bairro,Cidade,Estado;    
    private Boolean statusCadastro;
    public void cadastraCliente()throws SQLException{
        Connection conexao = abreConexao();
        validaCadastroCliente retornaStatusEMensagem = new validaCadastroCliente();
        PreparedStatement prs = null;
        String sql = "INSERT INTO cadastro_clientes(nome,telefone,celular,endereco,cpfcnpj,bairro,cidade,estado,numero) "
                + "VALUES ('"+getNome()+"','"+getTelefone()+"','"+getCelular()+"','"+getEndereco()+"','"+getCpfCnpj()+"','"+getBairro()+"','"+getCidade()+"','"+getEstado()+"','"+getNumero()+"')";
        try{
            prs = conexao.prepareStatement(sql);
            prs.executeUpdate();
            statusCadastro = true;
            retornaStatusEMensagem.setStatusCadastro(statusCadastro);
            retornaStatusEMensagem.enviaStatusPraView();
        }catch(SQLException e){
            statusCadastro = false;
            retornaStatusEMensagem.setStatusCadastro(statusCadastro);
            retornaStatusEMensagem.enviaStatusPraView();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }finally{
            prs.close();
            conexao.close();
        }
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
    
    
}
