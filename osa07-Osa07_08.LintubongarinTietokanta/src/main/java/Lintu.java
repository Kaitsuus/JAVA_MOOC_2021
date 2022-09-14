public class Lintu {
    private String nimi;
    private String latinankielinenNimi;
    private int havainto;

    public Lintu(String nimi, String latinankielininNimi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielininNimi;
        this.havainto = 0;
    }
    public String getNimi() {
        return this.nimi;
    }
    public String getLatinankielinenNimi() {
        return this.latinankielinenNimi;
    }
    public int getHavaittu() {
        return this.havainto;
    }
    public void lisaaHavainto() {
        this.havainto++;
    }
    public String toString() {
        return this.getNimi() + " (" + this.getLatinankielinenNimi() + "): " + this.getHavaittu() + " havaintoa";
    }
}
