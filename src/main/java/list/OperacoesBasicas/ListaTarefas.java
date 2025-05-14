package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarfa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaTarefasParaRemocao = new ArrayList<>();
        for(Tarefa t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao))
                listaTarefasParaRemocao.add(t);
        }
        listaTarefas.removeAll(listaTarefasParaRemocao);
    }

    public int totalTarefas() {
        return listaTarefas.size();
    }

    public void listarDescricaoTarefas(){
        System.out.println(listaTarefas);
    }
}
