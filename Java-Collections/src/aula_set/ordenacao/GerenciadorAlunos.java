package aula_set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> minhaLista;

    public GerenciadorAlunos() {
        this.minhaLista = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        minhaLista.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemovido = null;

        if (!minhaLista.isEmpty()){
            for (Aluno a : minhaLista){
                if (a.getMatricula().equals(matricula)){
                    alunoRemovido = a;
                }
            }
            minhaLista.remove(alunoRemovido);
        }
        else System.out.println("Seu conjunto está vazio!");
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(minhaLista);
        if (!minhaLista.isEmpty()) {
            return alunosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!minhaLista.isEmpty()) {
            alunosPorNota.addAll(minhaLista);
            return alunosPorNota;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunos(){
        System.out.println(minhaLista);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // Adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

    // Exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador:");
    gerenciadorAlunos.exibirAlunos();

    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
    gerenciadorAlunos.removerAluno(000L);
    gerenciadorAlunos.removerAluno(123457L);
    gerenciadorAlunos.exibirAlunos();

    // Exibindo alunos ordenados por nome
    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

    // Exibindo alunos ordenados por nota
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }
}
