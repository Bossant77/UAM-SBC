from abc import ABC, abstractmethod

class Empleado(ABC):
    def __init__(self, nombre: str, apellido: str, nss: str):
        self._primerNombre = nombre
        self._apellidoPaterno = apellido
        self._numeroSeguroSocial = nss

    def establecerPrimerNombre(self, nombre: str) -> None:
        self._primerNombre = nombre

    def obtenerPrimerNombre(self) -> str:
        return self._primerNombre

    def establecerApellidoPaterno(self, apellido: str) -> None:
        self._apellidoPaterno = apellido

    def obtenerApellidoPaterno(self) -> str:
        return self._apellidoPaterno

    def establecerNumeroSeguroSocial(self, nss: str) -> None:
        self._numeroSeguroSocial = nss

    def obtenerNumeroSeguroSocial(self) -> str:
        return self._numeroSeguroSocial

    def toString(self) -> str:
        return f"{self.obtenerPrimerNombre()} {self.obtenerApellidoPaterno()}\nNúmero de seguro social: {self.obtenerNumeroSeguroSocial()}"

    @abstractmethod
    def ingresos(self) -> float:
        pass


class EmpleadoAsalariado(Empleado):
    def __init__(self, nombre: str, apellido: str, nss: str, salario: float):
        super().__init__(nombre, apellido, nss)
        self.establecerSalarioSemanal(salario)

    def establecerSalarioSemanal(self, salario: float) -> None:
        if salario >= 0.0:
            self._salarioSemanal = salario
        else:
            raise ValueError("El salario semanal debe ser >= 0.0")

    def obtenerSalarioSemanal(self) -> float:
        return getattr(self, '_salarioSemanal', 0.0)

    def ingresos(self) -> float:
        return self.obtenerSalarioSemanal()

    def toString(self) -> str:
        return f"Empleado asalariado: {super().toString()}\nSalario semanal: ${self.obtenerSalarioSemanal():.2f}"


class EmpleadoPorHoras(Empleado):
    def __init__(self, nombre: str, apellido: str, nss: str, sueldo: float, horas: float):
        super().__init__(nombre, apellido, nss)
        self.establecerSueldo(sueldo)
        self.establecerHoras(horas)

    def establecerSueldo(self, sueldo: float) -> None:
        if sueldo >= 0.0:
            self._sueldo = sueldo
        else:
            raise ValueError("El sueldo por hora debe ser >= 0.0")

    def obtenerSueldo(self) -> float:
        return getattr(self, '_sueldo', 0.0)

    def establecerHoras(self, horas: float) -> None:
        if 0.0 <= horas <= 168.0:
            self._horas = horas
        else:
            raise ValueError("Las horas trabajadas deben ser >= 0.0 y <= 168.0")

    def obtenerHoras(self) -> float:
        return getattr(self, '_horas', 0.0)

    def ingresos(self) -> float:
        if self.obtenerHoras() <= 40:
            return self.obtenerSueldo() * self.obtenerHoras()
        else:
            return 40 * self.obtenerSueldo() + (self.obtenerHoras() - 40) * self.obtenerSueldo() * 1.5

    def toString(self) -> str:
        return f"Empleado por horas: {super().toString()}\nSueldo por hora: ${self.obtenerSueldo():.2f}; Horas trabajadas: {self.obtenerHoras()}"


class TrabajadorPiezas(Empleado):
    def __init__(self, nombre: str, apellido: str, nss: str, salarioPieza: float, numPiezas: int):
        super().__init__(nombre, apellido, nss)
        self.establecerSalarioPieza(salarioPieza)
        self.establecerNumPiezas(numPiezas)

    def establecerSalarioPieza(self, salarioPieza: float) -> None:
        if salarioPieza >= 0.0:
            self._salario = salarioPieza
        else:
            raise ValueError("El salario por pieza debe ser >= 0.0")

    def obtenerSalarioPieza(self) -> float:
        return getattr(self, '_salario', 0.0)

    def establecerNumPiezas(self, numPiezas: int) -> None:
        if numPiezas >= 0:
            self._piezas = numPiezas
        else:
            raise ValueError("El número de piezas debe ser >= 0")

    def obtenerNumPiezas(self) -> int:
        return getattr(self, '_piezas', 0)

    def ingresos(self) -> float:
        return self.obtenerNumPiezas() * self.obtenerSalarioPieza()

    def toString(self) -> str:
        return f"Trabajador por piezas: {super().toString()}\nSalario por pieza: ${self.obtenerSalarioPieza():.2f}; Piezas producidas: {self.obtenerNumPiezas()}"


