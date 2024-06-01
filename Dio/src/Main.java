import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Nicolas");
        listaGenerics.add("Kayna");
        listaGenerics.add("anderson");
        listaGenerics.add("elton");

        System.out.println(listaGenerics);

        for (String elemento : listaGenerics){
            System.out.println(elemento);
        }
        List listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("xablau");
        listaSemGenerics.add("xablau");
        listaSemGenerics.add("xablau");
        listaSemGenerics.add("xablau");

        for (Object elemento : listaSemGenerics){
            String str = (String)elemento;
            System.out.println(str);
        }

    }
}