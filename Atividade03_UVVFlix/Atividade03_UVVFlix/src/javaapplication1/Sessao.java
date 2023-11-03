package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String codigo;
    private boolean statusSessao;
    private String horario;
    private boolean sala3d;
    private Filme filme;
    
    //relação 1 para n com Filme
    List<Filme> filmesList = new ArrayList<>();

    public Sessao(String codigo, String horario, Filme filme) {
        this.codigo = codigo;
        this.horario = horario;
        this.filme = filme;
    }
   
	//metodo para retornar lista de filmes
    public List<Filme> getfilmesList(){
    	return filmesList;
    	
        }	
    // metodo para adicionar itens na lista
    	public void addFilmesList(int idFilme, String titulo, long duracao, String genero) {
    		filmesList.add(new Filme(idFilme, titulo, duracao, genero));
    	}
    	
    //metodo construtor sala sem parametros
    public Sessao() {
    		
    }
    	
    
  //construtor Sessao para usar na lista
    public Sessao(boolean statusSessao, String horario, boolean sala3d) {
    	this.statusSessao = statusSessao;
    	this.horario = horario;
    	this.sala3d = sala3d;
    	
    }
	 	

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setNomeFilme(Filme filme) {
        this.filme = filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
   
}