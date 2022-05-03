using System;
using System.Collections.Generic;

namespace Ex03
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Conversor de Inteiro para Decimal");
            Console.Write("Digite o número decimal: ");
            int num = int.Parse(Console.ReadLine());

            Stack<int> binario = new Stack<int>();
            
            while (num != 1)
            {
                binario.Push(num % 2);
                num /= 2;
                foreach (int n in binario)
                {
                    Console.Write(n + " ");
                }
                Console.WriteLine();
            }

            binario.Push(num);
            foreach (int n in binario)
            {
                Console.Write(n + " ");
            }
        }
    }
}
