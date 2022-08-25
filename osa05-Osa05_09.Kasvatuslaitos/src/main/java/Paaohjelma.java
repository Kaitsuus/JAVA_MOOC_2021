
public class Paaohjelma {

    public static void main(String[] args) {
        Kasvatuslaitos asd = new Kasvatuslaitos();
        Henkilo matti = new Henkilo("matti", 2, 123, 40);
        System.out.println(asd.punnitse(matti));
        asd.syota(matti);
        asd.punnitse(matti);
        System.out.println(asd.punnitse(matti));
        System.out.println(asd.punnitukset());
    }
}
