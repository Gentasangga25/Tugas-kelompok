import java.util.Scanner;

public class gabunganOS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai ujian");
        int nilai = input.nextInt();

        String hasil;
        if (nilai >= 80){
            hasil = "A";
        }   else if (nilai >= 70) {
            hasil = "B";
        }    else if (nilai >= 60) {
            hasil = "C";
        }    else if (nilai >= 50) {
            hasil = "D";
        }    else {
            hasil = "E";
        }

        System.out.println("Hasil ujian" + hasil);
    }
}
