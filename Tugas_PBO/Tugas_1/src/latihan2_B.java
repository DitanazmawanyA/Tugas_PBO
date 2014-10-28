import java.util.Scanner;

public class latihan2_B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float jari_jari;
        float luas;
        float keliling;
        float phi = 3.14f;
        
        System.out.print("Masukkan Jari-jari: ");
        jari_jari = input.nextFloat();
        
        luas = phi * jari_jari * jari_jari;
        keliling = 2 * phi * jari_jari;
        
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}
