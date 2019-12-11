package Examen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        map.put("a1234", "Steves Jobs");
        map.put("a1235", "Scott McNealy");
        map.put("a1236", "Jeff Bezos");
        map.put("a1237", "Larry Ellison");
        map.put("a1238", "Bill Gates");
        System.out.println("Ingrese el id");
        String llave = scan.nextLine();
        Persona(llave, map);
        
    }

    private static void Persona(String llave, Map<String, String> map) {
       if (map.containsKey(llave)) {
        System.out.println(llave + " " + map.get(llave));
    }else{
           System.out.println("No existe");
       }
    }
}