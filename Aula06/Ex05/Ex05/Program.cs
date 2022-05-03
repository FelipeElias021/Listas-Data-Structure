using System;
using System.Collections.Generic;

namespace Ex05
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um código Html");
            string codigo = Console.ReadLine();

            Stack<string> tags = new Stack<string>();



            for (int i = 0; i < codigo.Length; i++)
            {
                string tag;

                if (codigo[i] == '<' && codigo[i + 1] != '/')
                {
                    int j = 0;
                    while (codigo[i + j] != '>')
                    {
                        j++;
                    }
                    tag = codigo.Substring(i + 1, j - 1);
                    tags.Push(tag);
                }

                if (codigo[i] == '<' && codigo[i + 1] == '/')
                {
                    if (tags.Count > 0)
                    {
                        int j = 0;
                        while (codigo[i + j] != '>')
                        {
                            j++;
                        }
                        tag = codigo.Substring(i + 2, j - 2);

                        if (tag == tags.Peek())
                        {
                            tags.Pop();
                        }
                    }
                    else
                    {
                        Console.WriteLine("As tags estão INCORRETAS");
                        Environment.Exit(0);
                    }
                }
            }

            if (tags.Count == 0)
            {
                Console.WriteLine("As tags estão CORRETAS");
            } 
            else
            {
                Console.WriteLine("As tags estão INCORRETAS");
            }
        }
    }
}


