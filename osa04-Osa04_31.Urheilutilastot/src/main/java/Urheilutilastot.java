
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        ArrayList<Joukkueet> joukkeet = tiedostonTilastot(tiedosto);
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();
        int pelatutPelit = 0, voitot = 0, tappiot = 0;

        for (Joukkueet pelit : joukkeet) {
            if (pelit.getKoti().equals(joukkue) || pelit.getVieras().equals(joukkue)) {
                pelatutPelit++;
                if (pelit.getKoti().equals(joukkue)) {
                    if (pelit.getKotiPisteet() >= pelit.getVierasPisteet()) {
                        voitot++;
                    } else {
                        tappiot++;
                    }
                }
                if (pelit.getVieras().equals(joukkue)) {
                    if (pelit.getKotiPisteet() < pelit.getVierasPisteet()) {
                        voitot++;
                    } else {
                        tappiot++;
                    }
                }
            } 
        }
        System.out.println("Otteluita: " + pelatutPelit);
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + tappiot);
    }
    public static ArrayList<Joukkueet> tiedostonTilastot(String tiedosto) {
        ArrayList<Joukkueet> joukkueet = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osa = rivi.split(",");
                String koti = osa[0];
                String vieras = osa[1];
                int kotiPisteet = Integer.valueOf(osa[2]);
                int vierasPisteet = Integer.valueOf(osa[3]);
                joukkueet.add(new Joukkueet(koti, vieras, kotiPisteet, vierasPisteet));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return joukkueet;
    }
}  




