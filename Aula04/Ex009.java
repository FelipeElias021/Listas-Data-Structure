package Aula04;

import java.util.ArrayList;
import java.util.LinkedList;

/*Explique por que no 1º add não deu tanta diferença
de tempo quanto no 2º add entre o ArrayList e LInkedList*/

/*No primeiro add é apenas adicionar o valor no final, já no segundo add esse 
valor está sendo adicionado no começo, assim na lista ele apenas insere o valor 
no começo com a posição do próximo elemento, já no Array ele tem que mover para 
frente os 100000 valores para assim adicionar o valor desejado, ou seja, ele 
tem que percorrer 100000 posições do vetor no primeiro loop para adicionar o valor, 
100000 vezes, e a distância percorrida so aumenta a cada elemento adicionado, no último loop, 
o programa vai ter que percorrer quase 200000 para adicionar o valor no começo.*/

public class Ex009 {
    public static final int repeticoes = 100000;

    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < repeticoes; i++) {
            arrayList.add(i);
        }
        tempoInicio = mostrarTempo("ArrayList primeiro add: ", tempoInicio);
        for (int i = 0; i < repeticoes; i++) {
            linkedList.add(i);
        }
        tempoInicio = mostrarTempo("LinkedList primeiro add: ", tempoInicio);
        for (int i = 0; i < repeticoes; i++) {
            arrayList.add(0, i);
        }
        tempoInicio = mostrarTempo("ArrayList segundo add: ", tempoInicio);
        for (int i = 0; i < repeticoes; i++) {
            linkedList.add(0, i);
        }
        tempoInicio = mostrarTempo("LinkedList segundo add: ", tempoInicio);
    }

    private static long mostrarTempo(String frase, long tempoInicio) {
        long tempoFim = System.currentTimeMillis();
        System.out.println(frase + (tempoFim - tempoInicio));
        return System.currentTimeMillis();
    }
}
