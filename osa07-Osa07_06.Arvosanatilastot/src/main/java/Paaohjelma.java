import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Yhteispisteet yhteispisteet = new Yhteispisteet();

        Kayttoliittyma liittyma = new Kayttoliittyma(lukija, yhteispisteet);
        liittyma.kaynnista();
    }
    
}
