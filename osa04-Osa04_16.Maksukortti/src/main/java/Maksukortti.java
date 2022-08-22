public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;
    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";

    }
    public void syoEdullisesti() {
        if (this.saldo >= 2.6) {
            this.saldo = this.saldo - 2.6;
        } else {
            this.saldo = this.saldo - 0.0;
        }
        

    }
    public void syoMaukkaasti() {
        if (this.saldo >= 4.60) {
            this.saldo = this.saldo - 4.60;
        }else {
            this.saldo = this.saldo - 0.0;
        }
        

    }
    public void lataaRahaa(double rahamaara) {
        this.saldo = this.saldo + rahamaara;
        if (rahamaara < 0) {
            this.saldo = this.saldo - rahamaara;
        }

        if (this.saldo > 150) {
            this.saldo = 150;
        }

    }
} 