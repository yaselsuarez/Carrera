/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasel Liván Suárez Planche
 */
public class Alumno {

    private String nombre;
    private int legajo;

    /**
     * Constructor por defecto
     */
    public Alumno() {
    }

    /**
     * Constructor con parámetros
     *
     * @param nombre contiene el nombre del alumno
     * @param legajo contiene el legajo del alumno
     */
    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    // Getters and Setters
    /**
     * Devuelve el nombre del alumno
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno
     *
     * @param nombre contiene el nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el legajo del alumno
     *
     * @return legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * Establece el legajo del alumno
     *
     * @param legajo contiene el legajo del alumno
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String toString() {
        return "Alumno: " + this.nombre + "\nLegajo: " + this.legajo + "\n";
    }
}
