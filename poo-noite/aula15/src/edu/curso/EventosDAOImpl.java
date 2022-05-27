package edu.curso;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventosDAOImpl implements EventosDAO {
    private final static String JDBC_CLASS = "org.mariadb.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/eventosdb?allowMultiQueries=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "123456";
    private Connection con;

    public EventosDAOImpl() {
        try {
            Class.forName(JDBC_CLASS);
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir(Evento e) {
        String sql = "INSERT INTO eventos (id, nome, data) ";
        sql += " VALUES (0, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, e.getNome());
            stmt.setDate(2, java.sql.Date.valueOf(e.getData()));
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Evento> consultar(String nome) {
        List<Evento> lista = new ArrayList<>();
        String sql = "SELECT * FROM eventos WHERE nome LIKE '%" + nome + "%'";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Evento evento = new Evento();
                evento.setNome(rs.getString("nome"));
                evento.setData(rs.getDate("data").toLocalDate());
                lista.add(evento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