class EmpleadoPorComision(Empleado):
    def __init__(self, nombre: str, apellido: str, nss: str, ventasBrutas: float, tarifaComision: float):
        super().__init__(nombre, apellido, nss)
        self.establecerVentasBrutas(ventasBrutas)
        self.establecerTarifaComision(tarifaComision)

    def establecerVentasBrutas(self, ventas: float) -> None:
        if ventas >= 0.0:
            self._ventasBrutas = ventas
        else:
            raise ValueError("Las ventas brutas deben ser >= 0.0")

    def obtenerVentasBrutas(self) -> float:
        return getattr(self, '_ventasBrutas', 0.0)

    def establecerTarifaComision(self, tarifa: float) -> None:
        if 0.0 < tarifa < 1.0:
            self._tarifaComision = tarifa
        else:
            raise ValueError("La tarifa de comisión debe ser > 0.0 y < 1.0")

    def obtenerTarifaComision(self) -> float:
        return getattr(self, '_tarifaComision', 0.0)

    def ingresos(self) -> float:
        return self.obtenerTarifaComision() * self.obtenerVentasBrutas()

    def toString(self) -> str:
        return f"Empleado por comisión: {super().toString()}\nVentas brutas: ${self.obtenerVentasBrutas():.2f}; Tarifa de comisión: {self.obtenerTarifaComision():.2f}"


class EmpleadoBaseMasComision(EmpleadoPorComision):
    def __init__(self, nombre: str, apellido: str, nss: str, ventasBrutas: float, tarifaComision: float, salarioBase: float):
        super().__init__(nombre, apellido, nss, ventasBrutas, tarifaComision)
        self.establecerSalarioBase(salarioBase)

    def establecerSalarioBase(self, salarioBase: float) -> None:
        if salarioBase >= 0.0:
            self._salarioBase = salarioBase
        else:
            raise ValueError("El salario base debe ser >= 0.0")

    def obtenerSalarioBase(self) -> float:
        return getattr(self, '_salarioBase', 0.0)

    def ingresos(self) -> float:
        return self.obtenerSalarioBase() + super().ingresos()

    def toString(self) -> str:
        return f"Con salario base, {super().toString()}\nSalario base: ${self.obtenerSalarioBase():.2f}"


class PruebaSistemaNomina:
    @staticmethod
    def main():
        empleadoAsalariado = EmpleadoAsalariado("John", "Smith", "111-11-111", 800.00)
        empleadoPorHoras = EmpleadoPorHoras("Karen", "Price", "222-22-222", 16.75, 40)
        empleadoPorComision = EmpleadoPorComision("Sue", "Jones", "333-33-333", 10000, 0.06)
        empleadoBaseMasComision = EmpleadoBaseMasComision("Bob", "Lewis", "444-44-444", 5000, 0.04, 300.0)
        trabajadorPiezas = TrabajadorPiezas("Jane", "Doe", "555-55-555", 2.5, 200)

        empleados = [
            empleadoAsalariado,
            empleadoPorHoras,
            empleadoPorComision,
            empleadoBaseMasComision,
            trabajadorPiezas
        ]

        print("Procesando empleados de forma polimórfica:\n")
        
        for empleado in empleados:
            print(empleado.toString())
            print(f"Ingresos: ${empleado.ingresos():.2f}\n")


if __name__ == "__main__":
    PruebaSistemaNomina.main()
