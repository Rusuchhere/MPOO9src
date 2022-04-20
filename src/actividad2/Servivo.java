/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * un Servivo 
 * @author Duque Rafael
 */
public abstract class Servivo {
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena y entero
     * privadas para solo acceder a ellas 
     * por medio de metodos de la misma clase
     */
    public abstract String nombre();
    public abstract int edad();
    
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Servivo{" + '}';
    }
}
