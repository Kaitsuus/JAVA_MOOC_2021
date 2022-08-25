
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kuutio a = new Kuutio(4);
        System.out.println(a);
        System.out.println(a.tilavuus());
    }
}
