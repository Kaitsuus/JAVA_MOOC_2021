
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    public boolean equals(Object verratava) {
        if (this == verratava) {
            return true;
        }
        if (!(verratava instanceof Kappale)) {
            return false;
        }
    
        Kappale verrattavaKappale = (Kappale) verratava;
        if (this.esittaja.equals(verrattavaKappale.esittaja) && 
        this.nimi == verrattavaKappale.nimi && 
        this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
        return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
