package main.java.list.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        this.contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public Set<Contato> exibirContato(){
        return contatoSet;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPesquisadosSet = new HashSet<>();
        if(!nome.isEmpty() && !contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatosPesquisadosSet.add(c);
                }
            }
        }
        return contatosPesquisadosSet;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!nome.isEmpty() && !contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

}
