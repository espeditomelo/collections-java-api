package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void listarLivros(){
        System.out.println(listaLivros);
    }

    public List<Livro> pesquisarPorAutor(String nomeAutor){
        List<Livro> listaLivrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAutor().equalsIgnoreCase(nomeAutor)){
                    listaLivrosPorAutor.add(l);
                }
            }
        }
        return listaLivrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> listaLivrosPorIntervaloDeAnos = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    listaLivrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return listaLivrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPrimeiroLivroPorTitulo(String titulo){
        Livro primeiroLivroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    primeiroLivroPorTitulo = l;
                    break;
                }
            }
        }
        return primeiroLivroPorTitulo;
    }

}
