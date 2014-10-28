import java.util.Scanner;

public class Program_sepeda {
    String merk;
    int jarak = 0;

    void maju() {
        jarak = jarak + 10;

        System.out.println("\n========== STRUK SEPEDA ==========");
        System.out.println("Merk Sepeda    : " + merk);
        System.out.println("Aktivitas      : Bergerak Maju");
        System.out.println("Jarak Bergerak : 10 Km");
        System.out.println("Jarak Tempuh   : " + jarak + " Km");
        System.out.println("==================================");
    }

    void mundur() {
        jarak = jarak - 5;

        System.out.println("\n========== STRUK SEPEDA ==========");
        System.out.println("Merk Sepeda    : " + merk);
        System.out.println("Aktivitas      : Bergerak Mundur");
        System.out.println("Jarak Bergerak : 5 Km");
        System.out.println("Jarak Tempuh   : " + jarak + " Km");
        System.out.println("==================================");
    }

    void berhenti() {
        System.out.println("\n================================");
        System.out.println("Merk Sepeda    : " + merk);
        System.out.println("Status         : Berhenti");
        System.out.println("Jarak Tempuh   : " + jarak + " Km");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Program_sepeda sepeda = new Program_sepeda();

        System.out.print("Masukan Object Merk Sepeda: ");
        sepeda.merk = input.nextLine();

        System.out.println("Object " + sepeda.merk
                + " dibuat, jarak tempuh awal 0 km");

        int pilihan = -1;

        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    sepeda.maju();
                    break;

                case 2:
                    sepeda.mundur();
                    break;

                case 3:
                    sepeda.berhenti();
                    break;

                case 0:
                    System.out.println("Program Selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }

        } while (pilihan != 0);

        input.close();
    }
}