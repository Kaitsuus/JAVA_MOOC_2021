
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        int summa = 0;
        for (Integer integer : lista) {
            summa += integer;
        }
        System.out.println("Summa: "+summa);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
