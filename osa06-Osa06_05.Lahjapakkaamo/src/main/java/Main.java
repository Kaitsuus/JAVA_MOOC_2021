
public class Main {

    public static void main(String[] args) {
        Lahja kirja = new Lahja("Aapinen", 2);

        Pakkaus paketti = new Pakkaus();
        paketti.lisaaLahja(kirja);
        System.out.println(paketti.yhteispaino());
    }
}
