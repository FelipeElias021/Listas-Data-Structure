package Aula02;

import java.util.Scanner;

/*Carlos é um técnico em eletrônica e presta serviços autônomos. Por
uma visita ele cobra R$ 40,00 mais R$ 5,00 por hora de trabalho. Quanto Carlos
irá cobrar por um trabalho que demorou 9 horas? Faça um programa (em Java
ou em C) que tenha uma função que faça o cálculo de orçamento e responda
com base nas horas de trabalho informadas pelo usuário.*/

public class Ex002 {
    private static double orcamento(double horas) {
        double salarioHora = 5, salarioBase = 40;
        
        return salarioBase + (salarioHora * horas);
    }

    public static void main(String[] args) {
        double horas;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Total de horas trabalhadas: ");
            horas = entrada.nextDouble();
        }

        System.out.println("Orçamento: R$ " + orcamento(horas));
    }
}
