package tppoo;

public class Livro extends Entidade {
    
    //Atributos-----------------------------------------------------------------
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private int idBiblio;
    
    //Construtor----------------------------------------------------------------
     public Livro(int id, String titulo, String autor, int ano, String genero, 
             int idBiblio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.id = id;
        this.idBiblio = idBiblio;
    }

    //Setters e Getters---------------------------------------------------------
    public int getIdBiblio() {
        return idBiblio;
    }

    public void setIdBiblio(int idBiblio) {
        this.idBiblio = idBiblio;
    }
     
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getId() {
        return this.id;
    }

}

//------------------------------------------------------------------------------