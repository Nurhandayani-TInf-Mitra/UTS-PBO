package pertemuan4;

/**
 *
 * @author Nur_hanHAN
 */
public class Mahasiswa {
    
    private String nama;
    private String nim;
    
    //default constructor
    public Mahasiswa() {
        this.nama = "Tidak diketahui";
        this.nim = "0000000000";        
    }
    
    //parameterized
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    //copy constructor
    public Mahasiswa(Mahasiswa other) {
        this.nama = other.nama;
        this.nim = other.nim;
    }

    public void cetakData() {
        System.out.println("Data Mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println();
    }
}
