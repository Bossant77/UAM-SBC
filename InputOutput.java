// Santiago de Jesús Bolio Cano
//540809

import java.util.Scanner; // Librería para ingreso de datos

class InputOutput{
    public static void main(String args[]){
        
        // NombreClase nombreObjeto = new NombreClase();
        Scanner     input = new   Scanner(System.in);
        
        String nombre;
        int n1, n2;
        
        System.out.println("¿cual es tu nombre?");
        nombre = input.nextLine(); // input() - cin>>
        
        System.out.println(" hola " + nombre+ " escribe dos valores enteros: ");
        n1 = input.nextInt(); //int(input())
        n2 = input.nextInt();
        
        System.out.println("la suma es: "+ (n1+n2));
    }
}