package Aula01;

/*Escreva um aplicativo utilizando vetores que calcule e
mostre o salário dos funcionários abaixo em função das vendas;
Calculo do salário: 200 + 8% sobre as vendas brutas

Funcionário Vendas Brutas Salário
0           10 
1           200 
2           0 
3           1000 
4           100 */

public class Ex001 {
    public static void main(String[] args) {
        double[] vendas = { 10, 200, 0, 1000, 100};
        double[] salario = new double[6];
        System.out.println("Funcionário\tVendas Brutas\tSalário");
        for(int i = 0; i < vendas.length; i++) {
            salario[i] = 200 + (vendas[i] * 0.08);
            System.out.println(i +"\t\t" + vendas[i] + "\t\t" + salario[i]);
        }
    }
}
