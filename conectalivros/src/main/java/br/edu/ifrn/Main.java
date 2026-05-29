package br.edu.ifrn;

public class Main {
    public static void main(String[] args) {
        //criando um livro
        Livros livro1 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        //criando o serviço de livros
        LivrosService livrosService = new LivrosService();
        //cadastrando o livro
        livrosService.cadastrarLivro(livro1);   
    }
}