import java.util.Scanner;
public class Votar{
    
public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
      int n;
      System.out.println("ingrese su edad: ");
      n = dato.nextInt();
      
      if(n>=18){
          System.out.println("Mayor de edad, puedes votar");
      }
      else{
          System.out.println("Menor de edad,no puedes votar");
      }
    }
    
}