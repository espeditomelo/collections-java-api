package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContato;

    public AgendaContatos(){
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContato.put(nome, telefone);
    }

    public Map<String, Integer> exibirContatos(){
        return agendaContato;
    }

    public void removerContato(String nome){
        if(!agendaContato.isEmpty()){
            agendaContato.remove(nome);
        }
    }

    public Integer pesquisarNumeroPorNome(String nome){
        Integer telefonePesquisado = null;
        if(!agendaContato.isEmpty()){
            telefonePesquisado = agendaContato.get(nome);
        }
        return telefonePesquisado;
    }

}
