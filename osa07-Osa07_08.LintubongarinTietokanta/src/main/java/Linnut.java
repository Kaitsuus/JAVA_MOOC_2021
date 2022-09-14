
import java.util.ArrayList;

public class Linnut {
   
    private ArrayList<Lintu> linnut;

    public Linnut() {
        this.linnut = new ArrayList<>();
    }
    public void lisaa(String nimi, String latinankielinenNimi) {
        Lintu lintu = new Lintu(nimi, latinankielinenNimi);
        this.linnut.add(lintu);
    }
    public void havainto(String nimi) {
        for (Lintu lintu : linnut) {
            if (lintu.getNimi().equals(nimi)) {
                lintu.lisaaHavainto();
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }
    public void tulostaKaikki() {
        for (Lintu lintu : linnut) {
            System.out.println(lintu);
        }
    }
    public void tulostaLintu(String nimi) {
        for (Lintu lintu : linnut) {
            if (lintu.getNimi().equals(nimi)) {
                System.out.println(lintu);
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }
}
