import java.util.Scanner;

public class Mandiri1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Bilangan: ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            int jpembagi = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    jpembagi++;
                }
            }

            if (jpembagi == 2) {
                System.out.println("Bilangan Prima      : "+ i);
            }else{
            	System.out.println("Bukan bilangan Prima: "+i);
            }
        }
    }
}
