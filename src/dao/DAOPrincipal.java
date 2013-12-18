/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class DAOPrincipal {
    private static final String URL = "jdbc:postgresql://localhost:5432/teste";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "admin";
    
    public static Connection conectar() throws SQLException{
        try{
           return DriverManager.getConnection(URL,USUARIO,SENHA);
        }catch(SQLException se){
           JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados: " + se.getMessage());
           throw new SQLException("Erro!");
        }
     
        
    }
}
