package aulas.list.opbasico;

public class Tarefa {
    private String desci;

    public String getDesci() {
        return desci;
    }

    public Tarefa(String desci) {
        this.desci = desci;
    }

    @Override
    public String toString() {
        return desci;
    }
}
