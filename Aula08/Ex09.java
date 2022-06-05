package Aula08;

import java.util.Scanner;

/*A sequência de Fibonacci é dada pela seguinte sequência:
1, 1, 2, 3, 5, 8, 13, 21 ...
Ou seja, cada elemento é dado pela soma dos dois anteriores.
Crie um programa que utilizando um método recursivo calcule e mostre os
números da sequência de Fibonacci até o i-ésimo termo (i é digitado pelo
usuário)
*/

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o i-ésimo termo para o Fibonacci: ");
        int i = sc.nextInt();
        for (int j = 1; j <= i; j++) {
            System.out.print(fibo(j) + ", ");
        }
        sc.close();

    }

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
