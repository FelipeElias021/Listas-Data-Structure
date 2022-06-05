package Aula09;

import java.util.List;

public class Pessoa {
    private String nome;
    private Pessoa conjuge;
    private List<Pessoa> filhos;

    private void mostrarDados() {
        System.out.println("Nome: " + nome);
        if (conjuge != null) {
            System.out.println("Conjuge: " + conjuge.getNome());
        }
    }

    public void mostrarArvore() {
        mostrarFilhos(1, this);
    }

    public void mostrarFilhos(int geracao, Pessoa pai) {
        System.out.println("\nGeração: " + geracao);
        pai.mostrarDados();
        if (pai.getFilhos() != null) {
            for (Pessoa filho : pai.getFilhos()) {
                mostrarFilhos(geracao + 1, filho);
            }
        }
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public List<Pessoa> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Pessoa> filhos) {
        this.filhos = filhos;
    }
}
