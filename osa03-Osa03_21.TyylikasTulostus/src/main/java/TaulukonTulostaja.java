
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        for (int i = 0; i < taulukko.length -1; i++) {
            System.out.print(taulukko[i] + ", ");
        }
        System.out.print(taulukko[taulukko.length - 1]);
    }
}
