public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6;
        // int nota = 8
       // int nota = 4 

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");
        else
            System.out.println("Reprovado");
        /*
         * String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
         */

        String resultado = (nota >= 7) ? "Aprovado" : (nota >= 5 && nota < 7) ? "Prova Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
