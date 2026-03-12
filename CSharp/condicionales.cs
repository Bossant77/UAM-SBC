// Santiago de Jesús Bolio Cano
//540809
using System;
class estructuraCondicional {
  static void Main() {
   
    //contadores de categoria y acumuladores de peso
    int ni = 0, jo = 0, ad = 0, ma = 0;
    float pni = 0, pjo = 0, pad = 0, pma = 0;

    for (int i = 0; i < 5; i++) {
        float peso;
        int edad;
        
        Console.WriteLine("Edad de la persona: ");
        edad = int.Parse(Console.ReadLine());
        
        
        Console.WriteLine("Peso de la persona: ");
        peso= float.Parse(Console.ReadLine());
        
        
        if (edad <= 12) {
            ni++;
            pni += peso;
        } else if (edad <= 29) {
            jo++;
            pjo += peso;
        } else if (edad <= 59) {
            ad++;
            pad += peso;
        } else {
            ma++;
            pma += peso;
        }
    }

    Console.WriteLine("Total de niños: " + ni + ", Peso promedio: " + pni / ni );
    Console.WriteLine("Total de jóvenes: " + jo + ", Peso promedio: " + pjo / jo );
    Console.WriteLine("Total de adultos: " + ad + ", Peso promedio: " + pad / ad );
    Console.WriteLine("Total de adultos mayores: " + ma + ", Peso promedio: " + pma / ma );
    
}
  }
