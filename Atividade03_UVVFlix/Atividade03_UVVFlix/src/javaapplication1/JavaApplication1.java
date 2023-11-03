package javaapplication1;

import InOut1.InOut;

public class JavaApplication1 {

    
    public static void main(String[] args) {
    	
    	
        //instanciando main
        Sala s01 = new Sala();
        s01.Main("UVVflix");
        s01.setMain(01, 50, "oled", "Bloco 01 - UVVflix") ;
        s01.getMain();
        
        //instanciando main
        Sala s02 = new Sala();
        s02.setMain(02, 40, "led", "Bloco 02 - UVVflix");
        s02.getMain();
        
        //instanciando main
        Sala s03 = new Sala();
        s03.setMain(03, 70, "Super amoled", "Bloco 03 - UVVflix");
        s03.getMain();
        
        //
        //criando lista de sessoes 
        //
        Sala selist01 = new Sala();
        
        Sala selist02 = new Sala();
        
        Sala selist03 = new Sala();
        
        //
        //criando lista de Ator(id do ator, nome do ator e )
        //
        Filme atlist01 = new Filme(1, "Era uma vez", 90, "Fantasia");
        atlist01.addAtorList(497, "Henrique Gomes", "protagonista");
        atlist01.addAtorList(497, "Camila Sousa", "co-protagonista");
        atlist01.addAtorList(497, "Luis Almeida", "coadjuvante");
        
        Filme atlist02 = new Filme(2, "Quando eu Gostava de Trabalhar", 110, "Comédia");
        atlist02.addAtorList(981, "Lucas Alves", "protagonista");
        atlist02.addAtorList(981, "Mario Freitas", "coadjuvante");
        
        Filme atlist03 = new Filme(3, "Universidade para Loucos", 120, "Ação");
        atlist03.addAtorList(465, "Helena Lima", "protagonista");
        atlist03.addAtorList(465, "Pedro Cardoso", "co-protagonista");
        atlist03.addAtorList(465, "Vinicius Bruno", "co-protagonista");
        
        
        Sessao filist01 = new Sessao("02", "11:00", atlist01);
        
        Sessao filist02 = new Sessao("01", "14:30", atlist02);
        
        Sessao filist03 = new Sessao("03", "15:00", atlist03);
        

        //
        //adicionando lista de filmes na lista de Sessoes para usar no metodo comprar ingresso
        //
        selist01.addSessaoList(filist01);
        selist01.addSessaoList(filist02);
        selist01.addSessaoList(filist03);
        
        selist02.addSessaoList(filist01);
        selist02.addSessaoList(filist02);
        selist02.addSessaoList(filist03);

        //loop de interação com o usuario
        while(true) {
        	
        	//coleta de informação do usuario
        int opcao = InOut.leInt("Este é o nosso menu de opções, digite um número para prosseguir:"
        		+ "\n 0 \t REVER DESCRIÇÃO DAS SALAS"
        		+ "\n 1 \t COMPRAR INGRESSO"
        		+ "\n 2 \t CONSULTAR FILMES"
        		+ "\n 3 \t MENU"
        		+ "\n 4 \t SAIR");
        
        //tratamento do destino do usuario de acordo com a entrada de dados do mesmo
        //COMPRAR INGRESSO
        if (opcao == 1) {
            selist01.comprarIngresso();
        }
        //MENU
        else if (opcao == 3) {
            continue;//ignora o resto do codigo e continua do inicio do loop novamente
        }
        //CONSULTAR FILMES
        else if (opcao == 2) {
        	selist02.consultarFilmes();
        }
        //SAIR
        else if (opcao == 4) {
            InOut.MsgSemIcone("Esperamos revê-lo","Saindo do programa.");
            break; // Sai do loop quando o usuário inserir o número 4.
        }
        //REVER DESCRIÇÃO DAS SALAS
        else if (opcao == 0) {
        	s01.getMain();
        	s02.getMain();
        	s03.getMain();
        }
        else {
        	InOut.MsgSemIcone("ERRO","Opção nao reconhecida. Tente novamente.");
        }
        }
        }
    
    
    
}
