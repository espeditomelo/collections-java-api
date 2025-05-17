package main.java.list.ordenacao;

public class mainOrdenacao {

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Jose", 23, 1.78);
        ordenacaoPessoas.adicionarPessoa("Joao", 62, 1.89);
        ordenacaoPessoas.adicionarPessoa("Pedro", 49, 1.63);
        ordenacaoPessoas.adicionarPessoa("Tiago", 24, 1.67);
        ordenacaoPessoas.adicionarPessoa("Felipa", 28, 1.98);

        System.out.println(ordenacaoPessoas.listarPessoas());

        System.out.println(ordenacaoPessoas.ordernarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());



    }
}
