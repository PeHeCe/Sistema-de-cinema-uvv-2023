package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class Ator {
    
    private int idAtor;
    private String nome;
    private String papel;
    

  //relacaoo n para n com Filme
    public List<Filme> at = new ArrayList<Filme>();
    
    
  //construtor Ator para usar na lista
    public Ator(int idAtor2, String nome, String papel) {
    	this.idAtor = idAtor2;
    	this.nome = nome;
    	this.papel = papel;
    	
    }

	public String getNome() {
		return nome;
	}


	public String getPapel() {
		return papel;
	}    
    
}
