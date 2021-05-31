/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Yaso
 */
public class Profesor {

    private String nombre;
    private int legajo;
    private double basico;
    private int antiguedad;

    /**
     * Constructor por defecto
     */
    public Profesor() {
    }

    /**
     * Constructor con parámetros
     *
     * @param nombre contiene el nombre del profesor
     * @param legajo contiene el legajo del profesor
     * @param basico contiene el salario basico del profesor
     * @param antiguedad contiene la antiguedad del profesor
     */
    public Profesor(String nombre, int legajo, double basico, int antiguedad) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    // Métodos Get y Set
    /**
     * Devuelve el nombre del profesor
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del profesor
     *
     * @param nombre contiene el nombre del profesor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el legado del profesor
     *
     * @return legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * Establece el legajo del profesor
     *
     * @param legajo contiene el legajo del profesor
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    /**
     * Devuelve el salario básico del profesor
     *
     * @return basico
     */
    public double getBasico() {
        return basico;
    }

    /**
     * Establece el salario básico del profesor
     *
     * @param basico contiene el salario básico del profesor
     */
    public void setBasico(double basico) {
        this.basico = basico;
    }

    /**
     * Devuelve la antiguedad del profesor
     *
     * @return antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Establece la antiguedad del profesor
     *
     * @param antiguedad contiene la antiguedad del profesor
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * Calcula y devuelve el salario del profesor con el plues que le
     * corresponde
     *
     * @return sueldo
     */
    public double calcularSueldo() {
        double plus = this.basico * 0.10;
        double sueldo = this.basico;
        int cont = 1;
        for (int i = 0; i < this.antiguedad; i++) {
            if (cont == 5) {
                sueldo = sueldo + plus;
                cont = 0;
            }
            cont++;
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return "Profesor: " + this.nombre + "\nLegajo: " + this.legajo + "\nAntiguedad: " + this.antiguedad + "\nSueldo: " + calcularSueldo() + "\n";
    }
}
