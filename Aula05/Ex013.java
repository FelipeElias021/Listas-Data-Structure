package Aula05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/*Escreva uma função que verifique se duas listas encadeadas
são iguais, ou melhor, se têm o mesmo conteúdo em todas as células
(nós), respeitando sua ordem. Obs.: tenha cuidado ao verificar se uma
sublista não é igual à lista.*/

public class Ex013 {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<Integer>();
        LinkedList<Integer> LL = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            AL.add(getNumeroAletorio());
            LL.add(getNumeroAletorio());
        }

        boolean equals = true;

        for (int i = 0; i < AL.size(); i++) {
            if (AL.get(i) != LL.get(i)) {
                equals = false;
                break;
            }
        }

        System.out.print("Lista Vetor:\t");
        for (Integer obj : AL) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.print("Lista Ligada:\t");
        for (Integer obj : LL) {
            System.out.print(obj + " ");
        }
        System.out.println();

        if (equals == true) {
            System.out.println("As 2 listas são iguais");
        } else {
            System.out.println("As 2 listas são diferentes");
        }
    }

    public static int getNumeroAletorio() {
        Random rand = new Random();
        return rand.nextInt(5);
    }
}
