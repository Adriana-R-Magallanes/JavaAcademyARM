public class Vocales {
	public static void main (String [] args){
	contar ("Pepe pecas pica papas con un pico");
	
	}
	public static void contar (String cadena){
		String vocales = "aeiou";
		int contador [] = {0,0,0,0,0};
		
		for (int i=0;i<cadena.length();i++)
		{
			for (int j=0;j<vocales.length();j++)
			{
				if (cadena.charAt(i)==vocales.charAt(j))
				{
					contador [j]++;
				}
			}
		}
		for (int i=0;i<vocales.length();i++)
		{
			System.out.println ("Aparece la letra " + vocales.charAt(i)+ ": " + contador[i] + "veces");
		}
	}
}


