import java.util.Scanner;

public class Kayttoliittyma {
    private Tehtavalista lista;
    private Scanner lukija;

    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    public void kaynnista() {
        while (true) {
            System.out.println("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("lisaa")) {
                System.out.println("Lisättävä: ");
                String tehtava = lukija.nextLine();
                this.lista.lisaa(tehtava);
            }
            if (komento.equals("listaa")) {
                this.lista.tulosta();
            }
            if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan? ");
                int numero = Integer.valueOf(lukija.nextLine());
                this.lista.poista(numero);
            }
            
        }
    }
}
