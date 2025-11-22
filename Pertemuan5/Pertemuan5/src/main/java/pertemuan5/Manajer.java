package pertemuan5;

/**
 *
 * @author Nur_hanHAN
 */

//Level 2 dari multilevel
public class Manajer extends Pegawai{
    public void tugas() {
        System.out.println("Manajer bertugas mengatur tim dan membuat laporan");
    }
    
    public static void main(String[] args) {
    Manajer m1 = new Manajer();
    m1.tugas();
}
}
  
