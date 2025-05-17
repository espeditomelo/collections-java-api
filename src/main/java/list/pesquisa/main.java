package main.java.list.pesquisa;

public class main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O mundo de Sofia", "Jostner Garder", 1997);
        catalogoLivros.adicionarLivro("Reinações de Narizinho", "Monteiro Lobato", 1974);
        catalogoLivros.adicionarLivro("Através do Espelho", "Jostner Garder", 2001);
        catalogoLivros.adicionarLivro("Matemática da Emília", "Jostner Garder", 1975);
        catalogoLivros.adicionarLivro("Através do Espelho", "Jostner Garder", 2002);

        catalogoLivros.listarLivros();

        separador();

        System.out.println(catalogoLivros.pesquisarPorAutor("Monteiro Lobato"));

        separador();

        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(1974, 1993));

        separador();

        System.out.println(catalogoLivros.pesquisarPrimeiroLivroPorTitulo("Através do Espelho"));

    }

    public static void separador(){
        System.out.println("===========================================");
    }
}
