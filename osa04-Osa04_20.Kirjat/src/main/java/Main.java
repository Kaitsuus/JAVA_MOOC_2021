
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Sivuja: ");
            int sivut = Integer.valueOf(lukija.nextLine());

            System.out.println("Julkaisuvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());

            kirjat.add(new Kirja(nimi, sivut, vuosi));
        }

        System.out.println("Mitä tulostetaan?");
        String mitatulostetaan = lukija.nextLine();

        for (Kirja kirja: kirjat) {
            if(mitatulostetaan.equals("kaikki")) {
                System.out.println(kirja);
            }
            if(mitatulostetaan.equals("nimi")) {
                System.out.println(kirja.getNimi());
            }
        }
    }
}    

