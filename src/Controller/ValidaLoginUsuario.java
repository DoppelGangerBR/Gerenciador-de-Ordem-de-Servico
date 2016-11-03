
package Controller;


import DAO.UsuariosDAO;
import View.Login;
import View.Principal;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ValidaLoginUsuario {
    private String usuario, senha;
    private Boolean status;

   
    public void ValidaLogin() throws SQLException{
        if(getSenha().equals("") || getUsuario().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos", "Erro", 0);
            new Login().setVisible(true);
        }else{
            UsuariosDAO tentaLogin = new UsuariosDAO();
            tentaLogin.AutenticaLogin(getUsuario(), getSenha());
        }
    }
    public void statusDoLogin(){
        if(getStatus() == true){
           Login retornaStatusDoControle = new Login();
           //retornaStatusDoControle.setMensagem("Entrou");
           //retornaStatusDoControle.exibeMensagens();
           retornaStatusDoControle.dispose();
           retornaStatusDoControle.setStatus(getStatus());
           retornaStatusDoControle.setStatus(true);
           new Principal().setVisible(true);
        }else if(getStatus() == false){
            Login retornaStatusDoControle = new Login();
            retornaStatusDoControle.setStatus(false);
            retornaStatusDoControle.setVisible(true);
            retornaStatusDoControle.setMensagem("Falha, usuario ou senha incorretos\n"
                    + "Por favor, tente novamente!");
            retornaStatusDoControle.exibeMensagens();
        }
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
