package aula_pilares_poo;

public class Autodromo {

    public static void main(String[] args) throws Exception {

        Carro jeep = new Carro();
        jeep.setChassi("897897");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("467654");
        z400.ligar();
        /*
         * Perceba que tanto o carro, quanto a moto possuem e precisam 
         * possuir o metodo ligar pq na classe veiculo, há um método abstrato
         * "ligar", mas cada classe, moto e carro, precisam especificar como
         * ligam.
         */
    }
}
