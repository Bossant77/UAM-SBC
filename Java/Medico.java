public class Medico extends Persona {
    private String especialidad;
    private int cedulaProfesional;

    public Medico() {
        this.especialidad = "";
        this.cedulaProfesional = 0;
    }

    public Medico(String nombre, String apellido, String genero, int edad, String especialidad, int cedulaProfesional) {
        super(nombre, apellido, genero, edad);
        this.especialidad = especialidad;
        this.cedulaProfesional = cedulaProfesional;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public int getCedulaProfesional() {
        return this.cedulaProfesional;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCedulaProfesional(int cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    public String toString() {
        return super.toString() + " Especialidad: " + this.especialidad + " Cedula Profesional: "
                + this.cedulaProfesional;
    }

    @Override
    public void printPersona() {
        // TODO Auto-generated method stub
        super.printPersona();
    }

    public void printMedico() {
        System.out.println(this.toString());
    }

}
