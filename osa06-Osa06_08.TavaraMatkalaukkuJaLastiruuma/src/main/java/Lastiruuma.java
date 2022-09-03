import java.util.ArrayList;

public class Lastiruuma {
    
    private ArrayList<Matkalaukku> matkalaukut;
    private int maxPaino;

    public Lastiruuma(int maxPaino) {
        this.matkalaukut = new ArrayList<>();
        this.maxPaino = maxPaino;
    }
    public void lisaaMatkalaukku(Matkalaukku matkalaukku) {
        int ruumanpaino = 0;
        for (Matkalaukku matkaLaukku : matkalaukut) {
            ruumanpaino += matkaLaukku.yhteispaino();
        }
        if ((this.maxPaino - ruumanpaino) >= matkalaukku.yhteispaino()) {
            this.matkalaukut.add(matkalaukku);
        }
    }
    public String toString() {
        int ruumanpaino = 0;
        for (Matkalaukku matkaLaukku : matkalaukut) {
            ruumanpaino += matkaLaukku.yhteispaino();
        }
        return this.matkalaukut.size() + " matkalaukkua (" + ruumanpaino + " kg)";
    }
    public void tulostaTavarat() {
        for (Matkalaukku matkalaukku : matkalaukut) {
            matkalaukku.tulostaTavarat();
        }
    }
}
