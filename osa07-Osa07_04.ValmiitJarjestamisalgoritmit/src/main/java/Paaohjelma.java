import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        jarjesta(taulukko);
        System.out.println(Arrays.toString(taulukko));
        String[] merkkijonot = {"minä", "sinä", "hän", "me", "te", "he"};
        jarjesta(merkkijonot);
        System.out.println(Arrays.toString(merkkijonot));
    }
    public static void jarjesta(int[] taulukko) {
        Arrays.sort(taulukko);

    }
    public static void jarjesta(String[] taulukko) {
        Arrays.sort(taulukko);

    }
    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        Collections.sort(luvut);
    }
    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot) {
        Collections.sort(merkkijonot);
    }

}
