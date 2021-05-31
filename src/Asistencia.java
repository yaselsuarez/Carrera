
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yasel Liván Suárez Planche
 */
public class Asistencia {

    private String fecha;

    /**
     * Constructor por defecto
     */
    public Asistencia() {
    }

    /**
     * Constructor con parámetros
     *
     * @param fecha contiene la fecha de asistencia
     */
    public Asistencia(String fecha) {
        this.fecha = fecha;
    }

    // Métodos Get y Set
    /**
     * Devuelve la fecha de asistencia
     *
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de asistencia
     *
     * @param fecha contiene la fecha de asistencia
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método para agregar alumno
    public static void agregarAlumno(Alumno alumno) {

    }

    // Método para eliminar alumno
    public static void eliminarAlumno(Alumno alumno) {

    }

}
