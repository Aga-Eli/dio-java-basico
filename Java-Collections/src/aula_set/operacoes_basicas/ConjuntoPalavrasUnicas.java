package aula_set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> meuConjunto;

    public ConjuntoPalavrasUnicas() {
        this.meuConjunto = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        meuConjunto.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraRemovida = null;

        for (String p : meuConjunto){
            if (p == palavra){
                palavraRemovida = p;
                break;
            }
        }

        meuConjunto.remove(palavraRemovida);
    }

    public boolean verificarPalavra(String palavra){
        boolean existePalavra = false;
        for (String p : meuConjunto){
            if (p == palavra)
                existePalavra = true;
        }
        return existePalavra;
    }

    public void exibirPalavrasUnicas(){
        Set palavrasUnicas = new HashSet<>();

        if (!meuConjunto.isEmpty()){
            for (String p : meuConjunto){
                Set palavrasUnicasAuxiliar = new HashSet<>(meuConjunto);
                palavrasUnicasAuxiliar.remove(p);
                if (!palavrasUnicasAuxiliar.contains(p))
                    palavrasUnicas.add(p);
            }
        }
        else
            System.out.println("O Set está vazio");

        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas meuConjuntoDePalavras = new ConjuntoPalavrasUnicas();

        meuConjuntoDePalavras.adicionarPalavra("mouse");
        meuConjuntoDePalavras.adicionarPalavra("copo");
        meuConjuntoDePalavras.adicionarPalavra("celular");
        meuConjuntoDePalavras.adicionarPalavra("computador");
        meuConjuntoDePalavras.adicionarPalavra("teclado");

        System.out.println(meuConjuntoDePalavras.verificarPalavra("mouse"));

        meuConjuntoDePalavras.exibirPalavrasUnicas();
    }
    
}
