package main.java.set.ordenacao;

public class MainProduto {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1, "tv plasma", 200.33, 2);
        produtos.adicionarProduto(2, "radio am/fm", 12.33, 8);
        produtos.adicionarProduto(3, "tv led", 300.33, 10);
        produtos.adicionarProduto(4, "tv oled", 400.33, 9);
        produtos.adicionarProduto(5, "antena", 522.33, 20);

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());

    }
}
