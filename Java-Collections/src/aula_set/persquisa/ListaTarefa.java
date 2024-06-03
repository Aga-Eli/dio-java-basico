package aula_set.persquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    private Set<Tarefa> minhaLista;

    public ListaTarefa() {
        this.minhaLista = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        minhaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        if (!minhaLista.isEmpty()){
            for (Tarefa t : minhaLista){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemovida = t;
                }
            }
            minhaLista.remove(tarefaRemovida);
        }
        else System.out.println("A lista está vazia");
    }

    public void exibirTarefas(){
        System.out.println(minhaLista);
    }

    public int contarTarefas(){
        return minhaLista.size();
    }

    public Set obterTarefasConcluidas(){
        Set<Tarefa> listaTarefasConcluidas = new HashSet<>();

        for (Tarefa t : minhaLista){
            if(t.isConcluida() == true){
                listaTarefasConcluidas.add(t);
            }
        }
        return listaTarefasConcluidas;
    }

    public Set obterTarefasPendentes(){
        Set<Tarefa> listaTarefasPendentes = new HashSet<>();

        for (Tarefa t : minhaLista){
            if(t.isConcluida() == false){
                listaTarefasPendentes.add(t);
            }
        }
        return listaTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;

        if (!minhaLista.isEmpty()){
            for (Tarefa t : minhaLista){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaConcluida = t;
                }
            }
            tarefaConcluida.setConcluida(true);
        }
        else System.out.println("O conjunto está vazio");
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;

        if (!minhaLista.isEmpty()){
            for (Tarefa t : minhaLista){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaPendente = t;
                }
            }
            tarefaPendente.setConcluida(false);
        }
        else System.out.println("O conjunto está vazio");
    }

    public void limparListaTarefas(){
        minhaLista.clear();
    }

    public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaTarefa listaTarefas = new ListaTarefa();

    // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");//
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");//
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");//
    listaTarefas.adicionarTarefa("Ler livro");//
    listaTarefas.adicionarTarefa("Preparar apresentação");//

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
    }
}
