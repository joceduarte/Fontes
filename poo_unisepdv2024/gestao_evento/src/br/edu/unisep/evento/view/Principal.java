package br.edu.unisep.evento.view;

import br.edu.unisep.evento.model.*;

import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Participante p1 = new Participante(1, "Lucas Viera", "Lucaviera4@gmail.com", "4699708843");

        Inscricao inscricao = new Inscricao(1, p1);

        Palestrante palestrante = new Palestrante(1, "Bruno", "Conversa Fiada");

        Sessao sessao = new Sessao(1, "Marketing", "Palestra referente a Marketing", Calendar.getInstance(), Calendar.getInstance(), palestrante, inscricao);

        Evento e = new Evento(1, "SW", Calendar.getInstance(), Calendar.getInstance(), "UNISEP", sessao);

        System.out.println("Ola, seja bem vindo ao Evento " +  e.getId() + " - " + e.getNomeEvento() + "\n" + "Temos a sessão " + e.getSessao().getTitulo() + "\n" + "Na sessão temos o palestrante " + e.getSessao().getPalestrante().getNome() + "\n" +
                "A especialidade dele é " + e.getSessao().getPalestrante().getEspecialidade() + "\n" +
                "E contamos com o participante " + e.getSessao().getInscricao().getParticipante().getNome()
        );
    }
}