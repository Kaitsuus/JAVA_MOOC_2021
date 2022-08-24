public class Joukkueet {
    private String koti;
    private String vieras;
    private int kotiPisteet;
    private int vierasPisteet;

    public Joukkueet(String koti, String vieras, int kotiPisteet, int vierasPisteet) {
        this.koti = koti;
        this.vieras = vieras;
        this.kotiPisteet = kotiPisteet;
        this.vierasPisteet = vierasPisteet;
    }

    public String getKoti() {
        return koti;
    }

    public String getVieras() {
        return vieras;
    }

    public int getKotiPisteet() {
        return kotiPisteet;
    }

    public int getVierasPisteet() {
        return vierasPisteet;
    }

    public String toString() {
        return this.koti + " " + this.vieras + " " + this.kotiPisteet + " " + vierasPisteet;
    }
}
