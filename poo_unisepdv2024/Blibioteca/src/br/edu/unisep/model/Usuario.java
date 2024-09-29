package br.edu.unisep.model;

public class Usuario {
    private String nome;
    private int idUsuario;
    private String email;

    public Usuario(String nome, int idUsuario, String email)
    {
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
