
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Vitsipankki vitsipankki = new Vitsipankki();

        Kayttoliittyma liittyma = new Kayttoliittyma(vitsipankki, lukija);
        liittyma.kaynnista();
        

    }
}
