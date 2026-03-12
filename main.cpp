#include "Empleado.cpp"
int main() {
    
    Empleado objeto1;
    cout << objeto1.toString() << endl;

    
    Empleado objeto2("Donald Trump", 2025, 400000.99);
    cout << objeto2.toString() << endl;

    
    string nom;
    int anio;
    double sal;
    
    
    cout << "Ingresa el nombre del empleado: ";
    getline(cin, nom); 

    cout << "Ingrese el anio de contratacion: ";
    cin >> anio;

    cout << "Ingrese el salario: ";
    cin >> sal;

  
    Empleado objeto3(nom, anio, sal);
    
   
    cout << "\n--- Resultado Objeto 3 ---" << endl;
    cout << objeto3.toString() << endl;

    return 0;
}