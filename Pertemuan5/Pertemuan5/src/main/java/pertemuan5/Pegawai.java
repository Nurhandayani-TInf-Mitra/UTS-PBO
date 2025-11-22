package pertemuan5;

/**
 *
 * @author Nur_hanHAN
 */

/** Latihan Ke-2. Implementasikan multilevel inheritance menggunakan
 * class Pegawai, Manajer, dan Direktur, lalu tampilkan seluruh method dari
 * class Direktur
 */

//Level 1
public class Pegawai {
    String nama;
    String nip;
    String jabatan;
           
    public void dataPegawai() {
        System.out.println("Data Pegawai:");
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Jabatan: " + jabatan);
        System.out.println();
    }    
        
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        
        p1.nama = "Nurhandayani";
        p1.nip = "32602300114";
        p1.jabatan = "ceo";
        
        Pegawai p2 = new Pegawai();
        p2.nama = "Nur";
        p2.nip = "1234567890";
        p2.jabatan = "Manajer";
        
        Pegawai p3 = new Pegawai();
        p3.nama = "Nur Han";
        p3.nip = "1234567891";
        p3.jabatan = "Direktur";
        
        p1.dataPegawai();
        p2.dataPegawai();
        p3.dataPegawai();
    }   
}
