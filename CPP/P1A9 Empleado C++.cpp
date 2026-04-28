#include <iostream>
#include <string>
using namespace std;

class Empleado {
private:
    string primerNombre;
    string apellidoPaterno;
    double salarioMensual;

public:
    Empleado(string primerNombre, string apellidoPaterno, double salarioMensual) {
        this->primerNombre = primerNombre;
        this->apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0)
            this->salarioMensual = salarioMensual;
        else
            this->salarioMensual = 0.0;
    }

    string getPrimerNombre() { return primerNombre; }
    void setPrimerNombre(string n) { primerNombre = n; }

    string getApellidoPaterno() { return apellidoPaterno; }
    void setApellidoPaterno(string a) { apellidoPaterno = a; }

    double getSalarioMensual() { return salarioMensual; }
    void setSalarioMensual(double s) {
        if (s > 0) salarioMensual = s;
        else salarioMensual = 0.0;
    }

    double salarioAnual() { return salarioMensual * 12; }

    void darAumento(double porcentaje) {
        salarioMensual = salarioMensual + (salarioMensual * porcentaje / 100.0);
    }
};

int main() {
    Empleado e1("Santiago", "Bolio", 25000.0);
    Empleado e2("Donald", "Trump", 50000.0);

    cout << "--- Salario anual inicial ---" << endl;
    cout << e1.getPrimerNombre() << " " << e1.getApellidoPaterno() << ": $" << e1.salarioAnual() << endl;
    cout << e2.getPrimerNombre() << " " << e2.getApellidoPaterno() << ": $" << e2.salarioAnual() << endl;

    e1.darAumento(10);
    e2.darAumento(10);

    cout << "\n--- Salario anual tras aumento del 10% ---" << endl;
    cout << e1.getPrimerNombre() << " " << e1.getApellidoPaterno() << ": $" << e1.salarioAnual() << endl;
    cout << e2.getPrimerNombre() << " " << e2.getApellidoPaterno() << ": $" << e2.salarioAnual() << endl;

    return 0;
}
