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
    private String nomeMae;
    private String nomePai;
    private String situacao;
    private String instAnterior;
    private String estadoInstAnterior;
    private String cidadeInstAnterior;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getInstAnterior() {
        return instAnterior;
    }

    public void setInstAnterior(String instAnterior) {
        this.instAnterior = instAnterior;
    }

    public String getEstadoInstAnterior() {
        return estadoInstAnterior;
    }

    public void setEstadoInstAnterior(String estadoInstAnterior) {
        this.estadoInstAnterior = estadoInstAnterior;
    }

    public String getCidadeInstAnterior() {
        return cidadeInstAnterior;
    }

    public void setCidadeInstAnterior(String cidadeInstAnterior) {
        this.cidadeInstAnterior = cidadeInstAnterior;
    }
    
    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

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
