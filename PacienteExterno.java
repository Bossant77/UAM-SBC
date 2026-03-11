public class PacienteExterno extends Paciente {
    private int noConsultorio;
    private int horario; // El diagrama lo pide como int
    private String fecha;

    public PacienteExterno() {
        super();
        this.noConsultorio = 0;
        this.horario = 0;
        this.fecha = "";
    }

    public PacienteExterno(String nombre, String apellido, String genero, int edad, double altura, double peso, int noConsultorio, int horario, String fecha) {
        super(nombre, apellido, genero, edad, altura, peso);
        this.noConsultorio = noConsultorio;
        this.horario = horario;
        this.fecha = fecha;
    }

    // El UML no explicita getters/setters, pero se añade el método requerido:
    public void examenFisico() {
        System.out.println("Realizando examen fisico del paciente externo en consultorio " + this.noConsultorio + "...");
    }
}
