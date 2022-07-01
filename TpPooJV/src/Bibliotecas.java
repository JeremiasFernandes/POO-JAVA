package tppoo;
import java.util.ArrayList;

public class Bibliotecas {
    
    //Atributos da classe-------------------------------------------------------
    private ArrayList<Biblioteca> bibliotecas = new ArrayList();
    private static int qtdBiblioteca = 0;
    
    //Getters e Setters---------------------------------------------------------
    public ArrayList<Biblioteca> getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(ArrayList<Biblioteca> bibliotecas) {
        this.bibliotecas = bibliotecas;
    }

    public static int getQtdBiblioteca() {
        return qtdBiblioteca;
    }

    public static void setQtdBiblioteca(int qtdBiblioteca) {
        Bibliotecas.qtdBiblioteca = qtdBiblioteca;
    }
    
    //Métodos-------------------------------------------------------------------
    
    //Adicionar biblioteca na lista de biblitecas
    public void adicionarBiblioteca(Biblioteca biblioteca) {
        this.bibliotecas.add(biblioteca);
        System.out.println("Biblioteca adicionado com sucesso!\n");
    }
    
    //Exibir lista de bibliotecas
    public boolean exibirBiblioteca() {
        if(this.bibliotecas.size() == 0){
            System.out.println("Não existem bibliotecas cadastrados.\n");
        }
        else{
            for(Biblioteca biblioteca : this.bibliotecas){
                System.out.println("ID : " + biblioteca.getId()+ "/" +" Nome:"
                        + " "+ biblioteca.getNome());
            }
            return true;
        }
        return false;
    }
    
    //Apagar uma biblioteca da lista de bibliotecas
    public void apagarBiblioteca(int id) {
        for(Biblioteca biblioteca : this.bibliotecas ){
            if(biblioteca.getId() == id){
                bibliotecas.remove(biblioteca);
                break;
            }
        }
    
    }
}

//------------------------------------------------------------------------------