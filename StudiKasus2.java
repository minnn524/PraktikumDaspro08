import java.util.Scanner;

/**
 * StudiKasus2
 */
public class StudiKasus2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") || 
            jenis.equalsIgnoreCase("BAKORMA") || 
            jenis.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            int dokumen = sc.nextInt();

            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            int juara = sc.nextInt();

            // Pengecekan tingkat pertama: Kelengkapan Dokumen
            if (dokumen < 4) {
                int kurang = 4 - dokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                // Pengecekan tingkat kedua: Kualifikasi Juara
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3)");
                }
            }

        } 
    }
}