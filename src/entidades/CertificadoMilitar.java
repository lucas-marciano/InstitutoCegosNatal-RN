/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;

/**
 *
 * @author Lucas
 */
public class CertificadoMilitar {
    private String id_militar;
    private String serie;
    private String unidade;
    private String numCartReservista;
    private String categoria;
    private String dataExpedicao;

    public String getId_militar() {
        return id_militar;
    }

    public void setId_militar(String id_militar) {
        this.id_militar = id_militar;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getNumCartReservista() {
        return numCartReservista;
    }

    public void setNumCartReservista(String numCartReservista) {
        this.numCartReservista = numCartReservista;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }
    
    
    
}
