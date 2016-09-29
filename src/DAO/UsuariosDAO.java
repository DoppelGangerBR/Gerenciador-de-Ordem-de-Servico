package DAO;
import Controller.ValidaLoginUsuario;
import Model.EntidadeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDAO extends EntidadeConexao{
    private Boolean statusLogin;
    ValidaLoginUsuario retornaControle = new ValidaLoginUsuario();
    public void AutenticaLogin(String usuario, String senha) throws SQLException{
        Connection conexao = abreConexao();
        ResultSet rset = null;
        PreparedStatement prs = null;
        String sql = "SELECT usuario,senha FROM usuario WHERE usuario = '"+usuario+"' and senha ='"+senha+"'";
        try{
            prs = conexao.prepareStatement(sql);
            rset = prs.executeQuery();
            if(rset.next() == true){
                statusLogin = true;
                retornaControle.setStatus(statusLogin);
                retornaControle.statusDoLogin();
            }else{
                statusLogin = false;
                retornaControle.setStatus(statusLogin);
                retornaControle.statusDoLogin();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            prs.close();
            rset.close();
            conexao.close();
        }
    }
}
