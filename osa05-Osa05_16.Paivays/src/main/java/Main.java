
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
       // Paivays testi = new Paivays(25, 11, 1990);
        //Paivays testi2 = new Paivays(30, 11, 1990);
        //Paivays testi3 = new Paivays(30, 12, 1990);

        //testi.etene();
        //testi2.etene();
        //testi3.etene();
        //System.out.println(testi);
        //System.out.println(testi2);
        //System.out.println(testi3);
        //testi.etene(20);
        //testi2.etene(31);
        //testi3.etene(31);
        //System.out.println(testi);
        //System.out.println(testi2);
        //System.out.println(testi3);
        Paivays pvm = new Paivays(13, 2, 2015);
        System.out.println("Tarkistellun viikon perjantai on " + pvm);
    
        Paivays uusiPvm = pvm.paivienPaasta(7);
        int vk = 1;
        while (vk <= 7) {
            System.out.println("Perjantai " + vk + " viikon kuluttua on " + uusiPvm);
            uusiPvm = uusiPvm.paivienPaasta(7);
    
            vk = vk + 1;
        }
    
    
        System.out.println("Päivämäärä 790:n päivän päästä tarkistellusta perjantaista on ... kokeile itse!");
        System.out.println("Kokeile " + pvm.paivienPaasta(790));
    }
}
