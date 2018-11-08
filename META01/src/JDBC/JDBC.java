package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBC {
    public static void main(String[] args) {
        String conexao = "valor";
        
        try {       
        Connection mysql = DriverManager.getConnection(
        "jdbc:mysql://localhost/Agenda",
                "root",
                "1q"
        );

       
        
    } catch (SQLException e) {
        System.out.println("Ocorreu um erro!");
        throw new RuntimeException(e.getMessage());
    }
    }
}
