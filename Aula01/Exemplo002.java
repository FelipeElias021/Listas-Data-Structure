package Aula01;

public class Exemplo002 {
    public static void main(String[] args) {
        int idade = 18;
        float altura = 1.78f;
        char letra = 'Y';
        boolean masculino = true;
        String nome = "Felipe Elias"; //Não é primitivo

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Letra: " + letra);
        System.out.println(masculino ? "Homem":"Mulher");
    }
}
