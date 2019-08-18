package dao;

import bean.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Francisco Lucas Sens e Patrick Nascimento
 */
public class ClienteDAOQuestao01 {

    public List<Cliente> obterTodos(String busca) throws SQLException {
        busca = String.format("%%%s%%", busca);

        String query = "SELECT * FROM clientes WHERE registro_ativo = 1 AND nome LIKE '" + busca + "'";
        System.out.println("QUESTÃO 01: " + query);
        Connection conexao = Conexao.conectar();
        Statement st = conexao.createStatement();

        ResultSet resultSet = st.executeQuery(query);
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            clientes.add(cliente);
        }
        return clientes;
    }

}
