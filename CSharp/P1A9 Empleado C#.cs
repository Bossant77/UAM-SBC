using System;

class Empleado
{
    private string primerNombre;
    private string apellidoPaterno;
    private double salarioMensual;

    public Empleado(string primerNombre, string apellidoPaterno, double salarioMensual)
    {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0)
            this.salarioMensual = salarioMensual;
        else
            this.salarioMensual = 0.0;
    }

    public string PrimerNombre
    {
        get { return primerNombre; }
        set { primerNombre = value; }
    }

    public string ApellidoPaterno
    {
        get { return apellidoPaterno; }
        set { apellidoPaterno = value; }
    }

    public double SalarioMensual
    {
        get { return salarioMensual; }
        set { salarioMensual = value > 0 ? value : 0.0; }
    }

    public double SalarioAnual()
    {
        return salarioMensual * 12;
    }

    public void DarAumento(double porcentaje)
    {
        salarioMensual = salarioMensual + (salarioMensual * porcentaje / 100.0);
    }
}

class EmpleadoTest
{
    static void Main()
    {
        Empleado e1 = new Empleado("Santiago", "Bolio", 25000.0);
        Empleado e2 = new Empleado("Donald", "Trump", 50000.0);

        Console.WriteLine("--- Salario anual inicial ---");
        Console.WriteLine(e1.PrimerNombre + " " + e1.ApellidoPaterno + ": $" + e1.SalarioAnual());
        Console.WriteLine(e2.PrimerNombre + " " + e2.ApellidoPaterno + ": $" + e2.SalarioAnual());

        e1.DarAumento(10);
        e2.DarAumento(10);

        Console.WriteLine("\n--- Salario anual tras aumento del 10% ---");
        Console.WriteLine(e1.PrimerNombre + " " + e1.ApellidoPaterno + ": $" + e1.SalarioAnual());
        Console.WriteLine(e2.PrimerNombre + " " + e2.ApellidoPaterno + ": $" + e2.SalarioAnual());
    }
}
