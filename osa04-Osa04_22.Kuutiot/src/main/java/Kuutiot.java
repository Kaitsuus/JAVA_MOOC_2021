
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String jono = lukija.nextLine();
            if (jono.equals("loppu")) {
                break;
            }
            int maara = Integer.valueOf(jono);
            System.out.println(maara*maara*maara);
       }
    }
}
