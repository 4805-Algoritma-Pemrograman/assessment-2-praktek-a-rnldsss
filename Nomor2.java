import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    
    public static final int[] hargaMenu = {35000, 45000, 20000, 15000};
    public static ArrayList<Integer> keranjangBelanja = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String pilihan;
            
            do {
                System.out.print("Masukkan nama menu [Burger/Steak/Spaghetti/French fries]: ");
                String menu = input.nextLine();

                // Menentukan harga berdasarkan input pengguna
                int harga = 0;
                switch (menu.toLowerCase()) {
                    case "burger":
                        harga = hargaMenu[0];
                        break;
                    case "steak":
                        harga = hargaMenu[1];
                        break;
                    case "spaghetti":
                        harga = hargaMenu[2];
                        break;
                    case "french fries":
                        harga = hargaMenu[3];
                        break;
                    default:
                        System.out.println("Menu tidak tersedia.");
                        continue; 
                }

                keranjangBelanja.add(harga);
                
                System.out.print("Input lagi (Y/N)?: ");
                pilihan = input.nextLine();
            } while (pilihan.equalsIgnoreCase("Y"));
        }
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

    public static double hitungDiskon(int total) {
        if (total < 50000) {
            return 0; // Tidak ada diskon
        } else if (total >= 50000 && total <= 100000) {
            return total * 0.05; // Diskon 5%
        } else {
            return total * 0.10; // Diskon 10%
        }
    }
}
