import java.util.Scanner;

public class gabunganOS7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan angka : ");
        int angka = input.nextInt();

        String jenisAngka = (angka > 0) ? "positif" : (angka < 0) ? "negatif" : "nol";
        System.out.println("Angka yang dimasukan adlah bilangan" + jenisAngka);

        System.out.print("Masukan pilihan (A, B, atau C): ");
        char pilihan = input.next().charAt(0);

        String hasilPilihan = (pilihan == 'A') ? "Anda memilih pilhan A" 
                            : (pilihan == 'B') ? "Anda memilih pilhan B"
                            : (pilihan == 'C') ? "Anda memilih pilhan C"
                            : "Pilihan yang dimasukan tidak valid";
        System.out.println(hasilPilihan); 

   } 
}
