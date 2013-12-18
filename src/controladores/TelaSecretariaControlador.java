/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import dao.AlunoDAO;
import entidades.*;
import java.util.ArrayList;
import view.TelaSecretaria;

/**
 *
 * @author Lucas
 */
public class TelaSecretariaControlador {
    private TelaSecretaria telaSecretaria = null;
    public AlunoDAO daoaluno;
       
    public Aluno aluno;
    public CertificadoMilitar cm;
    public RG rg;
    public Titulo titulo;
    public Registro registro;
    
    public TelaSecretariaControlador(TelaSecretaria tela){
        this.telaSecretaria = tela;        
    }
    
    public TelaSecretaria getTela(){ 
	return this.telaSecretaria;
    }
    
    
    public void carregarDropBox(){
        ArrayList<String> estados = new ArrayList<>();
        //carregar a lista com os estados
        estados.add("AC");        estados.add("AL");        estados.add("AP");        estados.add("AM");
        estados.add("BA");        estados.add("CE");        estados.add("DF");        estados.add("ES");
        estados.add("GO");        estados.add("MA");        estados.add("MT");        estados.add("MS");
        estados.add("MG");        estados.add("PA");        estados.add("PB");        estados.add("PR");
        estados.add("PE");        estados.add("PI");        estados.add("RJ");        estados.add("RN");
        estados.add("RS");        estados.add("RO");        estados.add("RR");        estados.add("SC");
        estados.add("SP");        estados.add("SE");        estados.add("TO");
        
        //carregar os drop boxes da interface
        getTela().dropBoxEstadoTituloEleitoralAluno.removeAllItems();
        getTela().dropBoxEstadoTituloEleitoralAluno.addItem("Estados");
        for(int i=0; i<estados.size();i++){
            getTela().dropBoxEstadoTituloEleitoralAluno.addItem(estados.get(i).toString());
        }
        getTela().dropBoxEstadoTituloEleitoralAluno.setSelectedIndex(0);
        
        //------------------------------------------------------------
        getTela().dropBoxEstadoInstAnteriorlAluno.removeAllItems();
        getTela().dropBoxEstadoInstAnteriorlAluno.addItem("Estados");
        for(int i=0; i<estados.size();i++){
            getTela().dropBoxEstadoInstAnteriorlAluno.addItem(estados.get(i).toString());
        }
        getTela().dropBoxEstadoInstAnteriorlAluno.setSelectedIndex(0);
        //------------------------------------------------------------
        getTela().dropBoxEstadoTituloEleitoralAluno.removeAllItems();
        getTela().dropBoxEstadoTituloEleitoralAluno.addItem("Estados");
        for(int i=0; i<estados.size();i++){
            getTela().dropBoxEstadoTituloEleitoralAluno.addItem(estados.get(i).toString());
        }
        getTela().dropBoxEstadoTituloEleitoralAluno.setSelectedIndex(0);
        //------------------------------------------------------------
        getTela().dropBoxEstadoIdentidadeAluno.removeAllItems();
        getTela().dropBoxEstadoIdentidadeAluno.addItem("Estados");
        for(int i=0; i<estados.size();i++){
            getTela().dropBoxEstadoIdentidadeAluno.addItem(estados.get(i).toString());
        }
        getTela().dropBoxEstadoIdentidadeAluno.setSelectedIndex(0);
        //------------------------------------------------------------
        getTela().dropBoxEstadoAlunoRegNasc.removeAllItems();
        getTela().dropBoxEstadoAlunoRegNasc.addItem("Estados");
        for(int i=0; i<estados.size();i++){
            getTela().dropBoxEstadoAlunoRegNasc.addItem(estados.get(i).toString());

        }
        getTela().dropBoxEstadoAlunoRegNasc.setSelectedIndex(0);
        //------------------------------------------------------------
        getTela().dropBoxEstadoAluno.removeAllItems();
        getTela().dropBoxEstadoAluno.addItem("Estados");
        for(int i=0; i<estados.size();i++){
            getTela().dropBoxEstadoAluno.addItem(estados.get(i).toString());
        }
        getTela().dropBoxEstadoAluno.setSelectedIndex(0);
   }
    
   public Pessoa pegarCamposCadastroAluno(){
       aluno = new  Aluno();
       rg = new RG();
       registro = new Registro();
       titulo = new Titulo();
       cm = new CertificadoMilitar();
       
       //dados pessoas
       aluno.setNome(getTela().campoNomeAluno.getText());
       aluno.setCidade(getTela().campoCidadeAluno.getText());
       aluno.setTelefone(getTela().campoTelefoneAluno.getText());
       aluno.setCelular(getTela().campoCelularAluno.getText());
       aluno.setProfMae(getTela().campoProMae.getText());
       aluno.setProfMae(getTela().campoProPai.getText());
       aluno.setNomeMae(getTela().campoMaeAluno.getText());
       aluno.setNomePai(getTela().campoPaiAluno.getText());
       aluno.setEstado(null);
       
       //dados instituto anterior
       aluno.setInstAnterior(getTela().campoInstAnteriorAluno.getText());
       aluno.setCidadeInstAnterior(getTela().campoInstAnteriorCidadeAluno.getText());
       aluno.setEstadoInstAnterior(null);
       
       //dados registro de nascimento
       registro.setCartorio(getTela().campoCartorioAluno.getText());
       registro.setData(getTela().campoDataResNasciAluno.getText());
       registro.setEstado(null);
       registro.setCidade(getTela().campoCidadeResNascAluno.getText());
       registro.setId_registro(getTela().campoNumRegistro.getText());
       registro.setNlivro(getTela().campoLivroResNascAluno.getText());
       aluno.setId_registro(registro);
       
       //dados da identidade
       rg.setEstado(null);
       rg.setId_rg(getTela().campoIdentidadeAluno.getText());
       rg.setOrgaoExpedidor(getTela().campoOrgaoIdentidadeAluno.getText());
       aluno.setId_rg(rg);
       
       //dados titulo eleitoral
       titulo.setEstado(null);
       titulo.setId_titulo(getTela().campoNumTituloAluno.getText());
       titulo.setMunicipio(getTela().campoNumTituloCidadeAluno.getText());
       titulo.setSecao(getTela().campoNumTituloSecaoAluno.getText());
       titulo.setZona(getTela().campoNumTituloZonaAluno.getText());
       aluno.setId_titulo(titulo);
       
       //dados situação militar
       cm.setCategoria(getTela().campoCategoriaSMAluno.getText());
       cm.setDataExpedicao(getTela().campoDataExpedicaoSMAluno.getText());
       cm.setNumCartReservista(getTela().campoReservistaSMAluno.getText());
       cm.setSerie(getTela().campoSerieSMAluno.getText());
       cm.setUnidade(getTela().campoUnidadeSMAluno.getText());
       cm.setId_militar(getTela().campoNumeroCertidaoSMAluno.getText());
       aluno.setId_certificado(cm);
       
       
       return aluno;
   } 
   
   
  
}
