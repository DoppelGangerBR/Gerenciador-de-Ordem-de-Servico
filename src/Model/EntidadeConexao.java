
package Model;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class EntidadeConexao {
    private final String url = "jdbc:postgresql://localhost:5432/ordem_servico_db";
    private final String pass = "123";
    private final String user = "postgres";
    
    public Connection abreConexao() throws SQLException{
        return DriverManager.getConnection(url,user,pass);
    }

}
