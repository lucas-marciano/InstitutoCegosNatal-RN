/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author Lucas
 */
public class Aluno extends Pessoa{
    private String profPai;
    private String profMae;
    private String id_aluno;

    public String getProfPai() {
        return profPai;
    }

    public void setProfPai(String profPai) {
        this.profPai = profPai;
    }

    public String getProfMae() {
        return profMae;
    }

    public void setProfMae(String profMae) {
        this.profMae = profMae;
    }

    public String getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(String id_aluno) {
        this.id_aluno = id_aluno;
    }
    
    
}
