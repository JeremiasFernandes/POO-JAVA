package tppoo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class BibliotecasInterface {
 
    public void interfaceMenu(Bibliotecas bibliotecas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        while(true){
            System.out.println("OPÇÕES");
            System.out.println("-------------------");
            System.out.println(" [0] - Sair \n [1] - Adicionar Biblioteca\n [2] "
                + "- Apagar Biblioteca \n [3] - Exibir Bibliotecas\n [4] Acessar "
                    + "Biblioteca");
            
            String Sop = scanner.nextLine();
            int op = 0;
            try{
            op = Integer.valueOf(Sop);
            }
            catch(IllegalArgumentException e){
                System.err.println("Opção inválida, tente novamente!"); 
                System.exit(0);

            }
            switch(op){
                case 1:
                    try{
                    System.out.println("Digite o nome da biblioteca");
                    String nome = scanner.nextLine();
                    Excecoes.verificarStrVazia(nome);
                 
                    int id = bibliotecas.getQtdBiblioteca();
                   
                    Biblioteca biblioteca = new Biblioteca(id, nome);
                    bibliotecas.adicionarBiblioteca(biblioteca);
                    bibliotecas.setQtdBiblioteca(bibliotecas.getQtdBiblioteca() + 1);
                    }
                    catch(IllegalArgumentException e) {
                        System.err.println("Caractére Inválido, tente novamente!"); 
                    }
                     break;
                    
                case 2:
                    try{
                        if(bibliotecas.exibirBiblioteca()== true){    
                            System.out.println("Digite o ID do biblioteca que deseja apagar");
                            String idS = scanner.nextLine();
                            int idBiblioteca = Integer.valueOf(idS);
                            if(Excecoes.verificarIdBiblioteca(idBiblioteca, bibliotecas.getBibliotecas()) == true) {
                                bibliotecas.apagarBiblioteca(idBiblioteca);
                            }
                        }
                    }
                    catch(IllegalArgumentException e) {
                        System.err.println("O id digitado não existe!"); 
                    }
                    break;
                case 3:
                    bibliotecas.exibirBiblioteca();
                    break;
                case 4:
                    try{
                        if(bibliotecas.exibirBiblioteca()== true){    
                            System.out.println("Digite o ID do biblioteca que deseja acessar");
                            String idS = scanner.nextLine();
                            int idBiblioteca = Integer.valueOf(idS);
                            if(Excecoes.verificarIdBiblioteca(idBiblioteca, bibliotecas.getBibliotecas()) == true) {
                                Biblioteca biblioteca = Excecoes.verificarBiblioteca(idBiblioteca, bibliotecas.getBibliotecas());
  
                                LivroInterface interLivro = new LivroInterface();
                                interLivro.interfaceMenu(biblioteca);
                            }
                            
                        }
                    }
                    catch(IllegalArgumentException e) {
                        System.err.println("O id digitado não existe!"); 
                    }
                    break;
                case 0:
                    //FECHAR O ARQUIVO ANTES DE ESCREVER
                    try{
                    new FileWriter("arquivo.txt").close();
                    }
                    catch(IOException e){
                        System.err.printf("Erro na abertura do arquivo: %s.\n",
                        e.getMessage());
                    }
                    for(Biblioteca biblioteca : bibliotecas.getBibliotecas()){
                    GerenciamentoArq.escreverNoArquivoLivro(biblioteca.getLivros(),
                    biblioteca);
                    }
                    GerenciamentoArq.escreverNoArquivoBiblioteca(bibliotecas.getBibliotecas()
                    , bibliotecas);
                    System.exit(0);
                default:
                    System.out.println("Opção inválida\n");
                    
            }
        }
        
    }
    
}
