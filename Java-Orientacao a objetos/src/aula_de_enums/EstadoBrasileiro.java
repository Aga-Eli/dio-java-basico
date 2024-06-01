package aula_de_enums;

// Uma classe com objetos pré-estabelecidos pois seus atributos não mudam 
// por exemplos, estados brasileiros: so existem 27; graus de escolaridade:
// alfabetizado, fundamental, médio e superior; etc
public enum EstadoBrasileiro {

    SAO_PAULO ("SP","São Paulo", 11), // Criando um objeto com siglas e nomes pre estabelecidos pelo construtor
    RIO_JANEIRO ("RJ","Rio de Janeiro", 12),
    PIAUI ("PI","Piauí", 13),
    MARANHAO ("MA","Maranhão", 14),
    CEARA("CE", "Ceará", 15);

    private String nome;
    private String sigla;
    private int ibge;

    // privado pois não se precisa criar de fora: ja são pre estabelecidos
    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaicusculo(){
        return nome.toUpperCase();
    }
}
