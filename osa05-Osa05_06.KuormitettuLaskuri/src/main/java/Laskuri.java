public class Laskuri {
    private int arvo;
    
    public Laskuri(int alkuarvo) {
        this.arvo = alkuarvo;
    }
    public Laskuri() {
        this(0);
    }
    public int arvo() {
        return this.arvo;
    }
    public void lisaa() {
        this.arvo += 1;
    }
    public void lisaa(int lisays) {
        if (lisays >= 0) {
            this.arvo += lisays;
        }
    }
    public void vahenna() {
        this.arvo -= 1;
    }
    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            this.arvo -= vahennys;
        }
    }
}
