import java.util.Scanner;
public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak;

        System.out.print("Masukkan Jarak Pertarungan anda (dalam satuan meter) :");
        jarak = input.nextDouble();

        if(jarak <= 5 )
            System.out.println("Anda Disarankan Menggunakan Melee Weapon Untuk Melakukan Pertarungan Jarak Dekat, Dikarenakan Jarak Anda Adalah Pertarungan Jarak Dekat");
        else
        System.out.println("Anda disarankan menggunakan ranged weapon untuk melakukan pertarungan jarak jauh, karena jarak pertarungan anda yang jauh");
        input.close();        
    }
}
    

