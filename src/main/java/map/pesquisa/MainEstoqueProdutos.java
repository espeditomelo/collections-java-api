package main.java.map.pesquisa;

public class MainEstoqueProdutos {
    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "tv", 200.33, 8);
        estoqueProdutos.adicionarProduto(2, "celular", 21.33, 10);
        estoqueProdutos.adicionarProduto(3, "radio", 2.33, 2);
        estoqueProdutos.adicionarProduto(4, "bike", 98.33, 18);
        estoqueProdutos.adicionarProduto(5, "ball", 10.33, 9);

        System.out.println(estoqueProdutos.exibirProdutos());

        System.out.println( "Valor total do estoque R$ " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("produto mais caro " + estoqueProdutos.obterProdutoMaisCaro().toString());

        System.out.println("Produto menos caro R$ " +  estoqueProdutos.obterProdutoMenosCaro().toString());

    }
}
