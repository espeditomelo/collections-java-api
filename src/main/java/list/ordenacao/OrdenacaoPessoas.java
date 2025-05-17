package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> listarPessoas(){
        return listaPessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> listaPessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaPessoasPorIdade);
        return listaPessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaPessoasPorAltura, new ComparatorPorAltura());
        return listaPessoasPorAltura;
    }

}
