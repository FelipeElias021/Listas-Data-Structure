package Aula01;

public class Exemplo006 {
    public static void main(String[] args) {
        char[][] tabuleiro = {{'O', 'O', 'X'}, {' ', 'X', 'O'}, {'X', 'O', ' '}};
        for (int linha=0; linha<3; linha++) {
            for (int coluna=0; coluna<3; coluna++) {
                System.out.print(tabuleiro[linha][coluna]+" ");
            }
            System.out.println();
        }
    }
}
