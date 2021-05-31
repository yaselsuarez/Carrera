
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaro el objeto scanner
         */
        Scanner sc = new Scanner(System.in);
        /**
         * Declaro una lista para guardar las carreras
         */
        ArrayList<Carrera> carreras = new ArrayList();
        /**
         * Declaro una lista para guardar las materias
         */
        ArrayList<Materia> materias = new ArrayList();
        /**
         * Declaro una lista para guardar los alumnos
         */
        ArrayList<Alumno> alumnos = new ArrayList();
        /**
         * Declaro una lista para guardar los profesores
         */
        ArrayList<Profesor> profesores = new ArrayList();

        /**
         * Creo varias carreras
         */
        Carrera carrera1 = new Carrera("Desarrollo Aplicaciones Web", "Informatica");
        Carrera carrera2 = new Carrera("Administración de Redes", "Informatica");
        Carrera carrera3 = new Carrera("Desarrollo de Aplicaciones Multiplataforma", "Informatica");
        /**
         * Agreggo las carreras a la lista de carreras
         */
        carreras.add(carrera1);
        carreras.add(carrera2);
        carreras.add(carrera3);
        /**
         * Creo varios profesores a la lista
         */
        Profesor profesor1 = new Profesor("Maria Molina", 1, 1400, 5);
        Profesor profesor2 = new Profesor("Manuela Gordillo", 2, 1500, 15);
        Profesor profesor3 = new Profesor("Jose Maria", 3, 1600, 25);
        /**
         * Agreggo los profesores a la lista de profesores
         */
        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);
        /**
         * Creo varias materias
         */
        Materia materia1 = new Materia("Programacion", profesor1);
        Materia materia2 = new Materia("Entorno de Desarrollo", profesor2);
        Materia materia3 = new Materia("Base de Datos", profesor3);
        /**
         * Agreggo las materias a la lista de materias
         */
        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);
        /**
         * Creo varios alumnos
         */
        Alumno alumno1 = new Alumno("Yasel Suárez", 3);
        Alumno alumno2 = new Alumno("Ramiro", 2);
        Alumno alumno3 = new Alumno("Nicolas", 1);
        /**
         * Agreggo los alumnos a la lista de alumnos
         */
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        int opcion;
        do {
            System.out.println("1. Lista de carreras");
            System.out.println("2. Agregar carrera");
            System.out.println("3. Eliminar carrera\n");
            System.out.println("4. Lista de materias");
            System.out.println("5. Agregar materia");
            System.out.println("6. Eliminar materia");
            System.out.println("7. Contar materias\n");
            System.out.println("8. Lista de Alumnos");
            System.out.println("9. Agregar Alumno");
            System.out.println("10. Eliminar Alumno");
            System.out.println("\n11. Salir\n");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    mostrarCarreras(carreras);
                    break;
                case 2:
                    agregarCarrera(carreras);
                    break;
                case 3:
                    eliminarCarrera(carreras);
                    break;
                case 4:
                    mostrarMaterias(materias);
                    break;
                case 5:
                    Carrera.agregarMateria(materias, profesores, profesor1, profesor2, profesor3);
                    break;
                case 6:
                    Carrera.eliminarMateria(materias);
                    break;
                case 7:
                    System.out.println("La cantidad de materias es: " + Carrera.contarMaterias(materias) + "\n");
                    break;
                case 8:
                    mostrarAlumnos(alumnos);
                    break;

                case 9:
                    Materia.agregarAlumno(alumnos);
                    break;
                case 10:
                    Materia.eliminarAlumno(alumnos);
                    break;
                case 11:
                    System.out.println("¡¡¡ADIOS¡¡¡\n");
                    break;
            }
        } while (opcion != 10);

    }

    /**
     * Muestra la lista de carreras
     *
     * @param carreras contiende la lista de carreras
     */
    public static void mostrarCarreras(ArrayList<Carrera> carreras) {
        for (int i = 0; i < carreras.size(); i++) {
            System.out.println(carreras.get(i));
        }
    }

    ;               
    /**
     * Agrega una carrera a la lista
     * @param carreras contiene la lista de carreras 
     */
    public static void agregarCarrera(ArrayList<Carrera> carreras) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de la carrera: ");
        String nombre = sc.nextLine();
        System.out.print("Facultad: ");
        String facultad = sc.nextLine();
        System.out.println();
        Carrera carrera = new Carrera(nombre, facultad);
        carreras.add(carrera);
    }

    ;
    
    // Método para eliminar carrera
    /**
     * Elimina una carrera de la lista de carreras
     * @param carreras contiende la lista de carreras 
     */
    public static void eliminarCarrera(ArrayList<Carrera> carreras) {
        Scanner sc = new Scanner(System.in);
        boolean existe = false;
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < carreras.size(); i++) {
            if (carreras.get(i).nombre.equalsIgnoreCase(nombre)) {
                carreras.remove(i);
                System.out.println("\nCarrera eliminada\n");
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("\nLa carrera " + nombre + " no existe en la base de datos\n");
        }
    }

    /**
     * Muestra la lista de materias
     *
     * @param materias contiende la lista de materias
     */
    public static void mostrarMaterias(ArrayList<Materia> materias) {
        for (int i = 0; i < materias.size(); i++) {
            System.out.println("-----------------------------");
            System.out.println(materias.get(i).getNombre());
            System.out.println(materias.get(i).getTitular());
        }
    }

    /**
     * Muestra la lista alumnos
     *
     * @param alumnos contiene la lista de alumnos
     */
    public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
        System.out.println();
    }
}
