
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        // Voit kokeilla ohjelmasi toimintaa täällä
        Sekuntikello kello = new Sekuntikello();

        while (true) {
            System.out.println(kello);
            kello.etene();
        }
    }
}
