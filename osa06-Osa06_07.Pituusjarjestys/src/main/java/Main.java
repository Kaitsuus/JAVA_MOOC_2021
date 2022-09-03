
public class Main {

    public static void main(String[] args) {
        // Kokeile luokkaasi täällä
        Huone huone = new Huone();
        System.out.println("Huone tyhjä? " + huone.onTyhja());
        huone.lisaa(new Henkilo("lea", 183));
        huone.lisaa(new Henkilo("kenya", 182));
        huone.lisaa(new Henkilo("auli", 186));
        huone.lisaa(new Henkilo("nina", 172));
        huone.lisaa(new Henkilo("terhi", 185));
        System.out.println("Huone tyhjä? " + huone.onTyhja());

        while (!huone.onTyhja()) {
            System.out.println(huone.ota());
        }
        

    }
}
