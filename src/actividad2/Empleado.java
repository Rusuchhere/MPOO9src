/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que indica las funciones y metodos de 
 * un empleado declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public class Empleado extends Persona{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo flotante y entero
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private float salario;
    private int horaEntrada;
    private int horaSalida;
    /**
     * Constructor vacío
     */
    public Empleado() {
    }
    /**
     * 
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param alto
     * @param ojos
     * @param delgado 
     */
    public Empleado(float salario, int horaEntrada, int horaSalida, boolean alto, boolean ojos, boolean delgado) {
        super(alto, ojos, delgado);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    /**
     * sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
    
    
}
