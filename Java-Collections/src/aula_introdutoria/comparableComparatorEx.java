package aula_introdutoria;

public class comparableComparatorEx {
    // Construção no arquivo "Livro.java"
    // Aplicação no arquivo "Main.java"

    /*
     * Comparable x Comparator são interfaces utilizadas para organizar 
     * ou comparar elementos, como em uma lista, por exemplo.
     * 
     * Pense neles como se fossem estabelecedores de uma ordem natural
     */ 

    /*
     * Comparable
     * 
     * Comparable fornece uma única sequência de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
Comparable afeta a classe original, ou seja, a classe atual é modificada.
Comparable fornece o método compareTo() para ordenar elementos.
Comparable está presente no pacote java.lang.
Podemos ordenar os elementos da lista do tipo Comparable usando o método Collections.sort(List).
     */

    /*
     * Comparator
     * 
     * O Comparator fornece o método compare() para ordenar elementos.
O Comparator fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome, preço, etc.
O Comparator não afeta a classe original, ou seja, a classe atual não é modificada.
Um Comparator está presente no pacote java.util.
Podemos ordenar os elementos da lista do tipo Comparator usando o método Collections.sort(List, Comparator).
     */

     /*
      * Collection

      A classe Collections é uma classe utilitária do Java para operações comuns em coleções.
Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.
O método sort() é usado para ordenar uma lista em ordem ascendente.
O método sort() em conjunto com Collections.reverseOrder() permite ordenar em ordem descendente.
      */
}
