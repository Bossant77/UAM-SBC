using System;

class Termometro { 
    private float temperatura; 

    public Termometro() { 
        Random rnd = new Random();
        this.temperatura = (float)(rnd.NextDouble() * 100.0);
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

    public void mostrarTemperaturas() { // 
        Console.WriteLine($"Temperatura en Celsius: {TemperaturaC():F2} °C");
        Console.WriteLine($"Temperatura en Fahrenheit: {TemperaturaF():F2} °F");
        Console.WriteLine($"Temperatura en Kelvin: {Temperaturak():F2} K");
    }
}

class Test { 
    static void Main(string[] args) { 
        Console.WriteLine("=== Instancia 1: Constructor por Defecto ===");
        Termometro t1 = new Termometro(); 
        t1.mostrarTemperaturas();

        Console.WriteLine("\n=== Instancia 2: Constructor Parametrizado ===");
        Console.Write("Ingresa la temperatura en grados Celsius: "); 
        
        if (float.TryParse(Console.ReadLine(), out float inputTemp)) {
            Termometro t2 = new Termometro(inputTemp); 
            t2.mostrarTemperaturas();
        } else {
            Console.WriteLine("Entrada no válida. Debes ingresar un número flotante.");
        }
    }
}