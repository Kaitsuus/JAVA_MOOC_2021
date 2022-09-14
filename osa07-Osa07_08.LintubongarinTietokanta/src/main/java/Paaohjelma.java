
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
    
        Scanner lukija = new Scanner(System.in);
        Linnut linnut = new Linnut();
        System.out.println("Komennot:");
        System.out.println("Lisaa - lisää linnun");
        System.out.println("Lopeta - lopettaa ohjelman");
        System.out.println("Havainto - lisää havainnon");
        System.out.println("Tilasto - tulostaa kaikki linnut");
        System.out.println("Nayta - tulostaa yhden linnun");
        while (true) {
            System.out.println("?");
            String komento = lukija.nextLine();
            System.out.println("");
            if (komento.equals("Lopeta")) {
                break;
            }
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi: ");
                String latinankielinenNimi = lukija.nextLine();
                linnut.lisaa(nimi, latinankielinenNimi);
            }
            if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu?");
                String nimi = lukija.nextLine();
                linnut.havainto(nimi);
            }
            if (komento.equals("Tilasto")) {
                linnut.tulostaKaikki();
            }
            if (komento.equals("Nayta")) {
                System.out.println("Mikä?");
                String nimi = lukija.nextLine();
                linnut.tulostaLintu(nimi);
            }
        }

    }

}
