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
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int id;
    private Titulo id_titulo;
    private Registro id_registro;
    private RG id_rg;
    private CertificadoMilitar id_certificado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Titulo getId_titulo() {
        return id_titulo;
    }

    public void setId_titulo(Titulo id_titulo) {
        this.id_titulo = id_titulo;
    }

    public Registro getId_registro() {
        return id_registro;
    }

    public void setId_registro(Registro id_registro) {
        this.id_registro = id_registro;
    }

    public RG getId_rg() {
        return id_rg;
    }

    public void setId_rg(RG id_rg) {
        this.id_rg = id_rg;
    }

    public CertificadoMilitar getId_certificado() {
        return id_certificado;
    }

    public void setId_certificado(CertificadoMilitar id_certificado) {
        this.id_certificado = id_certificado;
    }
    
    
}
