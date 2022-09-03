import java.util.ArrayList;

public class Tehtavalista {
    private ArrayList<String> lista;

    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }
    public void lisaa(String tehtava) {
        this.lista.add(tehtava);
    }
    public void tulosta() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ": " + this.lista.get(i));
        }
    }
    public void poista(int numero) {
        this.lista.remove(numero - 1);
    }
}
