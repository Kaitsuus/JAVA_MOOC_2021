
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int a = 0;
        System.out.println();
        int luku = Integer.valueOf(lukija.nextLine());
        while (luku <= 100) {
            System.out.println(luku);
            luku ++;
        }

    }
}
