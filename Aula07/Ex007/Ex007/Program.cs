using System;

namespace Ex007
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] vetor1 = new int[] { 2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1 };
            int[] vetor2 = new int[] { 2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1 };
            int[] vetor3 = new int[] { 2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1 };
            foreach (int num in vetor1)
            {
                Console.Write(num + " ");
            }
            Console.WriteLine("\n\n");
            Selection(vetor1);
            Console.WriteLine("\n\n");
            Bubble(vetor2);
            Console.WriteLine("\n\n");
            Insertion(vetor3);
        }

        static void Selection(int[] vet)
        {
            int trocas = 0;
            int comparacao = 0;
            for (int i = 0; i < vet.Length; i++)
            {
                int menor = vet[i];
                int indiceMenor = i;
                for (int j = i + 1; j < vet.Length; j++)
                {
                    if (menor > vet[j])
                    {
                        menor = vet[j];
                        indiceMenor = j;
                    }
                    comparacao++;
                }
                int helper = vet[i];
                vet[i] = menor;
                vet[indiceMenor] = helper;
                trocas++;
            }
            Console.WriteLine("Selection Sort:");
            foreach (int num in vet)
            {
                Console.Write(num + " ");
            }
            Console.WriteLine();
            Console.WriteLine($"Número de trocas: {trocas}");
            Console.WriteLine($"Número de comparações: {comparacao}");

        }

        static void Bubble(int[] vet)
        {
            int trocas = 0;
            int comparacao = 0;
            for (int i = 0; i < vet.Length; i++)
            {
                for (int j = 0; j < vet.Length - 1 - i; j++)
                {
                    if (vet[j] > vet[j + 1])
                    {
                        int helper = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = helper;
                        trocas++;
                    }
                    comparacao++;
                }
            }
            Console.WriteLine("Bubble Sort:");
            foreach (int num in vet)
            {
                Console.Write(num + " ");
            }
            Console.WriteLine();
            Console.WriteLine($"Número de trocas: {trocas}");
            Console.WriteLine($"Número de comparações: {comparacao}");
        }

        static void Insertion(int[] vet)
        {
            int trocas = 0;
            int comparacao = 0;
            for (int i = 1; i < vet.Length; i++)
            {
                int aux = vet[i];
                int j = i;
                while (j > 0 && vet[j - 1] > aux)
                {
                    vet[j] = vet[j - 1];
                    j--;
                    comparacao++;
                }
                vet[j] = aux;
                trocas++;
            }
            Console.WriteLine("Insertion Sort:");
            foreach (int num in vet)
            {
                Console.Write(num + " ");
            }
            Console.WriteLine();
            Console.WriteLine($"Número de trocas: {trocas}");
            Console.WriteLine($"Número de comparações: {comparacao}");
        }
    }
}
