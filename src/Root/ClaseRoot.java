package Root;
public class ClaseRoot {
    //Elementos para Registrar_Administrador y Registrar_Root
    String nombreApellido, rut, direccion, pregunta;
    int telefono;
    boolean sexo;

    public ClaseRoot(String nombreApellido, String rut, String direccion, boolean sexo, String pregunta, int telefono) {
        this.nombreApellido = nombreApellido;
        this.rut = rut;
        this.direccion = direccion;
        this.sexo = sexo;
        this.pregunta = pregunta;
        this.telefono = telefono;
    }
}