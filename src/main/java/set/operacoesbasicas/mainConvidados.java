package main.java.set.operacoesbasicas;

public class mainConvidados {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Jose", "abc123");
        conjuntoConvidados.adicionarConvidado("Joao", "abc123");
        conjuntoConvidados.adicionarConvidado("Antonio", "ajc235");
        conjuntoConvidados.adicionarConvidado("Felipa", "aec284");

        System.out.println(conjuntoConvidados.listarConvidados());

        System.out.println(conjuntoConvidados.contarConvidados());

        System.out.println("================================================");

        conjuntoConvidados.removerConvidadoPorCodigoConvite("ajc235");

        System.out.println(conjuntoConvidados.listarConvidados());

        System.out.println(conjuntoConvidados.contarConvidados());

    }
}
