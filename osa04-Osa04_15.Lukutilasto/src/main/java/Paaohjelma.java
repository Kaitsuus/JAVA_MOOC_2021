
import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        
        
        Lukutilasto maara = new Lukutilasto();
        Lukutilasto parillinen = new Lukutilasto();
        Lukutilasto pariton = new Lukutilasto();
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna lukuja: ");
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            if (luku % 2 == 0) {
                parillinen.lisaaLuku(luku);
            } else {
                pariton.lisaaLuku(luku);
            }

            maara.lisaaLuku(luku);
        }
        System.out.println("Summa on: " + maara.summa());
        System.out.println("Parillisten summa: " + parillinen.summa());
        System.out.println("Parittomien summa: " + pariton.summa());
    }
}
