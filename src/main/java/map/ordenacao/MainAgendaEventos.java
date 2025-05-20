package main.java.map.ordenacao;

import java.time.LocalDate;

public class MainAgendaEventos {
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.parse("2025-05-26"), "evento x", "show");
        eventos.adicionarEvento(LocalDate.of(2025, 05 , 22), "evento y", "show caneta azul");
        eventos.adicionarEvento(LocalDate.of(2025, 5, 21), "evento z", "show barto galeno");
        eventos.adicionarEvento(LocalDate.of(2025, 5, 10), "avento j", "show amado batista");

        System.out.println(eventos.exibirAgenda());

        eventos.exibirProximoEvento();

    }
}
