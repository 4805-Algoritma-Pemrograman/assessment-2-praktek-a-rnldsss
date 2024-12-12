import java.util.Scanner;
import java.util.ArrayList;

public class Nomor2 {
    
    static int[] hargaMenu = {35000, 45000, 20000, 15000};
    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();
    static ArrayList<String> menuMakanan = new ArrayList<>();

    public static void main(String[] args) {
        menuMakanan.add("Burger");
        menuMakanan.add("Steak");
        menuMakanan.add("Spagetti");
        menuMakanan.add("Kentang");

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Daftar Menu:");
            for (int i = 0; i < menuMakanan.size(); i++) {
                System.out.println((i + 1) + ". " + menuMakanan.get(i));
            }
            System.out.print("Masukan nama menu (1-4): ");
            input = scanner.nextLine();
            int pilihan = Integer.parseInt(input);
            if (pilihan >= 1 && pilihan <= 4) {
                int harga = hargaMenu[pilihan - 1];
                keranjangBelanja.add(harga);
            } else {
                System.out.println("Menu tidak tersedia. Silakan coba lagi.");
            }
            System.out.print("Input lagi (Y/N)?: ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));

        int totalBelanja = hitungTotalBelanja();
        double diskon = hitungDiskon(totalBelanja);
        double totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);
    }

    public static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    public static double hitungDiskon(int totalBelanja) {
        double diskon = 0;
        if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            diskon = totalBelanja * 0.05;
        } else if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.10;
        }
        return diskon;
    }
}
