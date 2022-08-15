
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ika, apu = 0;
        String apuNimi = "";
        while (true) {
            String nimet = lukija.nextLine();

            if (nimet.isEmpty()) {
                break;
            }

            String[] osat = nimet.split(",");
            ika = Integer.valueOf(osat[1]);
            if (ika >= apu) {
                apu = ika;
                apuNimi = osat[0];
            }
        }
        System.out.println("Vanhimman nimi: " + apuNimi);
    }
}
