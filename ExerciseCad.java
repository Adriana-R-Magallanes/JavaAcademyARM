public class ExerciseCad{
public static void main (String [] args){
String cadenaOriginal = args [0];
String subCadena = " ";
if (args.length<0){
	if (cadenaOriginal.length () < 2){
		
	System.	out.println (cadenaOriginal);
}
else {
	subCadena = cadenaOriginal.substring (0,1);
}
System.out.println ("La subcadena es: " + subCadena);
}
}
}
