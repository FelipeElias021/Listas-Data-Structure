using System;
using System.Collections.Generic;

namespace Ex01
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Olá, vamos verificar se sua palavra é um palíndromo?");
            Console.Write("Digite sua palavra: ");
            string palavra = Console.ReadLine().ToLower();

            Queue<char> fila = new Queue<char>();
            Stack<char> pilha = new Stack<char>();

            for (int i = 0; i < palavra.Length; i++)
            {
                fila.Enqueue(palavra[i]);
                pilha.Push(palavra[i]);
            }

            for (int i = 0; i < palavra.Length; i++)
            {
                Console.WriteLine($"{i + 1}ª Letra da palavra: {fila.Peek()}");
                Console.WriteLine($"{palavra.Length - i}ª Letra da palavra: {pilha.Peek()}");
                Console.WriteLine();

                if (fila.Dequeue() != pilha.Pop())
                {
                    Console.WriteLine("Programa encerrando, a palavra NÃO é um palíndromo");
                    Environment.Exit(0);
                }
            }

            Console.WriteLine($"A palavra {palavra} é um Palíndromo");


        }
    }
}
