
public class Main {

    public static void main(String[] args) {

        Viestipalvelu vp = new Viestipalvelu();
        System.out.println(vp.getViestit());
        Viesti v = new Viesti("ad", "toimiiko?");
        vp.lisaa(v);
        System.out.println(vp.getViestit());

    }
}
