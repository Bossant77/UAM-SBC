// Santiago de Jesús Bolio Cano
//540809


class Arreglos {
  public static void main(String args[]) {
   
   //declaración orientada a objetos
   //clase[]objeto = new Clase[];
   int[] arreglo = new int[10];
   
    System.out.println("indice \tValor");
   
   for(int indice = 0; indice< arreglo.length; indice++){
       System.out.println(indice+"\t"+ arreglo[indice]);
   }
  }
}