package aula_list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List <Integer> minhaOrdenacao;

    public OrdenacaoNumeros() {
        this.minhaOrdenacao = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        minhaOrdenacao.add(numero);
    }

    public List ordenarAscendenteComparable(){
        List minhaOrdenacaoAscendente = new ArrayList<>(minhaOrdenacao);

        Collections.sort(minhaOrdenacaoAscendente);

        return minhaOrdenacaoAscendente;
    }

    public List ordenarDescendenteComparable(){
        List minhaOrdenacaoDecendente = new ArrayList<>(minhaOrdenacao);

        Collections.sort(minhaOrdenacaoDecendente, Collections.reverseOrder());

        return minhaOrdenacaoDecendente;
    }

    public List ordenarAscendenteComparator(){
        List minhaOrdenacaoAscendente = new ArrayList<>(minhaOrdenacao);

        Collections.sort(minhaOrdenacaoAscendente, new MeuComparatorAscendente());

        return minhaOrdenacaoAscendente;
    }

    public List ordenarDescendenteComparator(){
        List minhaOrdenacaoDecendente = new ArrayList<>(minhaOrdenacao);

        Collections.sort(minhaOrdenacaoDecendente, new MeuComparatorDescendente());

        return minhaOrdenacaoDecendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros minhaLista = new OrdenacaoNumeros();

        minhaLista.adicionarNumero(4);
        minhaLista.adicionarNumero(5);
        minhaLista.adicionarNumero(1);
        minhaLista.adicionarNumero(2);
        minhaLista.adicionarNumero(7);

        System.out.println(minhaLista.ordenarAscendenteComparable());
        System.out.println(minhaLista.ordenarDescendenteComparable());
        System.out.println(minhaLista.ordenarAscendenteComparator());
        System.out.println(minhaLista.ordenarDescendenteComparator());
    }
}

class MeuComparatorAscendente implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
        /*
         * -1 : o1 < o2
            0 : o1 == o2
            +1 : o1 > o2
         */
    }
    
}

class MeuComparatorDescendente implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return -(Integer.compare(o1, o2));
    }
    
}
