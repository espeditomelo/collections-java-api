package main.java.list.set.pesquisa;

public class mainContato {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 9800889);
        agendaContatos.adicionarContato("Jose", 9700888);
        agendaContatos.adicionarContato("Joab", 9600890);
        agendaContatos.adicionarContato("Jarbas", 9300881);

        System.out.println(agendaContatos.exibirContato());

        System.out.println(agendaContatos.pesquisarPorNome("Joab"));

        System.out.println(agendaContatos.atualizarNumeroContato("Jose", 98888111));

        System.out.println(agendaContatos.exibirContato());
    }
}
