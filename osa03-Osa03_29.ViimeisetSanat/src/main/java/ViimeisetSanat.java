
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String mjono = lukija.nextLine();
            if (mjono.isEmpty()) {
                break;
            }
            String[] osat = mjono.split(" ");
            System.out.println(osat[osat.length-1]);
        }


    }
}
