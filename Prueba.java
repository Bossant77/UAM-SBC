import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE REGISTRO CLÍNICO ---");
            System.out.println("1. Registrar un paciente externo");
            System.out.println("2. Registrar un paciente hospitalizado");
            System.out.println("3. Registrar un médico");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Datos del Paciente Externo ---");
                    System.out.print("Nombre: ");
                    String nombrePxE = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoPxE = scanner.nextLine();
                    System.out.print("Genero: ");
                    String generoPxE = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadPxE = scanner.nextInt();
                    System.out.print("Altura (metros, ej. 1.75): ");
                    double alturaPxE = scanner.nextDouble();
                    System.out.print("Peso (kg): ");
                    double pesoPxE = scanner.nextDouble();
                    System.out.print("Número de consultorio: ");
                    int consultorio = scanner.nextInt();
                    System.out.print("Horario (ej. 10 para 10:00 am): ");
                    int horario = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();

                    PacienteExterno pxEx = new PacienteExterno(nombrePxE, apellidoPxE, generoPxE, edadPxE, alturaPxE, pesoPxE, consultorio, horario, fecha);
                    
                    System.out.println("\n=== REGISTRO EXITOSO ===");
                    // Imprimir datos según instrucciones (Paciente y Persona)
                    pxEx.printPaciente();
                    // Ejecutar el método especial
                    pxEx.examenFisico();
                    // Calcular e imprimir el IMC
                    System.out.println("IMC calculado: " + pxEx.imc(pxEx.getPeso(), pxEx.getAltura()));
                    break;
                    
                case 2:
                    System.out.println("\n--- Datos del Paciente Hospitalizado ---");
                    System.out.print("Nombre: ");
                    String nombrePxH = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoPxH = scanner.nextLine();
                    System.out.print("Genero: ");
                    String generoPxH = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadPxH = scanner.nextInt();
                    System.out.print("Altura (metros, ej. 1.75): ");
                    double alturaPxH = scanner.nextDouble();
                    System.out.print("Peso (kg): ");
                    double pesoPxH = scanner.nextDouble();
                    System.out.print("Habitación: ");
                    int habitacion = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Tipo de Cirugía: ");
                    String cirugia = scanner.nextLine();

                    PacienteHospitalizado pxHosp = new PacienteHospitalizado(nombrePxH, apellidoPxH, generoPxH, edadPxH, alturaPxH, pesoPxH, habitacion, cirugia);
                    
                    System.out.println("\n=== REGISTRO EXITOSO ===");
                    pxHosp.printPaciente();
                    pxHosp.indicaciones();
                    System.out.println("IMC calculado: " + pxHosp.imc(pxHosp.getPeso(), pxHosp.getAltura()));
                    break;
                    
                case 3:
                    System.out.println("\n--- Datos del Médico ---");
                    System.out.print("Nombre: ");
                    String nombreMed = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoMed = scanner.nextLine();
                    System.out.print("Genero: ");
                    String generoMed = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadMed = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer tras el int
                    System.out.print("Especialidad: ");
                    String especialidad = scanner.nextLine();
                    System.out.print("Cédula Profesional: ");
                    int cedula = scanner.nextInt();

                    Medico medico = new Medico(nombreMed, apellidoMed, generoMed, edadMed, especialidad, cedula);
                    System.out.println("\n=== REGISTRO EXITOSO ===");
                    medico.printMedico();
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }
}
