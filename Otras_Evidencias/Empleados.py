class Empleado:

    def __init__(self, nombre="NULL", anio_contratacion=0, salario=0.0):
        
        self.__nombre = nombre
        self.__anio_contratacion = anio_contratacion
        self.__salario = salario

    # Getters y Setters
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_anio_contratacion(self):
        return self.__anio_contratacion

    def set_anio_contratacion(self, anio):
        self.__anio_contratacion = anio

    def get_salario(self):
        return self.__salario

    def set_salario(self, salario):
        self.__salario = salario

    # Métodos adicionales
    def calcular_salario(self):
        return self.__salario

    def to_string(self):
        # Usamos f-strings que es lo más común hoy en día
        return f"\nNombre: {self.__nombre}\nAnio de Contratacion: {self.__anio_contratacion}\nSalario: {self.__salario}"




def main():
   
    emp1 = Empleado()
    print(emp1.to_string())

    
    emp2 = Empleado("Donald Trump", 2025, 400000.99)
    print(emp2.to_string())

   

    nom = input("Ingresa el nombre del empleado: ")
    
   
    anio = int(input("Ingrese el anio de contratacion: "))
    sal = float(input("Ingrese el salario: "))

    emp3 = Empleado(nom, anio, sal)
    

    print(emp3.to_string())


if __name__ == "__main__":
    main()