package Aula01;

import java.util.Scanner;

public class Exemplo004 {
    public static void main(String[] args) {
        float[] temperaturas = new float[3];
        Scanner teclado = new Scanner(System.in);
        float soma = 0;
        for(int i=0; i<3; i++) {
            System.out.println("Digite a temperatura "+i+": ");
            temperaturas[i] = teclado.nextFloat();
            soma += temperaturas[i];
        }
        float media = soma / 3;
        System.out.println("Média das temperaturas: "+media);
        for(int i=0; i<=2; i++) {
            float diferenca = media - temperaturas[i];
            System.out.println("Diferença: "+diferenca);
        }
        teclado.close();
    }
}
