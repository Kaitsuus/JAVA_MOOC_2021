
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private Yhteispisteet yhteispisteet;

    public Kayttoliittyma(Scanner lukija, Yhteispisteet yhteispisteet) {
        this.lukija = lukija;
        this.yhteispisteet = yhteispisteet;
    }
    
    public void kaynnista() {

        while (true) {
            System.out.println("Syötä yhteispisteet, -1 lopettaa: ");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            if (luku >= 0 && luku <= 100) {
                this.yhteispisteet.lisaa(luku);
            }
        }
        System.out.println("Pisteiden keskiarvo (kaikki): " + this.yhteispisteet.keskiarvo());
        if (this.yhteispisteet.hyvaksytty() != 0.0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + this.yhteispisteet.hyvaksytty());
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytty): -");
        }
        System.out.println("Hyväksymisprosentti: " + this.yhteispisteet.hyvaksymisProsentti());
        System.out.println("Arvosanajakauma: ");
        this.yhteispisteet.arvosanajakauma();
    }
}
