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
public class Registro {
    private String estado;
    private String cidade;
    private String cartorio;
    private String n_livro;
    private String data;
    private String id_registro;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getN_livro() {
        return n_livro;
    }

    public void setN_livro(String n_livro) {
        this.n_livro = n_livro;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public String getNlivro() {
        return n_livro;
    }

    public void setNlivro(String n_livro) {
        this.n_livro = n_livro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getId_registro() {
        return id_registro;
    }

    public void setId_registro(String id_registro) {
        this.id_registro = id_registro;
    }
    
    
}
