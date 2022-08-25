
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        double syoEdullisesti = 2.50;

        if (maksu >= syoEdullisesti) {
            this.rahaa += syoEdullisesti;
            this.edulliset++;
            return maksu - syoEdullisesti;
        }else {
            return maksu;
        }
    }
    public boolean syoEdullisesti(Maksukortti kortti) {
        double syoEdullisesti = 2.50;
        if (kortti.saldo() >= syoEdullisesti) {
            this.edulliset++;
        }
        return kortti.otaRahaa(syoEdullisesti);
    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        double syoMaukkaasti = 4.30;

        if (maksu >= syoMaukkaasti) {
            this.rahaa += syoMaukkaasti;
            this.maukkaat++;
            return maksu - syoMaukkaasti;
        }else {
            return maksu;
        }
    }
    public boolean syoMaukkaasti(Maksukortti kortti) {
        double syoMaukkaasti = 4.30;
        if (kortti.saldo() >= syoMaukkaasti) {
            this.maukkaat++;
        }
        return kortti.otaRahaa(syoMaukkaasti);
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
        }
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
