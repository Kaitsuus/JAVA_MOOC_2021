
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        int a = 0;
        while (a < maara) {
            System.out.print("*");
            a++;

        }
        System.out.println("");

    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        int b = 0;
        while (b < maara) {
            System.out.print(" ");
            b++;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        int c = 1;
        while (c <= koko){
            tulostaTyhjaa(koko - c);
            tulostaTahtia(c);
            c++;

        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int d = 1;
        while (d <= korkeus) {
            tulostaTyhjaa(korkeus - d);
            tulostaTahtia(2 * d -1);
            d++;
        }
        int e = 1;
        while (e < 3) {
            tulostaTyhjaa(korkeus - 2);
            tulostaTahtia(3);
            e++;
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
