public class Paciente extends Persona {
    private double altura;
    private double peso;

    public Paciente() {
        this.altura = 0;
        this.peso = 0;
    }

    public Paciente(String nombre, String apellido, String genero, int edad, double altura, double peso) {
        super(nombre, apellido, genero, edad);
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + " Altura: " + this.altura + " Peso: " + this.peso;
    }

    @Override
    public void printPersona() {
        super.printPersona();
    }

    public void printPaciente() {
        System.out.println(this.toString());
    }

    public double imc(double peso, double altura) {
        if (altura > 0) {
            return peso / (altura * altura);
        } else {
            return 0;
        }
    }
}
