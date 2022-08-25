public class Sekuntikello {
    private Viisari sadasosasekunnit;
    private Viisari sekunnit;

    public Sekuntikello() {
        this.sadasosasekunnit = new Viisari(100);
        this.sekunnit = new Viisari(60);
    }
    public void etene() {
        this.sadasosasekunnit.etene();

        if (this.sadasosasekunnit.arvo() == 0) {
            this.sekunnit.etene();
        }
    }
    public String toString() {
        return sekunnit + ":" + sadasosasekunnit;
    }
}
