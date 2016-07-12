package Model;
import Controller.ValidaLoginUsuario;
import DAO.EntidadeConexao;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDAO extends EntidadeConexao{
    private Boolean statusLogin;
    ValidaLoginUsuario retornaControle = new ValidaLoginUsuario();
    public void AutenticaLogin(String usuario, String senha) throws SQLException{
        ResultSet rset = null;
        PreparedStatement prs = null;
        String sql = "SELECT usuario,senha FROM usuario WHERE usuario = '"+usuario+"' and senha ='"+senha+"'";
        try{
            prs = abreConexao().prepareStatement(sql);
            rset = prs.executeQuery();
            if(rset.next() == true){
                rset.close();
                prs.close();                
                abreConexao().close();
                statusLogin = true;
                retornaControle.setStatus(statusLogin);
                retornaControle.statusDoLogin();
                
            }else{
                rset.close();
                prs.close();
                abreConexao().close();
                statusLogin = false;
                retornaControle.setStatus(statusLogin);
                retornaControle.statusDoLogin();
            }
        }catch(SQLException e){
            try{
                rset.close();
                prs.close();
                abreConexao().close();    
            }catch(SQLException e2){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }            
        }
    }
    
    
    /**
     *         Statement stmt = null;
        ResultSet rset = null;
        try{        
            stmt = abreConexao().createStatement();
            String sql = "SELECT usuario,senha FROM usuario WHERE usuario = '"+usuario+"' and senha ='"+senha+"'";
            rset = stmt.executeQuery(sql);
            if(rset.next() == true){                
                try{
                    rset.close();
                    stmt.close();
                    abreConexao().close();
                }catch(SQLException e3){
                    JOptionPane.showMessageDialog(null, e3.getMessage());
                    e3.printStackTrace();
                }
                statusLogin = true;
                retornaControle.setStatus(statusLogin);
                retornaControle.statusDoLogin();
                
            }else{
                statusLogin = false;
                retornaControle.setStatus(statusLogin);
                retornaControle.statusDoLogin();
            }
        }catch(SQLException e){
            try{
                rset.close();
                stmt.close();
                abreConexao().close();
            }catch(SQLException e2){
                JOptionPane.showMessageDialog(null, e2.getMessage());
            }
            
        }finally{
            rset.close();
            stmt.close();
            abreConexao().close();
        }
        
        
    }
     */
}
