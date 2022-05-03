using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex02
{
    class Livro
    {
        public int Id { get; private set; }
        public string Nome { get; private set; }
        public Status Status { get; set; }
        public string Locatario { get; set; }

        public int I { get; set; }

        public Queue<Aluno> Fila { get; set; } = new Queue<Aluno>();

        public Livro(int id, string nome, Status status)
        {
            Id = id;
            Nome = nome;
            Status = status;
            I = -1;
        }

        public void AddAlunoFila(string nome)
        {
            Fila.Enqueue(new Aluno(SetIdAluno(), nome));
        }

        public int SetIdAluno()
        {
            I++;
            return I;
        }

        public void LivroDisponivel()
        {
            SetLocatario();
        }

        public void SetLocatario()
        {
            try
            {
                Locatario = Fila.Dequeue().Nome;
            } 
            catch
            {

            }
        }

        public void GetAllAlunos()
        {
            foreach (Aluno obj in Fila)
            {
                Console.WriteLine(obj);
            }
        }

        public override string ToString()
        {
            return $"{Id} - {Nome}, {Status}, {Locatario}"; 
        }
    }
}
