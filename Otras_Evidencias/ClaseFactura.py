class Factura:
    def __init__(self):
        self.nPieza = ""
        self.dPieza = ""
        self.nArticulos = 0
        self.precio = 0.0

    def obtenerMontoFactura(self):
        if self.nArticulos < 0:
            self.nArticulos = 0
        if self.precio < 0:
            self.precio = 0.0
            
        monto = self.nArticulos * self.precio
        return monto

    def informacionCompra(self):
        monto_total = self.obtenerMontoFactura()
        print(f"Se han comprado {self.dPieza} x {self.nArticulos} piezas")
        print(f"El precio final es de: {monto_total}")
