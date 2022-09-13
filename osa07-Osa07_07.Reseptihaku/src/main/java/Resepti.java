import java.util.ArrayList;

public class Resepti {
    private String nimi;
    private int aika;
    private ArrayList<String> ainekset = new ArrayList<>();

    public Resepti(String nimi, int aika) {
        this.nimi = nimi;
        this.aika = aika;
        this.ainekset = new ArrayList<>();
    }
    public String getNimi() {
        return this.nimi;
    }
    public int getAika() {
        return this.aika;
    }
    public void lisaaAinekset(String aines) {
        this.ainekset.add(aines);
    }
    public ArrayList<String> getAinekset() {
        return ainekset;
    }
    public String toString() {
        return this.nimi + ", keittoaika: " + this.aika;
    }
}
