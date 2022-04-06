package Aula05;

import java.util.Random;

/*Escreva uma função que copie o conteúdo de uma lista
vetor para uma lista encadeada preservando a ordem dos elementos*/

public class Ex012 {
    public static void main(String[] args) {
        ListaLigada LL = new ListaLigada();
        ListaVetor LV = new ListaVetor();

        for (int i = 0; i < 10; i++) {
            LV.adicionar(getNumeroAletorio());
        }

        for (int i = 0; i < LV.tamanho(); i++) {
            LL.adicionar(LV.pegar(i));;
        }

        System.out.print("Lista Vetor:\t");
        LV.mostrarTodos();
        System.out.println();
        System.out.print("Lista Ligada:\t");
        LL.mostrarTodos();
    }

    public static int getNumeroAletorio () {
        Random rand = new Random();
        return rand.nextInt(100);
    }
} 