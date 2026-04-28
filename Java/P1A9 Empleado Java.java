class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0)
            this.salarioMensual = salarioMensual;
        else
            this.salarioMensual = 0.0;
    }

    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public double getSalarioMensual() { return salarioMensual; }
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) this.salarioMensual = salarioMensual;
        else this.salarioMensual = 0.0;
    }

    public double salarioAnual() { return salarioMensual * 12; }

    public void darAumento(double porcentaje) {
        salarioMensual = salarioMensual + (salarioMensual * porcentaje / 100.0);
    }
}

class EmpleadoTest {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Santiago", "Bolio", 25000.0);
        Empleado e2 = new Empleado("Donald", "Trump", 50000.0);

        System.out.println("--- Salario anual inicial ---");
        System.out.println(e1.getPrimerNombre() + " " + e1.getApellidoPaterno() + ": $" + e1.salarioAnual());
        System.out.println(e2.getPrimerNombre() + " " + e2.getApellidoPaterno() + ": $" + e2.salarioAnual());

        e1.darAumento(10);
        e2.darAumento(10);

        System.out.println("\n--- Salario anual tras aumento del 10% ---");
        System.out.println(e1.getPrimerNombre() + " " + e1.getApellidoPaterno() + ": $" + e1.salarioAnual());
        System.out.println(e2.getPrimerNombre() + " " + e2.getApellidoPaterno() + ": $" + e2.salarioAnual());
    }
}
