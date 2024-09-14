package br.edu.unisep.evento.model;
import java.sql.Time;
import java.util.Calendar;

public class Sessao {
    private int id;
    private String titulo;
    private String descricao;
    private Calendar horaInicio;
    private Calendar horaFim;
    private Palestrante palestrante;
    private Inscricao inscricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Calendar getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Calendar horaFim) {
        this.horaFim = horaFim;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public Sessao(int id, String titulo, String descricao, Calendar horaInicio, Calendar horaFim, Palestrante palestrante, Inscricao inscricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.palestrante = palestrante;
        this.inscricao = inscricao;
    }
}