package aulas.list.opbasico;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> TarefaLista;

    public ListaTarefa() {
        TarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa (String descri){
        TarefaLista.add(new Tarefa(descri));
    }
    public void removerTarefa (String descri){
        List<Tarefa> removerTarefa = new ArrayList<>();
        if (!TarefaLista.isEmpty()){
            for (Tarefa t : TarefaLista){
                if (t.getDesci().equalsIgnoreCase(descri)){
                    removerTarefa.add(t);
                }
            }
            TarefaLista.removeAll(removerTarefa);
        } else {
            System.out.println("A lista esta vazia ");
        }
    }

    public int obterNumeroTotalTarefas(){
        return TarefaLista.size();
    }

    public void obterDescricoesTarefas (){
        if(!TarefaLista.isEmpty()){
            System.out.println(TarefaLista);
        }else {
            System.out.println("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTaf = new ListaTarefa();
        listaTaf.adicionarTarefa("Pegar o codigo no estagio");
        listaTaf.adicionarTarefa("comprar camaro");
        listaTaf.adicionarTarefa("terminar bootcamp");

        // Exibindo o número total de tarefas na lista
        System.out.println("total de " + listaTaf.obterNumeroTotalTarefas() + " de tarefas");
        // Exibindo as descrições das tarefas na lista
        listaTaf.obterDescricoesTarefas();
        // Removendo uma tarefa da lista
        listaTaf.removerTarefa("correr");
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("total de " + listaTaf.obterNumeroTotalTarefas() + " de tarefas");
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTaf.obterDescricoesTarefas();
        // Removendo uma tarefa da lista quando a lista está vazia
        listaTaf.removerTarefa("comprar camaro");
        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTaf.obterNumeroTotalTarefas() + " tarefas na lista:");

    }
}
