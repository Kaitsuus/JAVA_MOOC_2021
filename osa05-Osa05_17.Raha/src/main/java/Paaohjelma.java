public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa
       // Raha a = new Raha(10, 0);
      //Raha b = new Raha(5, 0);

        //Raha c = a.plus(b);
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        //a = a.plus(c);
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
       
       
       // Raha a = new Raha(10, 0);
        //Raha b = new Raha(3, 0);
        //Raha c = new Raha(5, 0);

        //System.out.println(a.vahemman(b));
        //System.out.println(b.vahemman(c));

        Raha a = new Raha(10, 0);
        Raha b = new Raha(3, 50);

        Raha c = a.miinus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.miinus(a);        // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "c:n langan päähän"
        //       vanha c:n langan päässä ollut 6.5 euroa häviää ja Javan roskien kerääjä korjaa sen pois

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e

        
    }
}
