import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Tulostelua {
 
    public static void main(String[] args) {

        tulostaTahtia(3);
        System.out.println("\n---"); 
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---"); 
    }

    public static void tulostaTahtia(int maara) {
        int a = 0;
        while (a < maara) {
            System.out.print("*");
            a++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int b = 1;
        while (b <= sivunpituus) {
            tulostaTahtia(sivunpituus);
            b++;
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int c = 1;
        while (c <= korkeus) {
            tulostaTahtia(leveys);
            c++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int c = 1;
        while (c <= koko) {
            tulostaTahtia(c);
            c++;
        }
    }
}