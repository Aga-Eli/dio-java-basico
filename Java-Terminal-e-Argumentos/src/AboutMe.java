public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com índice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm ");

        // no terminal: java AboutMe gleyson sampaio 28 1.58
        // abrir ou criar configurações que serão adicionadas dentro de ".vscode"
        // e editar da sua forma, que nem esse exemplo

    }
}
