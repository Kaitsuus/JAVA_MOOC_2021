
public class Ohjelma {

    public static void main(String[] args) {
        Esine mitta = new Esine("mitta");
        Esine laasti = new Esine("laasti", "remonttitavarat");
        Esine rengas = new Esine("rengas", 5);

        System.out.println(mitta);
        System.out.println(laasti);
        System.out.println(rengas);
    }
}
