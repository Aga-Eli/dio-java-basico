package aula_de_getters_setters.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        // Setters (Definindo)
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        // Getters (Obtendo informações)
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
