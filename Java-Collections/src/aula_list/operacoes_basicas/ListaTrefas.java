package aula_list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTrefas {

    private List <Tarefa> tarefaList;

    public ListaTrefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List tarefasParaRemover = new ArrayList<Tarefa>();
        
        for (Tarefa tarefa : tarefaList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(tarefa);
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTrefas listaTrefas = new ListaTrefas();

        System.out.println(listaTrefas.obterNumeroTotalTarefa());

        listaTrefas.adicionarTarefa("Tarefa 1");
        listaTrefas.adicionarTarefa("Tarefa 2");
        listaTrefas.adicionarTarefa("Tarefa 3");
        listaTrefas.adicionarTarefa("Tarefa 4");

        System.out.println(listaTrefas.obterNumeroTotalTarefa());

        listaTrefas.removerTarefa("Tarefa 4");

        listaTrefas.obterDescricaoTarefas();
    }
}
