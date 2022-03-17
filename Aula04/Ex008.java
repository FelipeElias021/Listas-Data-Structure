package Aula04;

/*: Implemente os métodos adicionar(int indice, int numero) e remover(int
indice) no código ListaVetor e crie implemente um método main() para que tenha a
seguinte saída:*/

public class Ex008 {
    public static void main(String[] args) {
        ListaVetor repository = new ListaVetor();
        System.out.println("Adicionando 5 elementos na lista:");
        repository.adicionar(10);
        repository.adicionar(20);
        repository.adicionar(30);
        repository.adicionar(40);
        repository.adicionar(50);
        repository.mostrarTodos();

        System.out.println("Adicionando um elemento no início da lista:");
        repository.adicionar(0, 7);
        repository.mostrarTodos();

        System.out.println("Adicionando um elemento no meio da lista:");
        repository.adicionar(3, 8);
        repository.mostrarTodos();

        System.out.println("Adicionando um elemento no final da lista:");
        repository.adicionar(9);
        repository.mostrarTodos();

        System.out.println("Tamanho da lista: " + repository.tamanho());

        System.out.println("Elemento na posição 3: " + repository.pegar(3));

        System.out.println("Índice do número 30: " + repository.indiceDe(30));

        System.out.println("Índice do número 30: " + repository.contem(30));

        System.out.println("Removendo no início da lista:");
        repository.remover(0);
        repository.mostrarTodos();

        System.out.println("Removendo no meio da lista:");
        repository.remover(2);
        repository.mostrarTodos();

        System.out.println("Removendo no fim da lista:");
        repository.remover(5);
        repository.mostrarTodos();

        System.out.println("Removendo todos os elementos da lista:");
        repository.removerTodos();
        repository.mostrarTodos();
    }
}
