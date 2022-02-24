package Aula02;

import java.util.Scanner;

/*Uma pessoa vai escolher um plano de saúde entre duas opções:
A e B. Condições dos planos:
Plano A: cobra um valor fixo mensal de R$ 140,00 e R$ 20,00 por consulta num
certo período.
Plano B: cobra um valor fixo mensal de R$ 110,00 e R$ 25,00 por consulta num
certo período.
Temos que o gasto total de cada plano é dado em função do número de
consultas x dentro do período pré-estabelecido. Determine a função
correspondente a cada plano e faça um programa (em Java ou em C) que
verifique e informe qual plano é mais econômico com base no número de
consultas informadas pelo usuário.*/

public class Ex003 {
    private static double gastoPlano(int consultas, double fixo, double var) {
        return fixo + (consultas * var);
    }

    private static void resultado(int consultas) {
        double fixoA = 140, varA = 20, fixoB = 110, varB = 25;

        if (gastoPlano(consultas, fixoA, varA) > gastoPlano(consultas, fixoB, varB)) {
            System.out.println("O plano A é mais econômico!");
            System.out.println("Valor: R$ " + gastoPlano(consultas, fixoA, varA));
        } else if (gastoPlano(consultas, fixoA, varA) < gastoPlano(consultas, fixoB, varB)){
            System.out.println("O plano B é mais econômico!");
            System.out.println("Valor: R$ " + gastoPlano(consultas, fixoB, varB));
        } else {
            System.out.println("Os 2 planos vão ter o mesmo valor");
        }
    }

    public static void main(String[] args) {
        int consultas;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Total de consultas: ");
            consultas = entrada.nextInt();
        }
        
        resultado(consultas);
    }
}
