import java.util.Scanner;

public class PemilihanPercobaan106 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.println("Masukan angka:  ");
        int angka = input06.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");
        
    }
    
}
