
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        int kertoma = 1;
        while (luku > 1){
            kertoma = kertoma*luku;
            luku --;
        }
        System.out.println(kertoma);

    }
}
