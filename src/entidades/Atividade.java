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
public class Atividade {
    private String id_atividade;
    private String nomeAtividade;
    private String descricao;

    public String getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(String id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
