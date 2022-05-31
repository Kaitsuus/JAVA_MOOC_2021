
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int yht = 0;
        while (true) {
            System.out.println("");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            if (luku > 0) {
                summa = summa + luku;
                yht = yht + 1;
            }
        }
        if (summa != 0) {
            System.out.println(1.0*summa/yht);
        } else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }

    }
}
