package geraos;

import org.postgresql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.postgresql.Driver;

public class conexaoBanco {

    public String var1;
    public int var2;
    public String var3;
    public String var4;
       
    public void insereDado(String namecliente, String tel1, String tel2, String obsCliente, String date, String model, String marca, String obsProdut, String tip_prod, String tip_serv, String detalheServ) {
        try {
            String url = "jdbc:postgresql://localhost:5432/OS";
            String usuario = "postgres";
            String senha = "123";

            Class.forName("org.postgresql.Driver");
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            Statement stm = con.createStatement();
            
            ResultSet rset = stm.executeQuery("SELECT numero_os FROM ordem");
            while (rset.next()) {                
                var2 = rset.getInt(1);
                
            }
            var2 = var2 + 1;
            stm.executeUpdate("INSERT INTO ordem(nomecliente,telefone1,telefone2,obscliente,hr_os,numero_os) VALUES('"+namecliente+"','"+tel1+"','"+tel2+"','"+obsCliente+"','"+date+"','"+var2+"')");
            stm.executeUpdate("INSERT INTO detalhesproduto(modeloproduto,marcaproduto,detalheproduto,fk_cod_ordem) VALUES('"+model+"','"+marca+"','"+obsProdut+"','"+var2+"')");
            stm.executeUpdate("INSERT INTO infservicos(fk_cod_os_servico,tipo_servico,tipo_produto,detalhe_servico) VALUES ('"+var2+"','"+tip_serv+"','"+tip_prod+"','"+detalheServ+"')");
            
            //ResultSet rset = stm.executeQuery("SELECT nomecliente,obscliente,telefone1,telefone2,cod_os FROM ordem");
            
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

}
    public int retornaNumOs(){
        
        return var2;
    }
public void buscaNumOS() {
        try {
            String url = "jdbc:postgresql://localhost:5432/OS";
            String usuario = "postgres";
            String senha = "123";

            Class.forName("org.postgresql.Driver");
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            Statement stm = con.createStatement();

            ResultSet rset = stm.executeQuery("SELECT numero_os FROM ordem");
            while (rset.next()) {                
                var2 = rset.getInt(1);
                
            }
            
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
}
