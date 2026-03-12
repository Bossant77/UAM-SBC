#include <iostream>
#include <random>

class Termometro {
private:
    float temperatura;  

public:
    Termometro() {
        std::random_device rd;
        std::mt19937 gen(rd());
        std::uniform_real_distribution<float> dis(0.0f, 100.0f);
        temperatura = dis(gen);
    }

    Termometro(float temp) {
        temperatura = temp;
    }

    float TemperaturaC() {
        return temperatura; 
    }

    float TemperaturaF() {
        return (temperatura * 9.0f / 5.0f) + 32.0f; 
    }

    float Temperaturak() {
        return temperatura + 273.15f; 
    }

    void mostrarTemperaturas() {
        std::cout << "Temperatura en Celsius: " << TemperaturaC() << " °C\n";
        std::cout << "Temperatura en Fahrenheit: " << TemperaturaF() << " °F\n";
        std::cout << "Temperatura en Kelvin: " << Temperaturak() << " K\n";
    }
};


int main() {
    std::cout << "=== Instancia 1: Constructor por Defecto ===\n";
    Termometro t1; 
    t1.mostrarTemperaturas();

    std::cout << "\n=== Instancia 2: Constructor Parametrizado ===\n";
    float inputTemp;
    std::cout << "Ingresa la temperatura en grados Celsius: ";
    std::cin >> inputTemp; 

    Termometro t2(inputTemp); 
    t2.mostrarTemperaturas();

    return 0;
}