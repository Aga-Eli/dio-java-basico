package aula_introdutoria;

public class genericsEx {
    /*
     * public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
     */



     /*
      * /**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado

public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
      */

      // Uma variável de tipo pode ser qualquer tipo não primitivo que 
      // você especificar: qualquer tipo de classe, qualquer tipo de interface, 
      // qualquer tipo de array ou até mesmo outra variável de tipo.
      // Essa mesma técnica pode ser aplicada para criar interfaces genérica.

      /*
       * os nomes de parâmetros de tipo mais comumente usados são:
E - Elemento (usado extensivamente pelo Java Collections Framework)
K - Chave
N - Número
T - Tipo
V - Valor
S, U, V, etc. - 2º, 3º, 4º tipos
       */
}
