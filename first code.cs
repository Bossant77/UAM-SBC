// Santiago de Jesús Bolio Cano
//540809

using System;
class inputOutput{
    static void Main(){
        
        string nombre;
        int n1, n2;
        
        Console.WriteLine("¿cual es tu nombre?");
        nombre = Console.ReadLine(); // input() - cin>>
        
        Console.WriteLine(" hola " + nombre+ " escribe dos valores enteros: ");
        n1 = int.Parse(Console.ReadLine()); //int(input())
        n2 = int.Parse(Console.ReadLine());
        
        Console.WriteLine("la suma es: "+ (n1+n2));
    }
}