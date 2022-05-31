
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("");
        int toka = Integer.valueOf(lukija.nextLine());
        if (eka < toka) {
            System.out.println("Luku "+eka+" on pienempi kuin "+toka+".");
        } else if (eka > toka) {
            System.out.println("Luku "+eka+" on suurempi kuin "+toka+".");
        } else {
            System.out.println("Luku "+eka+" on yhtä suuri kuin luku "+toka+".");
        }

    }
}
