/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de
 * una Mascota declaración de la herencia va
 * a heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public abstract class Mascota extends Servivo{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena y boolean privadas para
     * solo acceder a ellas por medio por medio
     * de metodos de la misma clase.
     */
    private String color;
    private String raza;
    private boolean pelaje;
    /**
     * contructor vacío
     */
    public Mascota() {    
    }
    /**
     * Constructor inicializado con las variables
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Mascota (String color, String raza, boolean pelaje){    
        this.color = color;
        this.raza = raza;
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    @Override
    public String nombre() {
        return nombre();
                }

    @Override
    public int edad() {
        return edad();
    }
    /**
     * Sobre carga
     * Modifica o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Mascota{" + '}';
    }
}
