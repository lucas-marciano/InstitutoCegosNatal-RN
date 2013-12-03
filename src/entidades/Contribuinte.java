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
public class Contribuinte {
    private String nome;
    private String dataInscricao;
    private String telefone;
    private String tipoContribuicao;
    private String endereco;
    private float valorContribuicao;
    private String localCorrespondencia;
    private String endTrabalho;
    private int id_cont;

    public int getId_cont() {
        return id_cont;
    }

    public void setId_cont(int id_cont) {
        this.id_cont = id_cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return dataInscricao;
    }

    public void setData(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoContribuicao() {
        return tipoContribuicao;
    }

    public void setTipoContribuicao(String tipoContribuicao) {
        this.tipoContribuicao = tipoContribuicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValorContribuicao() {
        return valorContribuicao;
    }

    public void setValorContribuicao(float valorContribuicao) {
        this.valorContribuicao = valorContribuicao;
    }

    public String getLocalCorrespondencia() {
        return localCorrespondencia;
    }

    public void setLocalCorrespondencia(String localCorrespondencia) {
        this.localCorrespondencia = localCorrespondencia;
    }

    public String getEndTrabalho() {
        return endTrabalho;
    }

    public void setEndTrabalho(String endTrabalho) {
        this.endTrabalho = endTrabalho;
    }
}
