
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut: ");
        int summa = 0;
        int syotot = 0;
        int parilliset = 0;
        int pariton = 0;
        while (true) {
            
            int luvut = Integer.valueOf(lukija.nextLine());
            
            if (luvut == -1) {
                break;
            }
            if (luvut % 2 == 0) {
                parilliset++;
            } else {
                pariton++;
            }

            summa += luvut;
            syotot++;
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: "+summa);
        System.out.println("Lukuja: "+syotot);
        System.out.println("Keskiarvo: "+1.0*summa/syotot);
        System.out.println("Parillisia: "+parilliset);
        System.out.println("Parittomia: "+pariton);
    }
}
