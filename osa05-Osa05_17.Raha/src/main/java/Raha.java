public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
        return uusi;
    }
    public boolean vahemman(Raha verrattava) {
        return (100 * this.euroa + this.senttia) < (100 * verrattava.eurot() + verrattava.sentit());
    }
    public Raha miinus(Raha vahentaja) {
            Raha uusi;
            int uusi2 = (this.euroa * 100 + this.senttia) - (vahentaja.euroa * 100 + vahentaja.senttia);
            if (uusi2 <= 0) {
                uusi = new Raha(0, 0);
            } else {
                uusi = new Raha(0, uusi2);
            }
            return uusi;
    }

}
