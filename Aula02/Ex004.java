package Aula02;

/*A população de um país era estimada em 50 milhões de
habitantes em janeiro de 1991. Estima-se que a cada ano a população
cresce 2% em relação ao ano anterior. Faça um programa (em Java ou em
C) que responda:
a) Qual era a população em janeiro de 1992. E em janeiro de 1994?
b) Em quantos anos, a partir de 1991, a população terá ultrapassado 60
milhões?
c) Em quantos anos a partir de 1991, a população terá dobrado?*/

public class Ex004 {
    private static double calcularPopulacao(int ano) {
        double populacaoBase = 50, crescimento = 1.02, populacao; 
        int anoInicial = 1991;
        
        populacao = populacaoBase;
        for (int i = 0; i < ano-anoInicial; i++) {
            populacao = populacao * crescimento;
        }
        return populacao;
    }

    private static int calcularAno(double populacaoFinal) {
        double populacao = 50, crescimento = 1.02; 
        int contAno = 0;

        while (populacao <= populacaoFinal) {
            populacao = populacao * crescimento;
            //System.out.println(populacao);
            contAno++;
        }

        return contAno;
    }

    public static void main(String[] args) {
        double populacaoEstimada;
        int anoFinal;
        
        //A)
        anoFinal = 1992;
        System.out.println("População em janeiro de 1992: " + calcularPopulacao(anoFinal) + " milhões de habitante");
        anoFinal = 1994;
        System.out.println("População em janeiro de 1994: " + calcularPopulacao(anoFinal) + " milhões de habitante");
        
        //B)
        populacaoEstimada = 60;
        System.out.println("Em " + calcularAno(populacaoEstimada) + " anos, a população será maior que 60 milhões");

        //C)
        populacaoEstimada = 50 * 2;
        System.out.println("Em " + calcularAno(populacaoEstimada) + " anos, a população será dobrada");
    }
}
