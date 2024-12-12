import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> keranjangBelanja = new ArrayList<>();

        while (true) {
            System.out.println("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]:");
            String inputMenu = scanner.nextLine();

            int indexMenu = getIndexMenu(inputMenu);
            if (indexMenu != -1) {
                keranjangBelanja.add(getHargaMenu(indexMenu));
            }

            System.out.println("Input lagi (Y/N)?:");
            String inputLagi = scanner.nextLine();

            if (inputLagi.equalsIgnoreCase("N")) {
                break;
            }
        }

        int totalBelanja = hitungTotalBelanja(keranjangBelanja);
        int diskon = hitungDiskon(totalBelanja);
        int totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan : " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar : " + totalBayar);
        System.out.println(keranjangBelanja.size());
    }

    // Menghitung total belanja
    private static int hitungTotalBelanja(ArrayList<Integer> keranjangBelanja) {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    // Menghitung diskon
    private static int hitungDiskon(int totalBelanja) {
        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.1);
        }
    }

    // Mendapatkan harga menu
    private static int getHargaMenu(int indexMenu) {
        int[] hargaMenu = {35000, 45000, 20000, 15000};
        return hargaMenu[indexMenu];
    }

    // Mendapatkan index menu
    private static int getIndexMenu(String inputMenu) {
        switch (inputMenu) {
            case "Burger":
                return 0;
            case "Steak":
                return 1;
            case "Spaghetti":
                return 2;
            case "Kentang":
                return 3;
            default:
                return -1;
        }
    }
}
