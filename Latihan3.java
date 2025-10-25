import java.util.Scanner;

public class Latihan3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Bilangan: ");
		int n = input.nextInt();

		int jpembagi = 0;

		for(int i = 1; i <= n; i++){
			if(n%i ==0){
				jpembagi++;
			}
		}

		if(jpembagi == 2){
			System.out.print(n +" Bilangan Prima");
		}else {
			System.out.print(n+" Bukan Bilangan Prima");
		}


	}
}