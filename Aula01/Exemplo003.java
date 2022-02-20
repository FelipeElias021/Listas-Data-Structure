package Aula01;

public class Exemplo003 {
    public static void main(String[] args) {
        int[] idades = new int[6];
        idades[0] = 10;
        idades[1] = 14;
        idades[2] = 20;
        idades[3] = 9;
        idades[4] = 16;
        idades[5] = 22;
        for (int i=0; i<=5; i++) {
            System.out.println("Idade na posição "+i+" é "+idades[i]+" anos");
        }

        int[] idadesReduzido = { 10, 14, 20, 9, 16, 22 };
        for (int i : idadesReduzido) {
            System.out.println("Idade de "+i+" anos");
        }

    }
}
