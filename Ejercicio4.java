import java.util.Scanner;
public class Ejercicio4{
	public static void main (String [] args){
		Scanner leer = new Scanner (System.in);
		int x,y,s,r,m,d;
		System.out.println ("Primer numero");
		x=leer.nextInt();
		System.out.println ("Segundo numero");
		y=leer.nextInt ();
		s=x+y;
		r=x-y;
		m=x*y;
		d=x/y;
		System.out.println ("Suma es igual a " + " " + s);
		System.out.println ("Resta es igual a " + " " + r);
		System.out.println ("Multiplicacion es igual a " + " " + m);
		System.out.println ("Division es igual a " + " " + d);
	}
}