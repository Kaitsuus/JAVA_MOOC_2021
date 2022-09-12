import java.util.ArrayList;;

public class Yhteispisteet {
    private ArrayList<Integer> pisteet;

    public Yhteispisteet() {
        this.pisteet = new ArrayList<>();
    }
    public void lisaa(int syote) {
        this.pisteet.add(syote);
    }
    public double keskiarvo() {
        double pisteidenSumma = 0.0;
        for (Integer syote : pisteet) {
            pisteidenSumma += syote;
        }
        return pisteidenSumma / this.pisteet.size();
    }
    public double hyvaksytty() {
        double hyvaksyttySumma = 0.0;
        int hyvaksytyt = 0;
        for (Integer syote : pisteet) {
            if (syote >= 50) {
                hyvaksyttySumma += syote;
                hyvaksytyt++;
            }
        }
        if (hyvaksytyt != 0) {
            return hyvaksyttySumma / hyvaksytyt;
        }
        return 0.0;
    }
    public double hyvaksymisProsentti() {
        int hyvaksytty = 0;
        for (Integer syote : pisteet) {
            if (syote >= 50) {
                hyvaksytty++;
            }
        }
        return ((1.0 * hyvaksytty) / this.pisteet.size()) * 100;
    }
    public void arvosanajakauma() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + tulostaTahtia(i));
        }
    }
    private int arvosana(int syote) {
        int numero = 5;
        if (syote < 50) {
            numero = 0;
        } else if (syote < 60) {
            numero = 1;
        }else if (syote < 70) {
            numero = 2;
        }else if (syote < 80) {
            numero = 3;
        }else if (syote < 90) {
            numero = 4;
           } else {
            numero = 5;
        }
        return numero;
    }
    private String tulostaTahtia(int arvosana) {
        int maara = 0;
        for (Integer syote : pisteet) {
            if (arvosana(syote) == arvosana) {
                maara++;
            }
        }
        return tahtia(maara);
    }
    private String tahtia(int n) {
        String tahdet = "";
        for (int i = 0; i < n; i++) {
            tahdet += "*";
        }
        return tahdet;
    
    }
}
