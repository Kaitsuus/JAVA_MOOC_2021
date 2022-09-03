import java.util.ArrayList;

public class Matkalaukku {
    private ArrayList<Tavara> tavarat;
    private int maxPaino;

    public Matkalaukku(int maxPaino) {
        this.tavarat = new ArrayList<>();
        this.maxPaino = maxPaino;
    }

    public void lisaaTavara(Tavara tavara) {
            int paino = 0 ;
            for (Tavara i : tavarat) {
                paino += i.getPaino();
            }
            if ((this.maxPaino - paino) >= tavara.getPaino()) {
                this.tavarat.add(tavara);
            }
        
    }
    public String toString() {
        int paino = 0;
        for (Tavara tavara : tavarat) {
            paino += tavara.getPaino();
        }
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (" + paino + " kg)";
        }
        if (this.tavarat.size() == 1) {
            return "1 tavara (" + paino + " kg)";
        }
        return this.tavarat.size() + " tavaraa (" + paino + " kg)";
    }
    public void tulostaTavarat() {
        for (Tavara tavara : tavarat) {
            System.out.println(tavara.toString());
        }
    }
    public int yhteispaino() {
        int yhteyspaino = 0;
        for (Tavara tavara : tavarat) {
            yhteyspaino += tavara.getPaino();
        }
        return yhteyspaino;
    }
    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }
        Tavara raskainTavara = this.tavarat.get(0);
        for (Tavara tavara : tavarat) {
            if (raskainTavara.getPaino() < tavara.getPaino()) {
                raskainTavara = tavara;
            }
        }
        return raskainTavara;
    }
    
}
