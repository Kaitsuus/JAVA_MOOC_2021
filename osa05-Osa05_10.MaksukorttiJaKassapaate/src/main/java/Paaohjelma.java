import javax.security.sasl.Sasl;

public class Paaohjelma {

    public static void main(String[] args) {

        Kassapaate unicafe = new Kassapaate();
        System.out.println(unicafe);

        Maksukortti omaKortti = new Maksukortti(2);

        System.out.println("Kortilla on rahaa " + omaKortti.saldo() + " euroa");

        boolean onnistuiko = unicafe.syoMaukkaasti(omaKortti);
        System.out.println("Riittikö raha: " + onnistuiko);

        unicafe.lataaRahaaKortille(omaKortti, 100);

        onnistuiko = unicafe.syoMaukkaasti(omaKortti);
        System.out.println("Riittikö raha: " + onnistuiko);

        System.out.println("kortilla rahaa " + omaKortti.saldo() + " euroa");

        System.out.println(unicafe);

    }
}

