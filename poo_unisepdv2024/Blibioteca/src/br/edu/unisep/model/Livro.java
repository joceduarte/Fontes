package br.edu.unisep.model;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;

    public Livro(int id, String titulo, Autor autor)
    {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
