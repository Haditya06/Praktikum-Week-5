import java.util.Scanner;

public class Latihan2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Nilai Batas: ");
		int batas = input.nextInt();

		int sum = 0;
		boolean first = true;

		for(int i = 2; i<= batas; i += 2){
			sum += i;

			if(!first){
				System.out.print(" + ");
			}
			System.out.print(i);
			first = false;
		}
		System.out.println(" = " + sum);
		
	}
}