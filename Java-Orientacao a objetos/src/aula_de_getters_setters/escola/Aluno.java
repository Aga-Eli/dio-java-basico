package aula_de_getters_setters.escola;

public class Aluno {
    private String nome;
    private int idade;

    /*
     * Para criar estes getters e setters, basta clicar na pequena lampada
     * do Visual Studio Code e "generate getters and settesr" (em outra
     * IDE: source -> generate getters and setters)
     */

    /*
     * ou então, basta digitar "get" + *inicial do nome da variavel*
     * ou então, basta digitar "set" + *inicial do nome da variavel*
     */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
