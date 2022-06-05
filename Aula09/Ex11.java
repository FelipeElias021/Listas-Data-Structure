package Aula09;

import java.util.ArrayList;
import java.util.List;

/*Faça um programa que armazene o nome de cada membro da sua família em uma árvore genealógica. 

- Utilize uma árvore (não binária) como estrutura de dados

- Faça um método que receba um nome de uma pessoa como entrada e retorne como saída os nomes dos irmãos desta pessoa, caso tenha

- Faça um método que receba um nome de uma pessoa como entrada e retorne como saída os nomes dos tios desta pessoa, caso tenha*/

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Criando Pessoas...");
        Pessoa p1 = new Pessoa("Felipe");
        Pessoa p2 = new Pessoa("Liz");
        Pessoa p3 = new Pessoa("Leonardo");
        Pessoa p4 = new Pessoa("Bruna");
        Pessoa p5 = new Pessoa("João");
        Pessoa p6 = new Pessoa("Gustavo");
        Pessoa p7 = new Pessoa("Akali");
        Pessoa p8 = new Pessoa("Mord");
        System.out.println("Criando Relacionamentos Conjuges...");
        p1.setConjuge(p2);
        p2.setConjuge(p1);
        p4.setConjuge(p5);
        p5.setConjuge(p4);
        p7.setConjuge(p8);
        p8.setConjuge(p7);
        System.out.println("Criando relacionamento de filhos");
        List<Pessoa> f1 = new ArrayList<Pessoa>();
        f1.add(p3);
        f1.add(p4);
        p1.setFilhos(f1);
        p2.setFilhos(f1);
        System.out.println("Mostrando Árvore Inteira: ");
        p1.mostrarArvore();

    }
}
