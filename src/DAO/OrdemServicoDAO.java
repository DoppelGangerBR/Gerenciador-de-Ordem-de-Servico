
package DAO;

import Model.EntidadeConexao;
import java.sql.Connection;
import java.sql.SQLException;

public class OrdemServicoDAO extends EntidadeConexao{
    public void GravaOs() throws SQLException{
        Connection conexao = abreConexao();
    }
    
}
