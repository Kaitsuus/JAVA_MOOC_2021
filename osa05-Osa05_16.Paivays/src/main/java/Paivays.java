
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    public void etene() {
        this.paiva += 1;
        if (this.paiva > 30) {
            this.kuukausi +=1;
            this.paiva =1;
            if (this.kuukausi > 12) {
                this.vuosi +=1;
                this.kuukausi = 1;
            }
        }
    }
    public void etene(int montakoPaivaa){
        int x = 0;
        while (x < montakoPaivaa) {
            this.etene();
            x = x + 1;
        }
    }
    public Paivays paivienPaasta(int montaPaivaa) {
        Paivays uusiPaivays = new Paivays(paiva, kuukausi, vuosi);
        int x = 0;
        while (x < montaPaivaa) {
            uusiPaivays.etene();
            x = x + 1;
        }
        return uusiPaivays;
        
    }
}
