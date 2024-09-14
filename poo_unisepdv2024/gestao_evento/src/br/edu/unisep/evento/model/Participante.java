package br.edu.unisep.evento.model;

public class Participante {
    private int id;
    private String nome;
    private String Email;
    private String Telefone;

    public Participante(int id, String nome, String email, String Telefone) {
        this.id = id;
        this.nome = nome;
        this.Email = email;
        this.Telefone = Telefone;
    }

    public int getId() {
        return id;
    }
    public void setId(int Id) {
        this.id = Id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
}