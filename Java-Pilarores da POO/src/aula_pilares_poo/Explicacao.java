package aula_pilares_poo;

public class Explicacao {
    public static void main(String[] args) throws Exception {
        /*
         * Encapsulamento: "Nem tudo que eu faço, todos precisam saber", ou seja,
         * alguns métodos podem estar dentro de outros para complementar as 
         * ações destes "outros".
         * Exemplo: Para um carro ligar, precisa de muitas coisas
         * para a engenharia, mas o condutor so precisa saber
         * da ação de ignição, de dar a partida
         */

        /*
         * Herança: As vezes, varias classes possuem caracteristicas em comum
         * que podem herdar de uma classe mais abrangente.
         * Exemplo: tanto um "Carro", como uma "Moto", possuem placa, chassi, ano 
         * de fabricação, podem acelerar e freiar, logo, podem desfrutar da 
         * herança de uma classe "Veículo".
         */

         /*
          * Abstração: É a indisponibilidade para determinar a lógica de um ou
          vários comportamentos em um objeto.
          Exemplo: "Veículo" sabe acelerar e freiar, então estas ações devem 
          ser abstratas, visto que existem várias maneiras de acelerar/freiar,
          ou seja, o "Carro" e a "Moto" aceleram e freiam de formas diferentes
          (Atrelada a Polimorfismo)
          */

        /*
         * Polimorfismo: São as inúmeras maneiras de se realizar uma mesma ação.
         * Exemplo: "Veículo" sabe acelerar e freiar, mas precisamos saber se 
         * estamos nos referindo a "Carro" ou a "Moto" para determinar a lógica
         * de aceleração e frenagem dos respectivos veículos.
         */
    }
}
