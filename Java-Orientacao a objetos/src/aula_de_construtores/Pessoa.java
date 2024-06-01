package aula_de_construtores;

public class Pessoa {
    
    String nome;
    String cpf;
    String endereco;

    // método construtor (ele não precisa especificar o tipo de retorno)
    // o nome deverá ser igual ao nome da classe
    /*
     * Com os construtores, assim que voce cria um objeto, voce precisa
     * definir estes atributos entre parenteses
     */
    public Pessoa(String cpf, String nome){
        this.cpf = cpf; // "Esse atributo é igual a esse parametro dado"
        this.nome = nome; // "Esse atributo é igual a esse parametro dado"
    }

    // Outro jeito de criar um connstrutor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Outro jeito de criar um construtor
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
