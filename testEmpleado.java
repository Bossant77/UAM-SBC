import java.util.Scanner;
public class testEmpleado
{
	public static void main(String[] args) {
	    Empleado objeto1 = new Empleado();
	    objeto1.imprimir();
	    
	    Empleado objeto2 = new Empleado("Donald Trump", 2025, 400000.99);
	    objeto2.imprimir();
	    
	    Scanner leer = new Scanner(System.in);
	    
	    String nom;
	    int anio;
	    double sal;
	    
	    System.out.println("Ingresa el nombre del Empleado: ");
	    nom= leer.next();
	    
	    System.out.println("Ingresa el año de contratación: ");
	    anio= leer.nextInt();
	    
	    System.out.println("Ingresa el salario: ");
	    sal= leer.nextDouble();
	    
	    Empleado objeto3 = new Empleado(nom, anio, sal);
	    objeto3.imprimir();
	}
}