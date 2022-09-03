import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    public void kaynnista() {
        while(true) {
            System.out.println("Komento: ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            }
            if (komento.equals("lisaa")) {
                System.out.println("Sana: ");
                String sana = lukija.nextLine();
                System.out.println("Käännös: ");
                String kaannos = lukija.nextLine();
                this.sanakirja.lisaa(sana, kaannos);
            }
            if (komento.equals("hae")) {
                System.out.println("Haettava: ");
                String sana = lukija.nextLine();
                String haettavaKaannos = this.sanakirja.kaanna(sana);
                if (haettavaKaannos == null) {
                    System.out.println("Sanaa " + sana + " ei löydy");
                } else {
                    System.out.println("Käännös: " + this.sanakirja.kaanna(sana));
                }
            
            } else {
                System.out.println("Tuntematon komento");
            }
        }
    }

}
