using System;

namespace Ex008
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] vetor = new int[10000];
            for (int i = 0; i < 10000; i++)
            {
                Random rd = new Random();
                int rand_num = rd.Next(0, 100000);
                vetor[i] = rand_num;
            }
        }
    }
}
