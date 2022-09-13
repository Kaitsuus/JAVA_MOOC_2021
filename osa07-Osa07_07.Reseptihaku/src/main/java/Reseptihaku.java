
import java.util.Scanner;

public class Reseptihaku {   
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mistä luetaan?");
        String tiedosto = lukija.nextLine();
        ReseptiKirja reseptiKirja = new ReseptiKirja();
        reseptiKirja.reseptinLuku(tiedosto);
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
        while (true) {
            System.out.println("Syötä komento:");
            String komento = lukija.nextLine();
            System.out.println("");
            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("listaa")) {
                reseptiKirja.listaa();
            }
            if (komento.equals("hae nimi")) {
                System.out.println("Mitä haetaan: ");
                String nimi = lukija.nextLine();
                reseptiKirja.haeNimi(nimi);
            }
            if (komento.equals("hae keittoaika")) {
                System.out.println("Keittoaika korkeintaa: ");
                int aika = Integer.valueOf(lukija.nextLine());
                reseptiKirja.haeKeittoaika(aika);
            }
            if (komento.equals("hae aine")) {
                System.out.println("Mitä raaka-ainetta haetaan: ");
                String aines = lukija.nextLine();
                reseptiKirja.haeAine(aines);
            }

        }
    }
}