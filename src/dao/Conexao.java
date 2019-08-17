package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Francisco Lcuas Sens e Patrick Nascimento
 */
public class Conexao {

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/teste_sql_injection", "root", "aluno");
    }
}
