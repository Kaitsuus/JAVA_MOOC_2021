
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        Tavara kirja = new Tavara("aapinen", 2);
        Tavara puhelin = new Tavara("nokia", 1);

        System.out.println("kirjan nimi: " + kirja.getNimi());
        System.out.println("kirjan paino: " + kirja.getPaino());

        System.out.println("Kirja: " + kirja);
        System.out.println("Puhelin: " + puhelin);

        Matkalaukku testi = new Matkalaukku(10);
        testi.lisaaTavara(kirja);
        Matkalaukku testi2 = new Matkalaukku(10);
        testi2.lisaaTavara(puhelin);
        Matkalaukku adanLaukku = new Matkalaukku(10);
        adanLaukku.lisaaTavara(kirja);
        adanLaukku.lisaaTavara(puhelin);

        Lastiruuma lastiruuma = new Lastiruuma(1000);
        lastiruuma.lisaaMatkalaukku(adanLaukku);
        lastiruuma.lisaaMatkalaukku(testi);
        System.out.println("Ruumassa:");
        lastiruuma.tulostaTavarat();
        System.out.println(lastiruuma);
    }

}
