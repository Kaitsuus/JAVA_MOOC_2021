
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0, maara = 0, apuPituus = 0, nimiPituus;
        String apuNimi = "";
        while (true) {
            String tiedot = lukija.nextLine();
            
            if (tiedot.isEmpty()) {
                break;
            }

            String[] osat = tiedot.split(",");
            summa += Integer.valueOf(osat[1]);
            maara++;
            nimiPituus = osat[0].length();
            if (apuPituus < nimiPituus) {
                apuPituus = nimiPituus;
                apuNimi = osat[0];

            }
        }
        System.out.println("Pisin nimi: " + apuNimi);
        System.out.println("Syntymävuosien keskiarvo: "+1.0*summa/maara);

    }
}
