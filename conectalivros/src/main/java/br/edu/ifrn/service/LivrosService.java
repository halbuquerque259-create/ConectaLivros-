package br.edu.ifrn;

public class LivrosService {
    //metodo para cadastrar um livro
    public void cadastrarLivro(Livros livro) {
        //regras de negocio para cadastrar um livro
        //verificando se o livro esta em branco
        if (livro.getTitulo() == null || livro.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("O titulo do livro nao pode ser vazio.");
            return;
        }
        if (livro.getAutor() == null || livro.getAutor().isEmpty()) {
            throw new IllegalArgumentException("O autor do livro nao pode ser vazio.");
           
            return;
        }
        if (livro.getGenero() == null || livro.getGenero().isEmpty()) {
            throw new IllegalArgumentException("O genero do livro nao pode ser vazio.");
            return;
        }       

        //adicionando o livro a lista de livros cadastrados
        livro.getListaDeLivros().add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }
}
