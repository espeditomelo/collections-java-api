package main.java.list.OperacoesBasicas;

public class main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarfa("Arrumar o quarto");
        listaTarefas.adicionarTarfa("Fazer o cuscuz");
        listaTarefas.adicionarTarfa("Fazer o cuscuz");

        System.out.println("O numero total de tarefas é " + listaTarefas.totalTarefas());


        listaTarefas.listarDescricaoTarefas();

        listaTarefas.removerTarefa("Fazer o cuscuZ");

        System.out.println("O numero total de tarefas é " + listaTarefas.totalTarefas());

        listaTarefas.listarDescricaoTarefas();

    }
}
