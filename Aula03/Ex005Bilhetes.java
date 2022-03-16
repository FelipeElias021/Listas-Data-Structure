package Aula03;

/*Escreva um programa (em Java) de reservas de bilhetes de
linha aérea.
O programa exibe um menu com as seguintes opções:
Reserva de bilhete, cancelamento de bilhete, verificação se um bilhete
está reservado para uma pessoa particular e exibição dos bilhetes. Utilize
ArrayList para representar os dados.
O bilhete corresponde a um número inteiro, então deve-se utilizar uma
lista de inteiros.*/

public class Ex005Bilhetes {
    public int Id;
    public String Nome;
    public boolean Cancelado;

    public Ex005Bilhetes(int id, String nome) {
        this.Id = id;
        this.Nome = nome;
        this.Cancelado = false;
    }

    public String GetBilhete() {
        String string = "#" + Id + " - " + Nome;
        return string;
    }

}