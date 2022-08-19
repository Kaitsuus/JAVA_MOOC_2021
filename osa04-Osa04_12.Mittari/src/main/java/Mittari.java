public class Mittari {
    private int mitta;
    
    public Mittari() {
        this.mitta = 0;
    }
    public void lisaa() {
        if (this.mitta < 5) {
            this.mitta++;
        }
    }
    public void vahenna() {
        if (this.mitta > 0) {
            this.mitta--;
        }
    }
    public int mitta() {
        return this.mitta;
    }
    public boolean taynna() {
        return this.mitta == 5;
    }
}
