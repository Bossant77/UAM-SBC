public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.genero = "";

    }

    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Edad: " + this.edad + " Genero: "
                + this.genero;
    }

    public void printPersona() {
        System.out.println(this.toString());
    }
}
