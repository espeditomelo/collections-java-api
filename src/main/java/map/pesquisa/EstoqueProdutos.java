package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos(){
        estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProdutos.put(codigo, new Produto(nome, preco, quantidade));
    }

//    public void exibirProdutos(){
//        System.out.println(estoqueProdutos);
//    }

    public Map<Long, Produto> exibirProdutos(){
        return estoqueProdutos;
    }


    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getPreco() > precoMaisCaro){
                    precoMaisCaro = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMenosCaro(){
        Produto produtoMenosCaro = null;
        double precoMenosCaro = Double.MAX_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if(p.getPreco() < precoMenosCaro){
                    precoMenosCaro = p.getPreco();
                    produtoMenosCaro = p;
                }
            }
        }
        return produtoMenosCaro;
    }
}
