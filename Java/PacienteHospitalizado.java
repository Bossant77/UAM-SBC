public class PacienteHospitalizado extends Paciente {
    private int habitacion;
    private String tipoCirugia;

    public PacienteHospitalizado() {
        super();
        this.habitacion = 0;
        this.tipoCirugia = "";
    }

    public PacienteHospitalizado(String nombre, String apellido, String genero, int edad, double altura, double peso, int habitacion, String tipoCirugia) {
        super(nombre, apellido, genero, edad, altura, peso);
        this.habitacion = habitacion;
        this.tipoCirugia = tipoCirugia;
    }

    public void indicaciones() {
        System.out.println("Generando indicaciones post-operatorias para cirugía de " + this.tipoCirugia + " en la habitación " + this.habitacion + "...");
    }
}
