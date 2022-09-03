import java.util.ArrayList;
public class Huone {
    private ArrayList<Henkilo> henkilot;

    public Huone() {
        this.henkilot = new ArrayList<>();
    }
    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }
    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }
    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }
    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        Henkilo lyhin = this.henkilot.get(0);
        for (Henkilo henkilo: henkilot) {
            if (lyhin.getPituus() > henkilo.getPituus()) {
                lyhin = henkilo;
            } 
        }
        return lyhin;
    }
    public Henkilo ota() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        Henkilo lyhin = this.lyhin();
        this.henkilot.remove(lyhin);
        return lyhin;
    }

}
