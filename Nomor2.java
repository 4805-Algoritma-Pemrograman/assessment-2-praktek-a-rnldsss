import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();

    public static void main(String[] args) {
        int[] hargaMenu = {35000, 45000, 20000, 15000};
        String[] namaMenu = {"Burger", "Steak", "Spaghetti", "Kentang"};
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]: ");
            String pilihanMenu = input.next();
            int indexMenu = -1;

            for (int i = 0; i < namaMenu.length; i++) {
                if (namaMenu[i].equals(pilihanMenu)) {
                    indexMenu = i;
                    break;
                }
            }

            if (indexMenu != -1) {
                keranjangBelanja.add(hargaMenu[indexMenu]);
            } else {
                System.out.println("Menu tidak tersedia");
            }

            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = input.next();

            if (jawaban.equals("N")) {
                break;
            }
        }

        int totalBelanja = hitungTotalBelanja();
        int diskon = hitungDiskon(totalBelanja);
        int totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan : " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar : " + totalBayar);
        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }

    public static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }

    public static int hitungDiskon(int totalBelanja) {
        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja <= 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.1);
        }
    }
}
