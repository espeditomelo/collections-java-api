package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPesquisadosPorNome = new TreeSet<>(produtoSet);
        return produtosPesquisadosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPesquisadosPorPreco = new TreeSet<>(new ComparablePorPreco());
        produtosPesquisadosPorPreco.addAll(produtoSet);
        return produtosPesquisadosPorPreco;
    }


}
