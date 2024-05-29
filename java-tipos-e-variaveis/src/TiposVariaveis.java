public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // int, byte, short, long, float, double, boolean e char
        // byte -> short -> int -> long (em questão de grandiosidade do número, apesar de que normalmente se usa int)
        // float -> double (em questão de grandiosidade do número, mais comum é o double)
        // valor padrão de int é 0 e boolean é false
        // A variavel do tipo float precisa de um "f" ou "F" no final, assim como long necessita de um "L" no final

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;
        System.out.println(numero);
    }
}
