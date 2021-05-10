package io.github.brunobgcardoso.domain.repository;

import io.github.brunobgcardoso.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ClientesRepository {

    private static String INSERT = "INSERT INTO CLIENTE(NOME) VALUES(?)";
    private static String SELECT_ALL = "SELECT * FROM CLIENTE";
    private static String UPDATE = "UPDATE CLIENTE SET NOME = ? WHERE ID = ?";
    private static String DELETE = "DELETE FROM CLIENTE WHERE ID = ?";
    private static String FIND_BY_NAME = "SELECT * FROM CLIENTE WHERE NOME LIKE %?%";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente save(Cliente cliente){
        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()});
        return cliente;
    }

    public Cliente update(Cliente cliente){
        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome(), cliente.getId()});
        return cliente;
    }

    public void deletar(Integer id){
        jdbcTemplate.update(DELETE, new Object[]{id});
    }

    public List<Cliente> buscarPorNome(String nome){
        return jdbcTemplate.query(FIND_BY_NAME, getRowMapper());
    }

    public void deletar (Cliente cliente){
        deletar(cliente.getId());
    }

    public List<Cliente> getAll(){
        return jdbcTemplate.query(SELECT_ALL, getRowMapper());
    }

    private RowMapper<Cliente> getRowMapper() {
        return new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Cliente(resultSet.getString("NOME"), resultSet.getInt("Id"));
            }
        };
    }
}
