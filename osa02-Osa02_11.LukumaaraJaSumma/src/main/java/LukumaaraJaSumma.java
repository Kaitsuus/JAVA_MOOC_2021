
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int yht = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku != 0) {
                summa = summa + luku;
            }
            if (luku != 0) {
                yht = yht +1;
            }
        }
        System.out.println("Lukuja yhteensä "+yht);
        System.out.println("Lukujen summa "+summa);

    }
}
