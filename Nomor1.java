import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        tampilkanAngkaGanjil(N);
        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }

    public static void tampilkanAngkaGanjil(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
