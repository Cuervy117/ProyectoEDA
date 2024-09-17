package utilerias;

import algoritmos.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * La clase Menu proporciona métodos para la presentación y ejecución de diferentes algoritmos de ordenamientos
 */
public class Menu {
    /**
     * Muestra el menú con los algoritmos a realizar, esperando a que el usuario elija una opción para mostrar el proceso que siguen dichos métodos
     * @param sc El Scanner para leer los datos
     * @throws IOException Para manejar las excepciones de IOException
     * @throws InterruptedException Para manejar las excepciones de InterruptedException
     */
    public static void menu(Scanner sc) throws IOException, InterruptedException{
        int opcion;
        do { 
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla

            opcion = mostrarMenu(sc);

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla

            switch (opcion) {
                case 1 -> { // Demostración de BubbleSort
                    System.out.println("Has elegido hacerlo con BubbleSort!");
                    int tamano = tamanoArreglo(sc);
                    int ejecuciones = ejecuciones(sc);
                    sc.nextLine();
                    for (int i = 1; i <= ejecuciones; i++) {
                        Utilerias.resetAcciones();
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        BubbleSort.burbuja(arreglo);
                        System.out.println("\nArreglo ordenado: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        System.out.println("Presiona Enter para ordenar el siguiente arreglo, quedan " + (ejecuciones - i) + " Ejecuciones");
                        sc.nextLine();
                    }
                    System.out.println("Presiona Enter para dirigirte al menú...");
                    sc.nextLine();
                }

                case 2 -> { // Demostración de InsertionSort
                    System.out.println("Has elegido hacerlo con InsertionSort!");
                    int tamano = tamanoArreglo(sc);
                    int ejecuciones = ejecuciones(sc);
                    sc.nextLine();
                    for (int i = 1; i <= ejecuciones; i++) {
                        Utilerias.resetAcciones();
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        InsertionSort.insertionSort(arreglo);
                        System.out.println("\nArreglo ordenado: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        System.out.println("Presiona Enter para ordenar el siguiente arreglo, quedan " + (ejecuciones - i) + " Ejecuciones");
                        sc.nextLine();
                    }
                    System.out.println("Presiona Enter para dirigirte al menú...");
                    sc.nextLine();
                }

                case 3 -> { // Demostración de SelectionSort
                    System.out.println("Has elegido hacerlo con SelectionSort!");
                    int tamano = tamanoArreglo(sc);
                    int ejecuciones = ejecuciones(sc);
                    sc.nextLine();
                    for (int i = 1; i <= ejecuciones; i++) {
                        Utilerias.resetAcciones();
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        BubbleSort.burbuja(arreglo);
                        System.out.println("\nArreglo ordenado con Selection Sort: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        System.out.println("Presiona Enter para ordenar el siguiente arreglo, quedan " + (ejecuciones - i) + " Ejecuciones");
                        sc.nextLine();
                    }
                    System.out.println("Presiona Enter para dirigirte al menú...");
                    sc.nextLine();
                }

                case 4 -> { // Demostración de QuickSort
                    System.out.println("Has elegido hacerlo con QuickSort!");
                    int tamano = tamanoArreglo(sc);
                    int ejecuciones = ejecuciones(sc);
                    sc.nextLine();
                    for (int i = 1; i <= ejecuciones; i++) {
                        Utilerias.resetAcciones();
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        QuickSort.quick_v1(arreglo, 0, arreglo.length - 1);
                        System.out.println("\nArreglo ordenado: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        System.out.println("Presiona Enter para ordenar el siguiente arreglo, quedan " + (ejecuciones - i) + " Ejecuciones");
                        sc.nextLine();
                    }
                    System.out.println("Presiona Enter para dirigirte al menú...");
                    sc.nextLine();
                }
    
                case 5 -> { // Demostración de HeapSort
                    System.out.println("Has elegido hacerlo con HeapSort!");
                    int tamano = tamanoArreglo(sc);
                    int ejecuciones = ejecuciones(sc);
                    sc.nextLine();
                    for(int i = 1; i <= ejecuciones; i++){
                        Utilerias.resetAcciones();
                        int[] arreglo = Utilerias.generarArreglo(tamano);
                        HeapSort.heapsort(arreglo);
                        System.out.println("\nArreglo ordenado: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        System.out.println("Presiona Enter para ordenar el siguietne arreglo, quedan " + (ejecuciones - i) + "Ejecuciones");
                        sc.nextLine();
                    }
                }
    
                case 6 -> { // Demostración de MergeSort
                    System.out.println("Has elegido hacerlo con MergeSort!");
                    int tamano = tamanoArreglo(sc);
                    int ejecuciones = ejecuciones(sc);
                    sc.nextLine();
                    for(int i = 1; i <= ejecuciones; i++){
                        Utilerias.resetAcciones();
                        int[] arreglo = Utilerias.generarArreglo(tamano);
                        MergeSort.mergeSort(arreglo, 0, (arreglo.length - 1));
                        System.out.println("\nArreglo ordenado: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        System.out.println("Presiona Enter para ordenar el siguietne arreglo, quedan " + (ejecuciones - i) + "Ejecuciones");
                        sc.nextLine();
                    }
                }

                case 7 -> {
                    System.out.println("Hasta luego!");
                }
    
                default -> {
                    System.out.println("Ingresa una opcion válida");
                }
            }
        } while (opcion != 7);

    }

    /**
     * Pregunta al usuario por el tamaño de los arreglos a ordenar 
     * @param sc El Scanner para la lectura de los datos
     * @return Devuelve el tamaño del arreglo deseado
     */
    public static int tamanoArreglo(Scanner sc){
        int tamano;
        System.out.println("De qué tamaño quieres que sea tu arreglo");
        tamano = sc.nextInt();
        return tamano;
        
    }
    /**
     * Pregunta al usuario las veces que se ejecutaran los algoritmos
     * @param sc El Scanner para la lectura de datos
     * @return Devuelve la cantidad de ejecuciones deseadas
     */
    public static int ejecuciones(Scanner sc){
        int ejecuciones;
        System.out.println("Cuantas pruebas del algoritmo quieres ejecutar");
        ejecuciones = sc.nextInt();
        return ejecuciones;
    }
     /**
      * Muestra al usuario los algoritmos disponibles
      * @param sc El scanner para la lectura de datos
      * @return Devuelve el valor que corresponde al algoritmo deseado
      */
    private static int mostrarMenu(Scanner sc){
        System.out.println("1) Probar con Bubble Sort");
        System.out.println("2) Probar con Insertion Sort");
        System.out.println("3) Probar con Selection Sort");
        System.out.println("4) Probar con Quick Sort");
        System.out.println("5) Probar con Heap Sort");
        System.out.println("6) Probar con Merge Sort");
        System.out.println("7) Salir ");
        return sc.nextInt();
    }
    
}
