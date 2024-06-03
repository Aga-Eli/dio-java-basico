package aula_map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> minhaLista;

    public Dicionario() {
        this.minhaLista = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        minhaLista.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!minhaLista.isEmpty()){
            minhaLista.remove(palavra);
        } else System.out.println("Seu mapa está vazio");
    }

    public void exibirPalavras(){
        System.out.println(minhaLista);
    }

    public String pesquisarPorPalavra(String palavra){
        String minhaDefinicao = null;

        if (!minhaLista.isEmpty()){
            minhaDefinicao = minhaLista.get(palavra);
        } 

        return minhaDefinicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

    // Adicionar palavras (linguagens de programação)
    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

    // Exibir todas as palavras
    dicionario.exibirPalavras();

    // Pesquisar palavras
    String definicaoJava = dicionario.pesquisarPorPalavra("java");
    System.out.println("Definição da linguagem 'java': " + definicaoJava);

    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
    System.out.println(definicaoCSharp);

    // Remover uma palavra
    dicionario.removerPalavra("typescript");
    dicionario.exibirPalavras();
    }
}
