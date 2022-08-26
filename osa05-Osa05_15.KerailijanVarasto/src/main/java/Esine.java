public class Esine {
    private String tunnus;
    private String nimi;

    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    public String getTunnus() {
        return tunnus;
    }
    public String getNimi() {
        return nimi;
    }
    public boolean equals (Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        if (!(verrattava instanceof Esine)) {
            return false;
        }
        Esine verrattavaEsine = (Esine) verrattava;
        if (this.tunnus.equals(verrattavaEsine.tunnus)) {
            return true;
        }
        return false;
    }
    public String toString() {
        return this.tunnus + ": " + this.nimi;

    }

}
