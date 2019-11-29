public class MisTiposDeDatos{
	 int edad;
 short peso; //expresada en kg
 String nombre;
 float precio;  
 boolean esVIP;
 boolean tieneCredencial;
 long valorLong;

 public static void main (String [] args){
	 MisTiposDeDatos ejemplo = new MisTiposDeDatos ();

 
ejemplo.edad = Integer.valueOf(args[0]);
System.out.println (ejemplo.edad);
System.out.println (ejemplo.nombre);
System.out.println (ejemplo.precio);
System.out.println (ejemplo.esVIP);
System.out.println (ejemplo.tieneCredencial);
System.out.println (ejemplo.valorLong);


public void setEdad(int edad) {
this.Edad = edad;
}


}
}
