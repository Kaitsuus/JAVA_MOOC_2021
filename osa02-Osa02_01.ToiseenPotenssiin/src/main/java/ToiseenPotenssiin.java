
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("");
        int luku1 = Integer.valueOf(lukija.nextLine());
        int korotus = luku1 * luku1;
        System.out.println(korotus);

    }
}
