package Aula04;

public class ListaVetor {
	private int[] arrayInteiros;
	private int totalInseridos = 0;
	private int capacidadeMaxima = 5;

	public void mostrarTodos() {
		if (totalInseridos == 0) {
			System.out.print("Lista vazia");
		}
		for (int i = 0; i < totalInseridos; i++) {
			System.out.print(arrayInteiros[i] + " ");
		}
		System.out.println();
	}

	public void adicionar(int numero) {
		garantirInicio();
		arrayInteiros[totalInseridos] = numero;
		totalInseridos++;
		garantirEspaco();
	}

	public void adicionar(int indice, int numero) {
		garantirInicio();
		garantirIndice(indice);
		//Ao garantir indíce faz com que o usuário apenas adicione no meio do vetor, e para
		//usar no final, use o método com 1 parâmetro

		for (int i = totalInseridos; i > indice; i--) {
			arrayInteiros[i] = arrayInteiros[i - 1];
		}

		arrayInteiros[indice] = numero;

		totalInseridos++;
		garantirEspaco();
	}

	private void garantirInicio() {
		if (arrayInteiros == null) {
			arrayInteiros = new int[capacidadeMaxima];
		}
	}

	private void garantirEspaco() {
		if (totalInseridos == capacidadeMaxima) {
			capacidadeMaxima = capacidadeMaxima * 2;
			int[] arrayNovo = new int[capacidadeMaxima];
			for (int i = 0; i < totalInseridos; i++) {
				arrayNovo[i] = arrayInteiros[i];
			}
			arrayInteiros = arrayNovo;
		}
	}

	public int tamanho() {
		return totalInseridos;
	}


	public int pegar(int indice) {
		garantirIndice(indice);
		return arrayInteiros[indice];
	}

	private void garantirIndice(int indice) {
		if (indice < 0 || indice > totalInseridos - 1) {
			throw new IndexOutOfBoundsException("Ìndice inválido: " + indice);
		}
	}

	public int indiceDe(int numero) {
		for (int i = 0; i < totalInseridos; i++) {
			if (numero == arrayInteiros[i]) {
				return i;
			}
		}
		return -1;
	}

	public boolean contem(int numero) {
		int indice = indiceDe(numero);
		if (indice == -1) {
			return false;
		} else {
			return true;
		}
	}

	public void remover(int indice) {
		garantirIndice(indice);
		arrayInteiros[indice] = 0;
		for (int i = indice + 1; i < capacidadeMaxima; i++) {
			arrayInteiros[i - 1] = arrayInteiros[i];
		}
		arrayInteiros[totalInseridos] = 0;
		totalInseridos--;

		System.out.println("O elemento na posição " + indice + " foi removido com sucesso");
	}

	public void removerTodos() {
		totalInseridos = 0;
		capacidadeMaxima = 5;
		arrayInteiros = null;
	}
}
