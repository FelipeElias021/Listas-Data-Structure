using System;
using System.Collections.Generic;

/*Faça um programa (em Java ou C) que implemente o
famoso jogo da Torre de Hanói utilizando 3 pilhas. O jogo consiste em
uma base contendo três torres, em uma das quais são dispostos 3 discos
uns sobre os outros, em ordem crescente de diâmetro, de cima para
baixo. Objetivo: mover todos os discos para a torre da direita. Regras:
- O jogador deve mover um disco de cada vez, sendo que um disco
maior nunca pode ficar em cima de um disco menor.
- O jogador deve digitar o número da torre de origem e a de destino
para fazer a jogada
- O programa deve avisar se o jogador venceu*/

namespace Ex06
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Torre> torres = iniciar();
            
            while (!isGanhou(torres)) 
            {
                mostrarTorres(torres);
                Console.WriteLine("Torre de Origem: ");
                int to = int.Parse(Console.ReadLine());
                Console.WriteLine("Torre de Destino: ");
                int td = int.Parse(Console.ReadLine());

                jogar(torres, to -1, td -1);
                Console.WriteLine();
                Console.WriteLine();
            }


            Console.WriteLine("Você ganhou! Parabéns");
            mostrarTorres(torres);
        }

        static List<Torre> iniciar()
        {
            List<Torre> obj = new List<Torre>();
            for (int i = 0; i < 3; i++)
            {
                obj.Add(new Torre());
            }

            for (int i = 3; i > 0; i--)
            {
                obj[0].Push(i);
            }

            return obj;
        }

        static void mostrarTorres(List<Torre> obj)
        {
            for (int i = 0; i < 3; i++)
            {
                obj[i].GetAllPecas(i + 1);
            }
        }

        static void jogar(List<Torre> obj, int ori, int dest)
        {
            if (obj[ori].Peek() == 4)
            {
                Console.WriteLine("Torre de origem não tem nenhuma peça, tente novamente!");
            }

            if (obj[dest].Peek() > obj[ori].Peek())
            {
                obj[dest].Push(obj[ori].Pop());
            } 
            else
            {
                Console.WriteLine("A peça atual da torre de destino é menor do que a colocada, tente novamente!");
            }
        }

        static bool isGanhou(List<Torre> obj)
        {
            if (obj[1].pecas.Count == 3 || obj[2].pecas.Count == 3)
            {
                return true;
            } else
            {
                return false;
            }
        }
    }
}
