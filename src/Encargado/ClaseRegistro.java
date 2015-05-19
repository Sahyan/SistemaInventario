package Encargado;
public class ClaseRegistro {
    //Elementos para Registrador_Encargado
    String nombreComlpleto, cargo, rol, pregunta, rut;
    int telefono;

    public ClaseRegistro(String nombreComlpleto, String cargo, String rol, String pregunta, String rut, int telefono) {
        this.nombreComlpleto = nombreComlpleto;
        this.cargo = cargo;
        this.rol = rol;
        this.pregunta = pregunta;
        this.rut = rut;
        this.telefono = telefono;
    }

    //Elementos para Registrar_Bodeguero
    String nombreApellido;
    int edad;

    public ClaseRegistro(String nombreApellido, String rut, int edad, String cargo) {
        this.nombreApellido = nombreApellido;
        this.rut = rut;
        this.edad = edad;
        this.cargo = cargo;
    }
    
    //Elementos para 
}