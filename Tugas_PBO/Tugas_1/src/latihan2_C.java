import java.util.Scanner;

public class latihan2_C {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int jam,menit,detik,total_detik;
        
        System.out.print("Masukkan jam  : ");
        jam = input.nextInt();
        System.out.print("Masukkan Menit: ");
        menit = input.nextInt();
        System.out.print("Masukkan Detik: ");
        detik = input.nextInt();
        
        total_detik = jam * 3600 + menit * 60 + detik;
        
        System.out.println("Total Detik : " + total_detik);
    }
}
