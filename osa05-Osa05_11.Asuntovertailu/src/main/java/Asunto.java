
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    public int getHuoneita() {
        return this.huoneita;
    }
    public int getNeliota() {
        return this.nelioita;
    }
    public int getNeliohinta() {
        return this.neliohinta;
    }

    public boolean suurempi(Asunto verratava) {
        int verrattava1 = this.getNeliota();
        int verratava2 = verratava.getNeliota();

        if (verrattava1 > verratava2) {
            return true;
        }
        return false;

    }
    public int getHinta() {
        return this.nelioita * this.neliohinta;
    }
    public int hintaero(Asunto verratava) {
        int verratavaEro1 = this.getHinta();
        int verratavaEro2 = verratava.getHinta();

        if (verratavaEro1 > verratavaEro2) {
            return this.getHinta() - verratava.getHinta();
        } else {
            return verratava.getHinta() - this.getHinta(); 
        }
    }
    public boolean kalliimpi(Asunto verratava) {
        int verratavaHinta1 = this.getHinta();
        int verratavaHinta2 = verratava.getHinta();

        if (verratavaHinta1 > verratavaHinta2) {
            return true;
        }
        return false;
    }

}
