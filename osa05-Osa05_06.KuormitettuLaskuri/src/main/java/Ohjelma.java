
public class Ohjelma {

    public static void main(String[] args) {
        Laskuri a = new Laskuri(0);
        System.out.println(a.arvo());
        a.lisaa();
        System.out.println(a.arvo());
        a.vahenna();
        System.out.println(a.arvo());
        a.lisaa(30);
        System.out.println(a.arvo());
        a.vahenna(-40);
        System.out.println(a.arvo());
    }
}
