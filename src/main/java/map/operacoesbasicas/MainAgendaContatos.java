package main.java.map.operacoesbasicas;

public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jose", 88234567);
        agendaContatos.adicionarContato("Joao", 99234567);
        agendaContatos.adicionarContato("Aldeir", 87234567);
        agendaContatos.adicionarContato("Zefinha", 88345567);
        agendaContatos.adicionarContato("Josefa", 93234567);
        agendaContatos.adicionarContato("Aldeir", 911119567);

        System.out.println(agendaContatos.exibirContatos());

        agendaContatos.removerContato("Jose");

        System.out.println(agendaContatos.exibirContatos());

        System.out.println(agendaContatos.pesquisarNumeroPorNome("Josefa"));


    }
}
