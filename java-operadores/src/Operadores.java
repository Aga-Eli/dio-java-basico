public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // "char" só permite um caracter e é envolto pelas aspas únicas ''
        // Date dataNascimento = new Date(); Nesse caso "Date" é uma classe e "new" é uma forma de criar um novo objetov dessa classe
        // O compilador lê uma variável da direita para a esquerda (se não houver parenteses nas operações de aritmética entre os números da variável)portanto, se uma variável começa com uma adição de números, ele vai realizar normal, mas assim que houver uma string no meio, ele começará a tratar a variável como string e concatenar

        int numero = 5;
        System.err.println(-numero);
        System.err.println(numero);
        numero = - numero;
        numero = + numero;
        System.err.println(numero);
        numero = - numero; // Ou multiplicar ele por -1
        System.err.println(numero);

        int numero2 = 5;
        numero2 += 1; // também funciona com outros operadores
        numero2 ++;
        System.err.println(numero2);
        System.err.println(++numero2); // dessa forma, realizamos a operação e imprimimos o resultado, se fosse "numero2++", seria impresso o numero e depois realizado a operação permanentemente
        boolean variavel = true;
        System.err.println(!variavel);
        System.err.println(variavel);

        // operador alternário (?)(uma espécie de if simplificado): <Expressão Condicional> ? <Caso Condição seja true> : <Caso Condição seja false>
        int a, b, c;
        String resultado;
        a = 5;
        b = 6;
        resultado = (a==b) ? "verdadeiro" : "falso";
        System.err.println(resultado);
        c = (a!=b) ? 1 : 0;
        System.err.println(c);

        // variavel1.equals(variavel2) retorna true ou false e pode ser usada para comparar objetos 

        // && Operador Lógico "E"
        // || Operador Lógico "OU"
    }
}
