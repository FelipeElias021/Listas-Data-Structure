package Aula05;

import java.util.Random;

/*Escreva uma função que copie o conteúdo de uma lista
encadeada para uma lista vetor preservando a ordem dos elementos*/

public class Ex011 {
    public static void main(String[] args) {
        ListaLigada LL = new ListaLigada();
        ListaVetor LV = new ListaVetor();

        for (int i = 0; i < 10; i++) {
            LL.adicionar(getNumeroAletorio());
        }

        for (int i = 0; i < LL.tamanho(); i++) {
            LV.adicionar(LL.pegar(i));;
        }

        System.out.print("Lista Ligada:\t");
        LL.mostrarTodos();
        System.out.println();
        System.out.print("Lista Vetor:\t");
        LV.mostrarTodos();
    }

    public static int getNumeroAletorio () {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
