package tppoo;
import java.util.Scanner;
public class LivroInterface {
 
    public void interfaceMenu(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        boolean sair = false;
        while(sair == false){
            System.out.println("OPÇÕES");
            System.out.println("-------------------");
            System.out.println("[0] - Sair \n [1] - Adicionar Livro\n [2] "
                + "- Apagar Livro \n [3] - Exibir Livros");
            String Sop = scanner.nextLine();
            int op = Integer.valueOf(Sop);
            switch(op){
                case 1:
                    try{
                    System.out.println("Digite o titulo do livro");
                    String titulo = scanner.nextLine();
                    Excecoes.verificarStrVazia(titulo);
                    
                    System.out.println("Digite o autor do livro");
                    String autor = scanner.nextLine();
                    Excecoes.verificarStrVazia(autor); 
                    Excecoes.verificarNumeroStr(autor);
                    
                    System.out.println("Digite o ano");
                    String anoS = scanner.nextLine();
                    Excecoes.verificarStrVazia(anoS);
                    Excecoes.verificarCharStr(anoS);  
                    
                    System.out.println("Digite o gênero");
                    String genero = scanner.nextLine();
                    Excecoes.verificarStrVazia(genero);
                    Excecoes.verificarNumeroStr(genero);
                    
                    int ano = Integer.valueOf(anoS);
                    int id = biblioteca.getQtdLivro();
                    int idBiblio = biblioteca.getId();
                    Livro livro = new Livro(id, titulo, autor, ano,genero, idBiblio);
                    biblioteca.adicionarLivros(livro);
                    biblioteca.setQtdLivro(biblioteca.getQtdLivro() + 1);
                    }
                    catch(IllegalArgumentException e) {
                        System.err.println("Caractére Inválido, tente novamente!"); 
                    }
                     break;
                    
                case 2:
                    try{
                        if(biblioteca.exibirLivro() == true){    
                            System.out.println("Digite o ID do livro que deseja apagar");
                            String idS = scanner.nextLine();
                            int idLivro = Integer.valueOf(idS);
                            if(Excecoes.verificarIdLivro(idLivro, biblioteca.getLivros()) == true) {
                                biblioteca.apagarLivro(idLivro, biblioteca.getLivros());
                            }
                        }
                    }
                    catch(IllegalArgumentException e) {
                        System.err.println("O id digitado não existe!"); 
                    }
                    break;
                case 3:
                    biblioteca.exibirLivro();
                    break;
                case 0:
                sair = true;
                break;
                default:
                    System.out.println("Opção inválida\n");
                    
            }
        }
        
    }
    
}
