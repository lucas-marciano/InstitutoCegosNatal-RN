/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import entidades.Pessoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import entidades.Aluno;
/**
 *
 * @author Lucas
 */
public class AlunoControlador implements Pessoa{
    public static void cadastrar(Aluno a)throws SQLException{
        try{
            Connection conexao = Controladora.conectar();
            Statement stat = conexao.createStatement();
            String sql = "insert into aluno()values(campos);";
        }catch(SQLException se){
            throw new SQLException("Erro ao conectar o banco de dados: " + se.getMessage());
        }
    }
}
