import java.util.Scanner;

/**
 * StudiKasus2
 */
public class StudiKasus2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int dokumen, juara, pkm;

        System.out.println("Nama Mahasiswa :");
        nama = sc.nextLine();

        System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) :");
        jenis = sc.nextLine();

        System.out.println("Jumlah Dokumen yang Diupload (0-4) :");
        dokumen = sc.nextInt();

        System.out.println("Peringkat Juara (1/2/3, isi 0 jika bukan juara) :");
        juara = sc.nextInt();

        System.out.println("Status Pendanaan PKM (1=Lolos, 0=Tidak Lolos) :");
        pkm = sc.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA")) {

        } else if (jenis.equalsIgnoreCase("BAKORMA")) {
            if (dokumen >= 4 && juara >= 1 && juara <= 3) {
                System.out.println("Status : Dana penghargaan diberikan");
            } else if (dokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap. Dana penghargaan tidak diberikan");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3)");
            }

        } else if (jenis.equalsIgnoreCase("MANDIRI")) {
            if (dokumen >= 4 && juara >= 1 && juara <= 3) {
                System.out.println("Status : Dana penghargaan diberikan");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3)");
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {
            if (dokumen >= 4 && pkm == 1) {
                System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan)");
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan");
            }

        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan)");
        }
    }
}