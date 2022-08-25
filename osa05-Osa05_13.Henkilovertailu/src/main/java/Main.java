
public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne
        Paivays pvm = new Paivays(24, 3, 2017);
        Paivays pvm2 = new Paivays(23, 7, 2017);

        Henkilo leevi = new Henkilo("leevi", pvm, 62, 9);
        Henkilo lilja = new Henkilo("lilja", pvm2, 65, 8);

        if (leevi.equals(lilja)) {
            System.out.println("Miten meni omasta mielestä?");
        }

        Henkilo leeviEriPainolla = new Henkilo("leevi", pvm, 62, 10);

        if (leevi.equals(leeviEriPainolla)) {
            System.out.println("Miten meni omasta mielestä?");
        }

        
    }
}
