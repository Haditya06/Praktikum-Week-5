import java.util.Random;
import java.util.Scanner;

public class Mandiri2{
	public static void main(String[] args) {
		Random gen = new Random();
		Scanner input = new Scanner(System.in);

		System.out.print("Tebak angka antara 0-100 : ");
		int nilai = gen.nextInt(100);

		int batasAtas = 100;
		int batasBawah = 0;
		int jumlahTebakan = 0;
		boolean tebak = false;

		while(!tebak){
			int n = input.nextInt();
			jumlahTebakan ++;
			
			if(nilai == n){
				tebak = true;
				System.out.println("yee bener : " + n);
				System.out.println("Banyak banget nebak : " + jumlahTebakan);
				break;
			}else if(n > nilai  && n < batasAtas){
				batasAtas = n;
				System.out.println("Tebakan anda lebih Kecil");
			}else if(n < nilai && n > batasBawah){
				batasBawah = n;
				System.out.println("Tebakan lebih besar");
			}else{
				System.out.print("Bang lebihh bangg!!");
			}
			System.out.print("Tebakan angka antara " + batasBawah + " - " + batasAtas + " : ");
		}
	}
}