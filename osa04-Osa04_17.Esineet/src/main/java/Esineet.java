
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            esineet.add(new Esine(nimi));
        }
        for (Esine esine: esineet) {
            System.out.println(esine);
        }
        

    }
    
}
