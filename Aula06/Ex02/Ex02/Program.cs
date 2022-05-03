using System;
using System.Collections.Generic;

namespace Ex02
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Livro> livro = new List<Livro>();

            livro.Add(new Livro(livro.Count, "O Livro", 0));
            livro.Add(new Livro(livro.Count, "Maquiavel", 0));
            livro.Add(new Livro(livro.Count, "The Box", 0));

            int id = GetLivro(livro);

            while (true)
            {
                Menu(livro[id].Nome);
                int opcao = int.Parse(Console.ReadLine());

                switch (opcao)
                {
                    case 1:
                        AddLivro(livro);
                        break;
                    case 2:
                        id = GetLivro(livro);
                        break;
                    case 3:
                        EntrarFila(livro[id]);
                        break;
                    case 4:
                        DevolverLivro(livro[id]);
                        break;
                    case 5:
                        livro[id].GetAllAlunos();
                        break;
                    case 6:
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine("Opção Inválida");
                        break;
                }
            }

        }

        static int GetLivro(List<Livro> obj)
        {
            int id = -1;
            while (id  < 0)
            {
                Console.WriteLine("\nDigite o Id do livro");
                Console.WriteLine("Caso queira ver todos os livros cadastrados digite -1");
                Console.WriteLine("E se quiser adicionar um livro digite -2");
                Console.Write("> ");
                id = int.Parse(Console.ReadLine());

                if (id == -1)
                {
                    GetAllLivro(obj);
                } else if (id == -2)
                {
                    AddLivro(obj);
                } else if (id < -2)
                {
                    Console.WriteLine("Opção Inválida!");
                }

                if (id > obj.Count - 1)
                {
                    id = -1;
                    Console.WriteLine("Id inválido, por favor digite um válido!");
                }
            }

            return id;
        }

        static void GetAllLivro(List<Livro> obj)
        {
            Console.WriteLine();
            foreach (Livro livro in obj)
            {
                Console.WriteLine(livro);
            }
        }

        static void Menu(string livro)
        {
            Console.WriteLine();
            Console.WriteLine($"Livro Selecionado: {livro}");
            Console.WriteLine("Selecione a opção: ");
            Console.WriteLine("> 1. Adicionar Livro");
            Console.WriteLine("> 2. Trocar Seleção de Livro");
            Console.WriteLine("> 3. Requisitar Livro");
            Console.WriteLine("> 4. Devolução do Livro");
            Console.WriteLine("> 5. Mostrar Fila");
            Console.WriteLine("> 6. Sair");
            Console.Write("> ");
        }

        static void AddLivro(List<Livro> obj)
        {
            Console.Write("\nNome do Livro: ");
            string nome = Console.ReadLine();

            obj.Add(new Livro(obj.Count, nome, Status.Disponível));

            Console.WriteLine("\nLivro Adicionado");
        }

        static void EntrarFila(Livro obj)
        {
            Console.Write("\nNome do Aluno: ");
            string nome = Console.ReadLine();

            obj.AddAlunoFila(nome);

            if (obj.Status == Status.Disponível)
            {
                obj.LivroDisponivel();
                obj.Status = Status.Indisponível;
                Console.WriteLine($"O livro estava disponível, {nome} está adquirindo conhecimento com ele agora");
            } else
            {
                Console.WriteLine($"O livro está indisponível na hora, você está na posição: {obj.Fila.Count}º");
            }
        }

        static void DevolverLivro(Livro obj)
        {
            obj.Locatario = null;
            obj.LivroDisponivel();
            if (obj.Locatario == null)
            {
                obj.Status = Status.Disponível;
                Console.WriteLine("Não havia ninguém na fila, o livro está disponível!");
            } else
            {
                Console.WriteLine($"O livro agora é do aluno {obj.Locatario}");
            }
        }
    }
}
