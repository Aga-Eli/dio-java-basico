public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("O Curso começou, agora vai"); //"println" printa e solta uma linha

        final String BR = "Brasil"; // "final" e variáveis em uppercase significam que essas variáveis são imutáveis
        System.out.print(BR.concat("llll") + "\n");

        // Só pode ter _ e $ no nome de variáveis e não começar com números
        // Uma variável não pode se chamar "long"
        // Para variáveis: Tipo nomeBemDefinido = Atribuição(Opcional)

        String meuNome = "Matheus";
        int numAleatorio = 1782;
        boolean verdadeiro = true;
        numAleatorio = 238728;
        // Para métodos: TipoRetorno NomeObjetivoNoInfinito Parametros
        // Exemplos: int somar(int num1, int num2)
        String primeiroNome = "matheus";
        String segundoNome = "Legnani";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.err.println(nomeCompleto(primeiroNome, segundoNome));

        String [] nomes = {"matheus", "lucas", "joao"}; // Uma lista de strings
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
