import java.util.Scanner;

class Termometro {
    private float temperatura; 

    public Termometro() {
        this.temperatura = (float) (Math.random() * 100.0);
    }

    public Termometro(float temperatura) {
        this.temperatura = temperatura;
    }

    public float TemperaturaC() { 
        return this.temperatura;
    }

    public float TemperaturaF() { 
        return (this.temperatura * 9.0f / 5.0f) + 32.0f;
    }

    public float Temperaturak() {
        return this.temperatura + 273.15f;
    }

    public void mostrarTemperaturas() { 
        System.out.printf("Temperatura en Celsius: %.2f °C\n", TemperaturaC());
        System.out.printf("Temperatura en Fahrenheit: %.2f °F\n", TemperaturaF());
        System.out.printf("Temperatura en Kelvin: %.2f K\n", Temperaturak());
    }
}

public class Test { 
    public static void main(String[] args) { 
        System.out.println("=== Instancia 1: Constructor por Defecto ===");
        Termometro t1 = new Termometro(); 
        t1.mostrarTemperaturas();

        System.out.println("\n=== Instancia 2: Constructor Parametrizado ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: "); 
        float inputTemp = scanner.nextFloat(); 
        
        Termometro t2 = new Termometro(inputTemp); 
        t2.mostrarTemperaturas();
        
        scanner.close();
    }
}