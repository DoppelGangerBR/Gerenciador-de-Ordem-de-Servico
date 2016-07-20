
package DAO;

import Controller.validaCadastroCliente;
import Model.EntidadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


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
    public DefaultTableModel AlimentaTabelaClientes() throws SQLException{
        DefaultTableModel dm = new DefaultTableModel();
        Connection conexao = abreConexao();
        ResultSet rset = null;
        PreparedStatement prs = null;
        dm.addColumn("Código");
        dm.addColumn("Nome");
        dm.addColumn("Telefone");
        dm.addColumn("Celular");
        String sql = "SELECT * FROM cadastro_clientes";
        
        try{            
            prs = conexao.prepareStatement(sql);
            rset = prs.executeQuery();
            while(rset.next()){
                String IdCliente     = rset.getString(1);
                String NomeCliente   = rset.getString(2);
                String CelularC     = rset.getString(3);
                String TelefoneC     = rset.getString(4);
                dm.addRow(new String[]{IdCliente, NomeCliente,CelularC,TelefoneC});
            }
            rset.close();
            prs.close();
            conexao.close();
            return dm;
        }catch(SQLException e){
            e.getMessage();
            rset.close();
            prs.close();
            conexao.close();
        }        
        return null;
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
