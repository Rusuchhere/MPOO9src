/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de
 * un Gato declaración de la herencia va a
 * heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author josed
 */
public class Gato extends Mascota{
    private boolean manchasPelo;
    /**
     * Constructor vacío
     */
    public Gato() {
    }
    /**
     * 
     * @param manchasPelo
     * @param color
     * @param raza
     * @param pelaje 
     */
    public Gato(boolean manchasPelo, String color, String raza, boolean pelaje) {
        super(color, raza, pelaje);
        this.manchasPelo = manchasPelo;
    }

    //public void 
    //public void
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+ "Gato{" + '}';
    }
     
}
