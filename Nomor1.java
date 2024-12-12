import java.util.Scanner;

public class Nomor1 {
    public static void tampilkanBilanganGanjil(int n) {
        System.out.print("Bilangan ganjil dari 0 hingga " + n + " adalah: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan n: ");
        int n = input.nextInt();
        
        tampilkanBilanganGanjil(n);
        
        input.close();
    }
}
