package br.edu.ifrn.visualizacao;

public class ListaLivros {
    //exibindo os livros cadastrados
    public void exibirLivros() {
        //aqui voce pode exibir os livros cadastrados em uma lista ou tabela
        for (Livros livro : livro.getListaDeLivros()) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicacao: " + livro.getAnoPublicacao());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("-----------------------------");
        }   
    }   
}
