public class NumeroPar{
	public static void main (String [] args){
	int valorEntero = Integer.valueOf(args [1]);
		boolean esPar = valorEntero%2 == 0;
	
	if(esPar == true){
		System.out.println ("El numero" + " " + valorEntero + "es par");
	} else{
		System.out.println ("El numero" + " " + valorEntero + "no es par");
	}
	
	}
}
