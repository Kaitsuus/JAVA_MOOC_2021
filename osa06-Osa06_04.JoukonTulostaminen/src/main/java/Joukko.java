
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    public String toString() {
        String tulostus = "Joukko " + this.nimi;
        String tulostus2 = "Joukossa " + this.nimi;
        String alkioJono = "";
        if (this.alkiot.isEmpty()) {
            return tulostus + " on tyhjä.";
        } else if (this.alkiot.size() == 1) {
            return tulostus2 + " on " + this.alkiot.size() + " alkio:" + "\n" + this.alkiot.get(0);
        } else {
            for (String alkio : alkiot) {
                alkioJono = alkioJono+alkio + "\n";
            }
            return tulostus2 + " on " + this.alkiot.size() + " alkiota:" + "\n" + alkioJono;
        }
    }
    
}
