
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
public class Carrera {

    String nombre;
    private String facultad;
    private ArrayList<Materia> materiasDeCarrera;

    /**
     * Constructor por defecto
     */
    public Carrera() {
    }

    // Constructor con parámetros
    public Carrera(String nombre, String facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    // Método para agregar una materia nueva    
    public static void agregarMateria(ArrayList<Materia> materias, ArrayList<Profesor> profesores, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.print("Nombre de la materia: ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.println("---------- Profesores ---------- ");
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println((i + 1) + ". " + profesores.get(i).getNombre());
        }
        System.out.print("\nOpcion: ");
        opcion = sc.nextInt();
        while (opcion != 1 && opcion != 2 && opcion != 3) {
            System.out.print("\nElige un profesor: ");
            opcion = sc.nextInt();
        }

        switch (opcion) {
            case 1:
                materias.add(new Materia(nombre, profesor1));
                break;
            case 2:
                materias.add(new Materia(nombre, profesor2));
                break;
            case 3:
                materias.add(new Materia(nombre, profesor3));
                break;
            default:
                break;
        }
        System.out.println();
    }

    // Método para agregar una materia nueva    
    public static void eliminarMateria(ArrayList<Materia> materias) {
        Scanner sc = new Scanner(System.in);
        boolean eliminado = false;
        int opcion = 0;
        System.out.print("Nombre de la materia: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < materias.size(); i++) {
            if (nombre.equalsIgnoreCase(materias.get(i).getNombre())) {
                materias.remove(materias.get(i).getNombre());
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("\nMateria eliminada");
        } else {
            System.out.println("\nLa Materia no se pudo eliminar");
        }
        System.out.println();
    }

    // Método para contar la cantidad de materias existentes    
    public static int contarMaterias(ArrayList<Materia> materias) {
        return materias.size();
    }

    // Método para agregar una materia nueva    
    public void encontrarMateria() {

    }

    // Método para agregar una materia nueva    
    public String toString() {
        return "Nombre: " + this.nombre + "\nFacultad: " + this.facultad + "\n";
    }
}
