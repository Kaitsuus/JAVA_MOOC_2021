
public class Paaohjelma {

    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(2);

        laskuri.tulostaArvo();

        laskuri.nollaa();
        laskuri.tulostaArvo();
        
        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}
