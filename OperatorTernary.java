import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan angka: ");
    int angka = input.nextInt();
 
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
    System.out.println("Angka yang dimasukkan adalah " + hasil);
        }
}
 
