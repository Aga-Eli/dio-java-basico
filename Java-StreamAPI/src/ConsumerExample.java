import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> { // como se fosse um for __ in __ de Pyhton, sendo este o for e o in na linha comentada 22
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };

    // numeros.stream().forEach(imprimirNumeroPar);

    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream()
        .filter(n -> n % 2 == 0) // Predicate está entre parenteses aqui
        .forEach(System.out::println); // O que está dentro do parenteses de forEach é o Consumer

  }
}