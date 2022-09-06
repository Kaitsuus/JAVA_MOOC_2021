
import java.util.Scanner;

public class Nestesailiot {
    
    private Sailio sailio1;
    private Sailio sailio2;
    private Scanner lukija;
    
    public Nestesailiot(Sailio sailio1, Sailio sailio2, Scanner lukija) {
        this.sailio1 = sailio1;
        this.sailio2 = sailio2;
        this.lukija = lukija;
    }    
    public void kaynnista() {
        while (true) {
            System.out.println("Ensimmäinen: " + this.sailio1);
            System.out.println("Toinen: " + this.sailio2);
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            luettu = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (luettu.equals("lisaa")) {
                this.sailio1.lisaa(maara);
            }
            if (luettu.equals("siirra")) {
                if (maara > 0 ) {
                    if (maara > this.sailio1.sisalto()) {
                        this.sailio2.lisaa(this.sailio1.sisalto());
                        this.sailio1.poista(maara);
                    } else {
                        this.sailio1.poista(maara);
                        this.sailio2.lisaa(maara);
                    }
                }

            }
            if (luettu.equals("poista")) {
                this.sailio2.poista(maara);
           }
        }

    }
        
}

