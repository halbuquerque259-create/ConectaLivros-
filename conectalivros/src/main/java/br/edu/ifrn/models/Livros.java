package br.edu.ifrn;

public class Livros {
    //declaracao das variaveis
    private String titulo;
    private String autor;
    private int anoPublicacao;  
    private String genero;
    private ArrayList<Livros> ListaDeLivros; //lista para armazenar os livros cadastrados
    //construtor
    public Livros(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }   
    //getters e setters
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
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }       
    public ArrayList<Livros> getListaDeLivros() {
        return ListaDeLivros;
    }
    public void setListaDeLivros(ArrayList<Livros> listaDeLivros) {
        ListaDeLivros = listaDeLivros;
    }


}
