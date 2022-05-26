package edu.curso;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAOImpl implements ContatoDAO {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/agenda";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "123456";
    private Connection con = null;

    ContatoDAOImpl() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cadastrar(Contato c) {
        String sql = "INSERT INTO contatos (nome, telefone) ";
        sql += " VALUES ('" + c.getNome() + "', ";
        sql += " '" + c.getTelefone() + "')";
        System.out.println("Query preparada: " + sql);
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contato> consultar(String nome) {
        String sql = "SELECT * FROM contatos WHERE nome LIKE '%" + nome + "%'";
        List<Contato> contatos = new ArrayList<>();
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Contato c = new Contato();
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                contatos.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contatos;
    }
}
