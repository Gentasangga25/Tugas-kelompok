import java.util.Scanner;

public class gabunganOS6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan angka: ");
        int angka = input.nextInt();

        String hasil = (angka > 0) ? "Bilangan positif" : (angka < 0) ? "Bilangan negatif" : "Nol";

        System.out.println("Angka yang dimasukan adalah " + hasil);

        int x = 5;
        int y = 3;
        int hasilPenjumlahan = x + y;
        int hasilPengurangan = x - y;
        int hasilPerkalian = x * y;
        double hasilPembagian = (y !=0) ? ((double) x / y) : 0;

        System.out.println("Hasil penjumlahan" + hasilPenjumlahan);
        System.out.println("Hasil pengurangan" + hasilPengurangan);
        System.out.println("Hasil perkalian" + hasilPerkalian);
        System.out.println("Hasil pemebagian" + hasilPembagian);

        System.out.print("Masukan pilihan (A, B, atau C): ");
        char pilihan = input.next().charAt(0);

        String teks = (pilihan == 'A') ? "Anda memilih pilihan A" :
                      (pilihan == 'B') ? "Anda memilih pilihan B" :
                      (pilihan == 'C') ? "Anda memilih pilihan C" :
                      "Pilihan yang dimasukan tidak valid";
        System.out.println(teks);
    }
}
