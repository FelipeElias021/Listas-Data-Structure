package Aula05;

class No {
    int numero;
    No proximo;

    public No(int novo) {
        numero = novo;
        proximo = null;
    }
}

public class ListaLigada {
    No cabeca;

    public void mostrarTodos() {
        No noAtual = cabeca;
        if (noAtual == null) {
            System.out.print("Lista ligada vazia");
        }
        while (noAtual != null) {
            System.out.print(noAtual.numero + " ");
            noAtual = noAtual.proximo;
        }
        System.out.println();
    }

    public void adicionar(int numero) {
        No noNovo = new No(numero);
        if (cabeca == null) {
            cabeca = noNovo;
        } else {
            No ultimo = cabeca;
            while (ultimo.proximo != null) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = noNovo;
        }
    }

    public int tamanho() {
        No noAtual = cabeca;
        int contador = 0;
        while (noAtual != null) {
            noAtual = noAtual.proximo;
            contador++;
        }
        return contador;
    }

    public int pegar(int indice) {
        garantirIndice(indice);
        No noAtual = cabeca;
        int contador = 0;
        while (noAtual != null && contador < indice) {
            noAtual = noAtual.proximo;
            contador++;
        }
        if (noAtual != null) {
            return noAtual.numero;
        } else {
            return -1;
        }
    }

    public void garantirIndice(int i) {
        if (i > tamanho() || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
    }

    public void remover(int indice) {
        No noAtual = cabeca;
        No noAnterior = null;

        if (indice == 0 && noAtual != null) {
            cabeca = noAtual.proximo;
            System.out.println("Elemento na posição " + indice + " removido");
        }

        int contador = 0;
        while (noAtual != null) {
            if (contador == indice) {
                if (noAnterior != null) {
                    noAnterior.proximo = noAtual.proximo;
                    System.out.println("Elemento na posição " + indice + " removido");
                }
                break;
            } else {
                noAnterior = noAtual;
                noAtual = noAtual.proximo;
                contador++;
            }
            if (contador > indice) {
                System.out.println("Elemento na posição " + indice + " não foi encontrado");
                break;
            }
        }
    }

    public int indiceDe(int numero) {
        No noAtual = cabeca;
        int contador = 0;
        while (noAtual != null && noAtual.numero != numero) {
            noAtual = noAtual.proximo;
            contador++;
        }
        if (noAtual != null) {
            return contador;
        } else {
            return -1;
        }
    }

    public void removerNumero(int numeroChave) {
        No noAtual = cabeca;
        No noAnterior = null;

        if (noAtual != null && noAtual.numero == numeroChave) {
            cabeca = noAtual.proximo;
            System.out.println(numeroChave + " encontrado e removido");
            return;
        }

        while (noAtual != null && noAtual.numero != numeroChave) {
            noAnterior = noAtual;
            noAtual = noAtual.proximo;
        }
        if (noAtual != null) {
            noAnterior.proximo = noAtual.proximo;
            System.out.println(numeroChave + " encontrado e removido");
        } else {
            System.out.println(numeroChave + " não encontrado");
        }
    }

    public boolean contem(int numero) {
        int indice = indiceDe(numero);
        if (indice == -1) {
            return false;
        } else {
            return true;
        }
    }

    public void adicionar(int indice, int numero) {
        garantirIndice(indice);
        No noNovo = new No(numero);
        if (cabeca == null) {
            cabeca = noNovo;
        } else if (indice == 0) {
            No cabecaAntiga = cabeca;
            cabeca = noNovo;
            cabeca.proximo = cabecaAntiga;
        } else {
            No noAtual = cabeca;
            No noAnterior = null;
            int contador = 0;
            while (contador < indice) {
                noAnterior = noAtual;
                noAtual = noAtual.proximo;
                contador++;
            }
            noAnterior.proximo = noNovo;
            noNovo.proximo = noAtual;
        }
    }

    public void adicionar(ListaLigada lista) {
        No ultimo = cabeca;
        while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
        }
        ultimo.proximo = lista.cabeca;
    }

    public void removerTodos() {
        cabeca = null;
    }

}
