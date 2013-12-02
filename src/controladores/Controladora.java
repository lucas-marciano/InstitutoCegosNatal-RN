/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Lucas
 */
public class Controladora {
    private static final String URL = "jdbc:mysql://localhost:3306/nomedobanco";
     private static final String USUARIO = "admin";
      private static final String SENHA = "admin";
    public static Connection conectar() throws SQLException{
        try{
            return DriverManager.getConnection(URL,USUARIO,SENHA);
        }catch(SQLException se){
            throw new SQLException("Erro ao conectar o banco de dados: " + se.getMessage());
        }
    }
}
