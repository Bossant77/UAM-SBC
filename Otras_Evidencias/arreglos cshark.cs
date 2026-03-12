// Santiago de Jesús Bolio Cano
//540809

using System;
class Arreglos {
  static void Main() {
   
   
   //declaración orientada a objetos
   //clase[]objeto = new Clase[];
   int[] arreglo = new int[10];
   
   Console.WriteLine("indice \tValor");
   
   for(int indice = 0; indice< arreglo.Length; indice++){
       Console.WriteLine(indice+"\t"+ arreglo[indice]);
   }
  }
}