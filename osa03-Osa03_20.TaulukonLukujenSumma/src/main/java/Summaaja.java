
public class Summaaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        System.out.println(laskeTaulukonLukujenSumma(taulukko));
    }

    public static int laskeTaulukonLukujenSumma(int[] taulukko) {
        // Kirjoita koodia tänne
        int summa = 0;
        for (int i = 0; i < taulukko.length; i++){
            summa += taulukko[i];
        }
        return summa;
    }
}
