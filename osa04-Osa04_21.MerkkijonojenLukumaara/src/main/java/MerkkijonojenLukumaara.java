
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int maara = 0;
        while (true) {
            String jono = lukija.nextLine();

            if (jono.equals("loppu")) {
                break;
            }
            maara++;

        }
        System.out.println(maara);
    }
    
}
