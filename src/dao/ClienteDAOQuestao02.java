/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flsens
 */
public class ClienteDAOQuestao02 {

    public List<Cliente> obterTodos(String busca) throws SQLException {
        busca = String.format("%%%s%%", busca);

        // TODO aplicar regex
        String query = "SELECT * FROM clientes WHERE registro_ativo = 1 AND nome LIKE '" + busca + "'";
        System.out.println("QUESTÃO 01: " + query);
        Connection conexao = Conexao.conectar();
        Statement st = conexao.createStatement();
        st.execute(query);

        ResultSet resultSet = st.getResultSet();
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
