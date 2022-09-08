import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {

        int[] taulukko = {3, 1, 5, 99, 3, 12};
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
   
        System.out.println(Arrays.toString(luvut));
        Paaohjelma.vaihda(luvut, 1, 0);
        System.out.println(Arrays.toString(luvut));
        Paaohjelma.vaihda(luvut, 0, 3);
        System.out.println(Arrays.toString(luvut));
        System.out.println(" ");
        Paaohjelma.jarjesta(luvut);

    }
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i : taulukko){
            if (pienin > i) {
                pienin = i;
            }
        }
        return pienin;
    }
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = pienin(taulukko);
        for (int i = 0 ; i < taulukko.length; i++) {
            if (pienin == taulukko[i]) {
                return i;
            }
        }
        return -1;
    
    }
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int i, pienin = taulukko[aloitusIndeksi], indeksi = aloitusIndeksi;
        for (i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin){
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int paikka;
        paikka = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = paikka;
    }
    public static void jarjesta(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(Arrays.toString(taulukko));
            vaihda(taulukko, i, pienimmanIndeksiAlkaen(taulukko, i));
        }
    }
    

}
