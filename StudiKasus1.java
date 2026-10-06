import java.util.Scanner;

/**
 * StudiKasus1
 */
public class StudiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup=18000, jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        System.out.println("Masukan jumlah cup  : ");
        jumlahCup=sc.nextInt();
        System.out.println("Masukan uang bayar  : ");
        uangBayar=sc.nextInt();
        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;
        if (totalHarga>=100000) {
            diskon=totalHarga*10/100;
        }
        totalBayar=totalHarga-diskon;
        System.out.println("Total harga :"+totalHarga);
        System.out.println("Diskon  :"+diskon);
        System.out.println("Total bayar :"+totalBayar);
        if (uangBayar>=totalBayar) {
            kembalian=uangBayar-totalBayar;
            System.out.println("Kembalian   :"+kembalian);
        } else {
            kurang=totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. "+kurang);
        }
    }
}