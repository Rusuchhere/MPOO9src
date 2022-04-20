/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que indica las funciones y metodos de
 * un alumno declaración de la herencia va
 * a heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clases y subclases
 * @author Duque Rafael
 */
public class Alumno extends Persona{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena y entero
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private String carrera;
    private int semestre;
    /**
     * Constructor vacío
     */
    public Alumno() {
    }
    /**
     * 
     * @param carrera
     * @param semestre
     * @param alto
     * @param ojos
     * @param delgado 
     */
    public Alumno(String carrera, int semestre, boolean alto, boolean ojos, boolean delgado) {
        super(alto, ojos, delgado);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Sobrecarga
     * Modifica o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Alumno{" + '}';
    }
}
