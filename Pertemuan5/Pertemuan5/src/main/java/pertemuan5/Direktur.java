package pertemuan5;

/**
 *
 * @author Nur_hanHAN
 */

//Level 3
public class Direktur extends Manajer {
    public void status() {
        System.out.println("Direktur sedang dinas keluar kota.");
    }
    
    public static void main(String[] args) {
        Direktur d1 = new Direktur();
        d1.dataPegawai();
        d1.tugas();
        d1.status();
        
    }    
}

