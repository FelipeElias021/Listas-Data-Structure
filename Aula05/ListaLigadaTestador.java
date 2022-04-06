package Aula05;

public class ListaLigadaTestador {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println("Adicionando 5 elementos na lista: ");
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);
        lista.mostrarTodos();
        System.out.println("Adicionando um elemento no início da lista: ");
        lista.adicionar(0, 7);
        lista.mostrarTodos();
        System.out.println("Adicionando um elemento no meio da lista: ");
        lista.adicionar(3, 8);
        lista.mostrarTodos();
        System.out.println("Adicionando um elemento no final da lista: ");
        lista.adicionar(lista.tamanho(), 9);
        lista.mostrarTodos();
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.println("Elemento na posição 3: " + lista.pegar(3));
        System.out.println("Índice do número 30: " + lista.indiceDe(30));
        System.out.println("Contem o número 30: " + lista.contem(30));
        System.out.println("Removendo no início da lista: ");
        lista.remover(0);
        lista.mostrarTodos();
        System.out.println("Removendo no meio da lista: ");
        lista.remover(2);
        lista.mostrarTodos();
        System.out.println("Removendo no fim da lista: ");
        lista.remover(lista.tamanho() - 1);
        lista.mostrarTodos();
        System.out.println("Removendo todos os elementos da lista: ");
        lista.removerTodos();
        lista.mostrarTodos();
    }
}
