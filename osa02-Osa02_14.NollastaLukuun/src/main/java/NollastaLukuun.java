
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;
        System.out.println("");
        int syote = Integer.valueOf(lukija.nextLine());
        while (luku <= syote) {
            System.out.println(luku);
            luku ++;
        }


    }
}
