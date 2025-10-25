import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, batas, temp;

		System.out.print("Masukan Bilangan: ");
		batas = input.nextInt();

		for (int i = 1; i <= batas; i++ ) {
			temp = i*i*i;
			if (temp > batas){
				System.out.println(i + " for loop");
				break;
		    }
	    }
		int j = 1;
		while(j <= batas) {
			j++;
			temp = j*j*j;

			if (temp > batas){
				System.out.println(j + " While loop");
				break;
			}
		}

		int k = 0;
		do {
			k++;
			temp = k*k*k;

			if (temp > batas){
				System.out.println(k + " for loop");
				break;		    
	        }
		}while( temp <= batas);
	}

  }
