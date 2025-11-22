package pertemuan3;

/**
 *
 * @author Nur_hanHAN
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        setNim(nim); //gunakan setter
    }
    
    //getter nama
    public String getNama() {
        return nama;
    }
    
    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //getter nim
    public String getNim() {
        return nim;
    }
    
    //setter nim dengan validasi (10 digit)
    public void setNim(String nim) {
        if (nim.matches("\\d{10}")) {
            this.nim = nim;
        } else {
            throw new IllegalArgumentException("NIM harus 10 digit angka");            
        }
    }
    
    public void cetakData() {
        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("");
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Nurhandayani", "1234567890");
        mhs1.cetakData();
        
        //contoh jika nim tidak 10 digit, pembuatan objek langsung dihentikan.
        Mahasiswa mhs2 = new Mahasiswa("Nur", "123");
        mhs2.cetakData();
                
    }
}
