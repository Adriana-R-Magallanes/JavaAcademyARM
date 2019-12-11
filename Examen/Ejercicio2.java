package Examen;
import java.util.Scanner;;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero");
		int m = scan.nextInt();
		System.out.println("Dame otro numero");
		int n = scan.nextInt();
		
		if (m <= 21 && m > n) {
			System.out.println(a);
		}else if(n<= 21 && n>m) {
			System.out.println(b);
		}else if(m >= 21 && n>=21) {
			System.out.println("0");
		}else {
			System.out.println("ERROR");
		}
	}
}