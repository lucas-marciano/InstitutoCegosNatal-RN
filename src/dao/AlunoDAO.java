/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import controladores.TelaSecretariaControlador;
import entidades.Pessoa;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class AlunoDAO implements CRUDE{
    public TelaSecretariaControlador controladorAluno;
    @Override
    public void cadastrar() {
        Pessoa p = controladorAluno.pegarCamposCadastroAluno();
        try{
            Connection conexao = DAOPrincipal.conectar();
            Statement state = conexao.createStatement();
            String sql = "insert into aluno(nome,telefone)values(" + p.getNome() + "," + p.getTelefone() + ");";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro no banco de dados ao cadastrar: " + e.getMessage());
        }
    }

    @Override
    public void excluir(Pessoa p) {
        //fazer metodo no controlador que pegue os valores da tela de exclusão
        try{
            Connection conexao = DAOPrincipal.conectar();
            Statement state = conexao.createStatement();
            String sql = "delete from aluno where nome='" + p.getNome() + "';";
            state.execute(sql);
            state.close();
            conexao.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro no banco de dados ao excluir: " + e.getMessage());
        }
    }

    @Override
    public void pesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
