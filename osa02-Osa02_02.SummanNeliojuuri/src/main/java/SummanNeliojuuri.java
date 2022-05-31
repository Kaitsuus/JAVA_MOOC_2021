
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("");
        int toka = Integer.valueOf(lukija.nextLine());
        int summa = eka + toka;
        double neliojuuri = Math.sqrt(summa);
        System.out.println(neliojuuri);

    }
}
