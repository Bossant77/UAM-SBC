import random

class Termometro:
    def __init__(self, temperatura=None):
        if temperatura is None:
            self.__temperatura = random.uniform(0.0, 100.0)
        else:
            # Constructor parametrizado
            self.__temperatura = float(temperatura)

    def TemperaturaC(self):
        return self.__temperatura

    def TemperaturaF(self):
        return (self.__temperatura * 9 / 5) + 32

    def Temperaturak(self):
        return self.__temperatura + 273.15

    def mostrarTemperaturas(self):
        print(f"Temperatura en Celsius: {self.TemperaturaC():.2f} °C")
        print(f"Temperatura en Fahrenheit: {self.TemperaturaF():.2f} °F")
        print(f"Temperatura en Kelvin: {self.Temperaturak():.2f} K")

def main():
    print("=== Instancia 1: Constructor por Defecto ===")
    t1 = Termometro() 
    t1.mostrarTemperaturas()
    
    print("\n=== Instancia 2: Constructor Parametrizado ===")
    try:
        input_temp = float(input("Ingresa la temperatura en grados Celsius: "))
        t2 = Termometro(input_temp) 
        t2.mostrarTemperaturas()
    except ValueError:
        print("Error: Debes ingresar un valor numérico.")

if __name__ == "__main__":
    main()