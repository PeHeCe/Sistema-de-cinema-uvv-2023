package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private int idFilme;
    private String titulo;
    private long duracao;
    private String genero;
    
    //relacao n para n com Ator
    List<Ator> atorList = new ArrayList<>();

  //construtor filme para usar na lista
    public Filme(int idFilme2, String titulo2, long duracao2, String genero2) {
    	this.idFilme = idFilme2;
    	this.titulo = titulo2;
    	this.duracao = duracao2;
    	this.genero = genero2;
    	
	}
    
    
    //metodo para retornar a lista de atores
    public List<Ator> getatorList(){
    	return atorList;
    }
    
    //// metodo para adicionar itens na lista
    public void addAtorList(int idAtor, String nome, String papel) {
    	atorList.add(new Ator(idAtor, nome, papel));
    	
    }
    
    //construtor para usar na lista
	public Filme() {
		
	}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }

	public int getIdFilme() {
		return idFilme;
	}

	public String getGenero() {
		return genero;
	}
	
}
