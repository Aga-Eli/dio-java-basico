package aula_list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List <Integer> minhaLista;

    public SomaNumeros() {
        this.minhaLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        minhaLista.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for (int numero : minhaLista)
            soma += numero;

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;

        if(!minhaLista.isEmpty()){
            maiorNumero = minhaLista.get(0);

            for (int numero : minhaLista)
                if (numero > maiorNumero)
                    maiorNumero = numero;
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;

        if(!minhaLista.isEmpty()){
            menorNumero = minhaLista.get(0);

            for (int numero : minhaLista)
                if (numero < menorNumero)
                    menorNumero = numero;
        }

        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return minhaLista;
    }

    public static void main(String[] args) {
        SomaNumeros minhaLista = new SomaNumeros();

        minhaLista.adicionarNumero(5);
        minhaLista.adicionarNumero(4);
        minhaLista.adicionarNumero(3);
        minhaLista.adicionarNumero(2);
        minhaLista.adicionarNumero(1);

        System.out.println(minhaLista.calcularSoma());
        System.out.println(minhaLista.encontrarMaiorNumero());
        System.out.println(minhaLista.encontrarMenorNumero());
        System.out.println(minhaLista.exibirNumeros());
        
    }
}
