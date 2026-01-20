// Santiago de Jesús Bolio Cano
//540809

#include <iostream>
#include <array>
using namespace std;
int main()
{
    
    array <int, 10> arreglo; //int arreglo[10];
    
    cout<<"indice" <<"\t" <<"Valor"<< endl;
    //estructura cómun para manipular arreglos es for
    for (int indice = 0; indice < 10; indice++){
        arreglo[indice] = 0;
        cout << indice << "\t" << arreglo[indice] << endl;
    }
    return 0;
}