// Santiago de Jesús Bolio Cano
//540809

#include <iostream>
using namespace std;
int main()
{
string nombre;
int n1, n2;
cout << ("¿cual es tu nombre?")<< endl;
cin >> nombre;
cout <<(" hola ", nombre, " escribe dos valores enteros: ");
cin >> n1;
cin >> n2;
cout<< "la suma es: " << (n1+n2);
    return 0;
}