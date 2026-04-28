class Empleado:
    def __init__(self, primer_nombre, apellido_paterno, salario_mensual):
        self.__primer_nombre = primer_nombre
        self.__apellido_paterno = apellido_paterno
        self.__salario_mensual = salario_mensual if salario_mensual > 0 else 0.0

    def get_primer_nombre(self):
        return self.__primer_nombre

    def set_primer_nombre(self, primer_nombre):
        self.__primer_nombre = primer_nombre

    def get_apellido_paterno(self):
        return self.__apellido_paterno

    def set_apellido_paterno(self, apellido_paterno):
        self.__apellido_paterno = apellido_paterno

    def get_salario_mensual(self):
        return self.__salario_mensual

    def set_salario_mensual(self, salario_mensual):
        self.__salario_mensual = salario_mensual if salario_mensual > 0 else 0.0

    def salario_anual(self):
        return self.__salario_mensual * 12

    def dar_aumento(self, porcentaje):
        self.__salario_mensual += self.__salario_mensual * porcentaje / 100.0


def main():
    e1 = Empleado("Santiago", "Bolio", 25000.0)
    e2 = Empleado("Donald", "Trump", 50000.0)

    print("--- Salario anual inicial ---")
    print(f"{e1.get_primer_nombre()} {e1.get_apellido_paterno()}: ${e1.salario_anual()}")
    print(f"{e2.get_primer_nombre()} {e2.get_apellido_paterno()}: ${e2.salario_anual()}")

    e1.dar_aumento(10)
    e2.dar_aumento(10)

    print("\n--- Salario anual tras aumento del 10% ---")
    print(f"{e1.get_primer_nombre()} {e1.get_apellido_paterno()}: ${e1.salario_anual()}")
    print(f"{e2.get_primer_nombre()} {e2.get_apellido_paterno()}: ${e2.salario_anual()}")


if __name__ == "__main__":
    main()
