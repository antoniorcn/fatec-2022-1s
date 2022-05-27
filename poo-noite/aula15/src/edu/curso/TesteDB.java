package edu.curso;

import java.sql.*;

public class TesteDB {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/videodb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "123456"; //"alunofatec";
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Biblioteca importada");
            Connection con =
                    DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
            System.out.println("Conectado com o banco de dados");
            // String sql = "INSERT INTO filmes (id, titulo, lancamento, tempo) ";
            // sql += " VALUES (1, 'TopGun Maverick', '2022-05-22', 130)";
            // sql += " VALUES (2, 'Dr. Estranho No Multiverso da Loucura', '2022-05-01', 170)";
            String sql = "SELECT * FROM filmes";
            PreparedStatement stmt = con.prepareStatement(sql);
            // stmt.executeUpdate();
            // System.out.println("Registro inserido com sucesso");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String titulo = rs.getString("titulo");
                Date lancamento = rs.getDate("lancamento");
                System.out.printf("Filme %s  lançado em %s%n", titulo, lancamento);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
