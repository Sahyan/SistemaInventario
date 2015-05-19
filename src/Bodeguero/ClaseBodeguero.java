package Bodeguero;

import java.util.ArrayList;

public class ClaseBodeguero {
    //Arreglo de lista para Bodeguero_Registrar
    String nombre, rol, rut, cargo;
    int edad;
    

    public ClaseBodeguero(String nombre, String rol, String rut, String cargo, int edad) {
        this.nombre = nombre;
        this.rol = rol;
        this.rut = rut;
        this.cargo = cargo;
        this.edad = edad;
    }
}