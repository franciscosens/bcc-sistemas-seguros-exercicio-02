/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flsens
 */
public class ClienteDAOQuestao03 {

    public List<Cliente> obterTodos(String busca) throws SQLException {
        busca = String.format("%%%s%%", busca);

        String query = "SELECT * FROM clientes WHERE registro_ativo = 1 AND nome LIKE ?";
        System.out.println("QUESTÃO 03: " + query);
        Connection conexao = Conexao.conectar();

        PreparedStatement ps = conexao.prepareStatement(query);
        ps.setString(1, busca);

        ResultSet resultSet = ps.executeQuery();
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
