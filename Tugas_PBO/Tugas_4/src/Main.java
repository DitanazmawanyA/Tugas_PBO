public class Main {

    public static void main(String[] args) {

        Persegi persegi = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(8, 4);
        Segitiga segitiga = new Segitiga(6, 4, 5, 5, 6);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("=== PERSEGI ===");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());

        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas: " + pp.hitungLuas());
        System.out.println("Keliling: " + pp.hitungKeliling());

        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());

        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
    }
}
