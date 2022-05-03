using System;
using System.Collections.Generic;

namespace Ex06
{
    class Torre
    {
        public Stack<int> pecas = new Stack<int>();

        public void GetAllPecas(int i)
        {
            Console.WriteLine($"Torre {i}: ");
            foreach (int pec in pecas)
            {
                Console.WriteLine("\t" + pec + " ");
            }
            Console.WriteLine();
        }

        public void Push (int n)
        {
            pecas.Push(n);
        }

        public int Peek()
        {
            if(pecas.Count == 0)
            {
                return 4;
                //Retorna 4, pois na função jogar() no Program, o 4 é maior que todos e deixa peça entrar
                //caso a torre seja vazia.
                //Se quisesse aumentar o número de discos no futuro, retornar o número de discos + 1.
                //Solução, adicionar um atributo para na hora de instanciar.
            } else
            {
                return pecas.Peek();
            }
        }

        public int Pop()
        {
            return pecas.Pop();
        }
    }
}
