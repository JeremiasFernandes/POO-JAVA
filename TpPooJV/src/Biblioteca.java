package tppoo;
import java.util.ArrayList;

public class Biblioteca extends Entidade{
    
    //Atributos da classe-------------------------------------------------------
    private ArrayList<Livro> livros = new ArrayList ();
    private String nome;
    private int qtdLivro = 0;

    //Construtor----------------------------------------------------------------
    public Biblioteca(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    //Getters e Setters---------------------------------------------------------
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    @Override
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLivro() {
        return qtdLivro;
    }

    public void setQtdLivro(int qtdLivro) {
        this.qtdLivro = qtdLivro;
    }
    
    //Métodos-------------------------------------------------------------------
    
    //Adicionar um livro na lista de livros
    public void adicionarLivros(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro adicionado com sucesso!\n");
    }
    
    //Exibir lista de livros
    public boolean exibirLivro() {
        if(this.livros.size() == 0){
            System.out.println("Não existem livros cadastrados.\n");
        }
        else{
            for(Livro livro : this.livros){
                System.out.println("ID : " + livro.getId()+ "/" +" Título: "+
                livro.getTitulo()+ "/"  + " Autor: " +livro.getAutor()+"/" +
                " Ano de publicação: " + livro.getAno()+"/"+" Gênero:"+ 
                livro.getGenero()+"\n");
            }
            return true;
        }
        return false;
    }
    
    //Apagar um livro da lista de livros
    public void apagarLivro(int id, ArrayList<Livro> livros) {
        for(Livro livro : livros){
            if(livro.getId() == id){
                livros.remove(livro);
                break;
            }
        }
        System.out.println("Livro apagado com sucesso!\n");
    }
}

//------------------------------------------------------------------------------