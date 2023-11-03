package javaapplication1;

import java.util.ArrayList;
import java.util.List;

import InOut1.InOut;
import java.util.HashMap;

public class Sala {
	// atributos da classe
	private int idSala;
	private int numAssentos;
	private String tipoTela;
	private String localizacao;
	private String nomeSala;
	private String nomeCinema;
	private int menu;
	private int infoSessao;
	

	// relação 1 para n com Sessao
	List<Sessao> sessaoList = new ArrayList<>();

	// metodo para retornar a lista de sessoes
	public List<Sessao> getsessaoList() {
		return sessaoList;
	}

	// metodo para adicionar itens na lista
	public void addSessaoList(Sessao s) {
		sessaoList.add(s);
	}
	

	// metodo main "principal", com mensagem de boas vindas
	public void Main(String nomeCinema) {
		String apresentacao = "Nós da " + nomeCinema
				+ " estamos muito animados com a sua vontade de nos conhecer ou nos visitar novamente, conheça a seguir um pouco de cada sala nossa!";
		this.nomeCinema = nomeCinema;
		InOut.MsgSemIcone("Bem vindo ao " + nomeCinema, apresentacao);
	}

	// metodo main construtor de cada sala
	public void setMain(int idSala, int numAssentos, String tipoTela, String localizacao) {
		this.idSala = idSala;
		this.numAssentos = numAssentos;
		this.tipoTela = tipoTela;
		this.localizacao = localizacao;
		this.nomeSala = "Sala " + idSala;

	}

	// metodo para pegar dados de cada sala e imprimir ao usuario
	public void getMain() {
		String condicaoAtual = "A sala " + idSala + " possui " + numAssentos
				+ " assentos, possui uma excelentíssima tela " + tipoTela + " e esta localizada em: " + localizacao;
		InOut.MsgSemIcone(nomeSala, condicaoAtual);

	}

	// metodo para retorna numero referente a escolha do usuario no menu
	void setmenu(int numeroMenu) {
		menu = numeroMenu;
	}

	int getmenu() {
    	return menu;
        	}
	
	//metodo para criar a interacaoo "comprar ingresso" para o cinema
        public void comprarIngresso() {
            String texto = "Escolha uma sessão: \n\n";
            
            //criando um dicionario para procurar filme por meio do codigo da sessao
            HashMap<String, String> sessaoFilme = new HashMap<>();

            for (Sessao sessao : sessaoList) {
                sessaoFilme.put(sessao.getCodigo(), sessao.getFilme().getTitulo());
                texto += "Sessão " + sessao.getCodigo() + " : " + sessao.getFilme().getTitulo() + "   " + sessao.getFilme().getDuracao() + " minutos \n";
            }
            
            //para retornar numero da sessao escolhida pelo usuario
            String numeroSessao = InOut.leString(texto);
            
            //mensagem de conclusao de compra
            InOut.MsgDeInformacao("Compra realizada", "Você comprou um ingresso para o filme " + sessaoFilme.get(numeroSessao) + "\nTenha um bom filme!" );
		
	}
        
        //metodo para criar a interacao "consultar filmes" 
        public void consultarFilmes() {
            String texto = "Estes são os filmes disponíveis: \n";
            
            //criando um dicionario para procurar um objeto filme por meio do codigo do filme
            HashMap<Integer, Filme> filmes = new HashMap<>();

            for (Sessao sessao : sessaoList) {
            	filmes.put(sessao.getFilme().getIdFilme(), sessao.getFilme());
                texto += "Filme " + sessao.getFilme().getIdFilme() + " : " + sessao.getFilme().getTitulo() + "   " + sessao.getFilme().getDuracao() + " minutos \n";
               
            }
            
            //retornar a lista de filmes disponiveis
            int filmesDisponiveis = InOut.leInt(texto);
            //retorna o filme escolhido
            Filme filmeEscolhido = filmes.get(filmesDisponiveis);
            
            String detalhamentoFilme = 
            	"Título: " + filmeEscolhido.getTitulo() + "\n" +
            	"Gênero: " + filmeEscolhido.getGenero() + "\n" +
            	"Duração: " + filmeEscolhido.getDuracao() + " minutos \n" + 
            	"Atores: \n";
            
            for (Ator ator : filmeEscolhido.getatorList()) {
            	detalhamentoFilme += ator.getNome() + ", " + ator.getPapel() + " \n";
            }
            
            InOut.MsgDeInformacao("Detalhamento do Filme", detalhamentoFilme);
        }
	
   }
    
	