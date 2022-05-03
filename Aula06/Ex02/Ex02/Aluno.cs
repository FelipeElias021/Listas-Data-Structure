using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex02
{
    class Aluno
    {
        public int Id { get; private set; }
        public string Nome { get; private set; }

        public Aluno(int id, string nome)
        {
            Id = id;
            Nome = nome;
        }

        public override string ToString()
        {
            return $"{Id} - {Nome}";
        }
    }
}
