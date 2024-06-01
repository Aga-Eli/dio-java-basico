package aula_de_construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        /* Como se estas informações fossem obrigatórias e o endereço podia
        vir depois: atributos relevantes para a existencia de um objeto
        */ 
        Pessoa marcos = new Pessoa("123", "Marcos");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
