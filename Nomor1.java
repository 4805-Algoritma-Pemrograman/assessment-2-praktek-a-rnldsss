import java.util.Scanner;

public class Nomor1 {

    public static void tampilkanAngkaGanjil(int N) {
        System.out.println("Angka Ganjil");
        for (int i = 0; i <= N; i++) {
        if (i % 2 != 0) {
            System.out.println(i + "");
        }
    }
    System.out.println();
}

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();
        tampilkanAngkaGanjil(N);
    
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
}
