
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        while (luku > 0){
            summa += luku;
            luku --;
        }
        System.out.println("Summa on "+summa);


    }


}
