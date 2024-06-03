package aula_map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> minhaLista;

    public ContagemPalavras() {
        this.minhaLista = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        minhaLista.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!minhaLista.isEmpty()){
            minhaLista.remove(palavra);
        } else System.out.println("Seu mapa está vazio!");
    }

    public Map exibirContagemPalavras(){
        return minhaLista;
    }

    public String encontrarPalavrasMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : minhaLista.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

    // Adiciona linguagens e suas contagens
    contagemLinguagens.adicionarPalavras("Java", 2);
    contagemLinguagens.adicionarPalavras("Python", 8);
    contagemLinguagens.adicionarPalavras("JavaScript", 1);
    contagemLinguagens.adicionarPalavras("C#", 6);

    // Exibe a contagem total de linguagens
    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

    // Encontra e exibe a linguagem mais frequente
    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    
    }
}
