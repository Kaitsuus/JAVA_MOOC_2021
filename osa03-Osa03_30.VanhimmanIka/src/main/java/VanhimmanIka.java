
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ika, apu = 0;

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
        
            String[] palat = luettu.split(",");
            ika = Integer.valueOf(palat[1]);
            if (ika >= apu) {
                apu = ika;
            }
        }
        System.out.println("Vanhimman ikä: " + apu);
    }

}

