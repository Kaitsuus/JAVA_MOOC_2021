
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            luettu = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (luettu.equals("lisaa")) {
                if (maara > 0) {
                    ensimmainen += maara;
                }
                if (ensimmainen > 100) {
                    ensimmainen = 100;
                }

            }
            if (luettu.equals("siirra")) {
                if (maara > 0 ) {
                    if (maara > ensimmainen) {
                        toinen += ensimmainen;
                        ensimmainen = 0;
                    } else {
                        ensimmainen -= maara;
                        toinen += maara;
                    }
                }
                if (toinen > 100) {
                    toinen = 100;
                }

            }
            if (luettu.equals("poista")) {
                if (maara > 0 ) {
                    toinen -= maara;
                }
                if (toinen < 0) {
                    toinen = 0;
                }

            }

        }
        
    }

}
