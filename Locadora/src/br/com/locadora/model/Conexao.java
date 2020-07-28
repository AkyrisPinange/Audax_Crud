package br.com.locadora.model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public final class Conexao {
  
    private static final String usuario = "postgres";
    private static final String senha = "1234";
    private static final String url = "jdbc:postgresql://127.0.0.1:5432/audax";
  
    public static Connection open() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
  
    public static void close(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }
  
    public static void close(Statement st, Connection conn) {
        close(null, st, conn);
    }
  
    public static void close(Connection conn) {
        close(null, null, conn);
    }
}