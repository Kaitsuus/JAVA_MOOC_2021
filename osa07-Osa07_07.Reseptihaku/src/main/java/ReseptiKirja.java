
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReseptiKirja {
    private ArrayList<Resepti> reseptit;

    public ReseptiKirja() {
        this.reseptit = new ArrayList<>();
    }

    public void reseptinLuku(String tiedostonNimi) {
        try (Scanner syote = new Scanner(new File(tiedostonNimi))) {
            while (syote.hasNextLine()) {
                String reseptiNimi = syote.nextLine();
                int reseptiAika = Integer.valueOf(syote.nextLine());
                Resepti resepti = new Resepti(reseptiNimi, reseptiAika);
                reseptit.add(resepti);
                while (syote.hasNextLine()) {
                    String aines = syote.nextLine();
                    if (aines.isEmpty()) {
                        break;
                    }
                    resepti.lisaaAinekset(aines);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void listaa() {
        System.out.println("Reseptit");
        for (Resepti resepti : reseptit) {
            System.out.println(resepti);
        }
    }
    public void haeNimi(String nimi) {
        System.out.println("Reseptit");
        for (Resepti resepti : reseptit) {
            if (resepti.getNimi().contains(nimi)) {
                System.out.println(resepti);
            }  
        }
    }
    public void haeKeittoaika(int korkeintaan) {
        System.out.println("Reseptit");
        for (Resepti resepti : reseptit) {
            if (resepti.getAika() <= korkeintaan) {
                System.out.println(resepti);
            }
        }
    }
    public void haeAine(String aines) {
        for (Resepti resepti : reseptit) {
            if (resepti.getAinekset().contains(aines)) {
                System.out.println(resepti);
                System.out.println("");
            }
        }
    }
}


