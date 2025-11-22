package pertemuan5;

/**
 *
 * @author Nur_hanHAN
 */
public class Gitar extends AlatMusik {    
    String caranya = "dipetik";
    @Override
    void dimainkan() {
        System.err.println("Gitar dimainkan dengan cara " + caranya);
    }

public static void main(String[] args) {    
    Gitar gtr = new Gitar();
    
    System.out.println("Berikut " + gtr.nama + " Gitar");    
    gtr.dimainkan();
}
}