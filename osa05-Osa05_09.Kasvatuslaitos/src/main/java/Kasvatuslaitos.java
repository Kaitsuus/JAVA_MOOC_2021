
public class Kasvatuslaitos {
    private int punnitse;


    public Kasvatuslaitos() {
        this.punnitse = 0;
    }
    public int punnitse(Henkilo henkilo) {
        this.punnitse++;
        return henkilo.getPaino();
    }
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino()+1);
    }
    public int punnitukset() {
        return this.punnitse;
    }

}
