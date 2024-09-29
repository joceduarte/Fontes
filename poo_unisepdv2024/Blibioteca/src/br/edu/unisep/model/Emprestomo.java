package br.edu.unisep.model;

import java.util.Date;

public class Emprestomo {
    private int id;
    private Livro livro;
    private Usuario usuario;

    public Emprestomo(int id, Livro livro, Usuario usuario) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString()
    {
        return "Emprestimo: " + "\n" + this.livro.getTitulo() + "\n" + this.usuario.getNome();
    }
}
