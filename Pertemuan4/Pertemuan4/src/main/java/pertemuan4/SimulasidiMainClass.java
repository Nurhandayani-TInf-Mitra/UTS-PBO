package pertemuan4;

/**
 *
 * @author Nur_hanHAN
 */
public class SimulasidiMainClass {
    
    public static void main(String[] args) {
        
        //memanggil default constructor
        Mahasiswa mhs1 = new Mahasiswa(); //buat objeknya
        System.out.println("== Default Constructor ==");
        mhs1.cetakData();
        
        //memanggil parameterized constructor
        Mahasiswa mhs2 = new Mahasiswa("Nurhandayani", "1234567890"); //buat objeknya
        System.out.println("== Parameterized Constructor ==");
        mhs2.cetakData();
        
        //memanggil copy consrructor
        Mahasiswa mhs3 = new Mahasiswa(mhs2); //copy dari mhs2
        System.out.println("== Copy Constructor (meng-copy mhs2) ==");
        mhs3.cetakData();        
    }    
}
