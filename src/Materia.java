
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yasel Liván Suárez Planche
 */
public class Materia {

    private String nombre; // Nombre de la materia
    private Profesor titular; // El profesor de la materia

    // Constructor por defecto
    public Materia() {
    }

    // Constructor con parámetros
    /**
     * Constructor con parámetros para la materia
     *
     * @param nombre Nombre de la materia
     * @param titular Profesor de la materia
     */
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    // Métodos Get y Set
    /**
     * Devuelve el nombre de la materia
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el nombre de la materia
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve al profesor de la materia
     *
     * @return titular
     */
    public Profesor getTitular() {
        return titular;
    }

    /**
     * Define el profesor de la materia
     *
     * @param titular contiene el titular de la materia
     */
    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    // Método para agregar alumno
    /**
     * Agrega un alumno a la lista de alumnos
     *
     * @param alumnos cotiene la lista de alumnos
     */
    public static void agregarAlumno(ArrayList<Alumno> alumnos) {
        boolean agregado = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Legajo: ");
        int legajo = sc.nextInt();
        System.out.println();
        Alumno alumno = new Alumno(nombre, legajo);
        agregado = alumnos.add(alumno);
        if (agregado) {
            System.out.println("Alumno añadido correctamente\n");
        } else {
            System.out.println("No se puedo añadir el alumno\n");
        }
    }

    // Método para eliminar alumno
    /**
     * Elimina un alumno de la lista de alumnos
     *
     * @param alumnos Contiene la lista de alumnos
     */
    public static void eliminarAlumno(ArrayList<Alumno> alumnos) {
        boolean eliminado = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < alumnos.size(); i++) {
            if (nombre.equalsIgnoreCase(alumnos.get(i).getNombre())) {
                alumnos.remove(alumnos.get(i).getNombre());
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("\nAlumno eliminado correctamente");
        } else {
            System.out.println("\nEl alumno no se pudo eliminar");
        }
        System.out.println();
    }

    public static void agregarAsistencia() {

    }
}
