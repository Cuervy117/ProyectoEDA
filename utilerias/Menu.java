package utilerias;
import algoritmos.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void menu() throws IOException, InterruptedException{
        int opcion;
        Scanner sc = new Scanner(System.in);
        do { 
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla

            System.out.println("1) Probar con Bubble Sort");
            System.out.println("2) Probar con Insertion Sort");
            System.out.println("3) Probar con Selection Sort");
            System.out.println("4) Probar con Quick Sort");
            System.out.println("5)Probar con Heap Sort");
            System.out.println("6) Probar con Merge Sort");
            System.out.println("7) Salir ");
            opcion = sc.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla


            switch (opcion) {
                case 1 -> {
                    System.out.println("Has elegido hacerlo con BubbleSort!");
                    int tamano = tamanoArreglo();
                    int ejecuciones = ejecuciones();
                    sc.nextLine();
                    for (int i = 1; i <= ejecuciones; i++) {
                        Utilerias.resetAcciones();
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        BubbleSort.burbuja(arreglo);
                        System.out.println("\nArreglo ordenado: \n" + Arrays.toString(arreglo));
                        System.out.println("Numero de operaciones realizadas: " + Utilerias.getAcciones());
                        Archivo.guardarDatos(); //guarda nuestros datos hasta el momento
                        System.out.println("Presiona Enter para ordenar el siguiente arreglo, quedan " + (ejecuciones - i) + " Ejecuciones");
                        sc.nextLine();
                    }
                    System.out.println("Presiona Enter para dirigirte al menú...");
                    sc.nextLine();
                }
                case 2 -> { //incompleto
                    int tamano = tamanoArreglo();
                    for (int i = 0; i < ejecuciones(); i++) {
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        BubbleSort.burbuja(arreglo);
                    }
    
                }
                case 3 -> { //Selection Sort listo
                    System.out.println("Has elegido hacerlo con Selection Sort!");
                    int tamano = tamanoArreglo();
                    int ejecuciones = ejecuciones();
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
                case 4 -> {
                    System.out.println("Has elegido hacerlo con Quick Sort!");
                    int tamano = tamanoArreglo();
                    int ejecuciones = ejecuciones();
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
    
                case 5 -> { //incompleto
                    int tamano = tamanoArreglo();
                    for (int i = 0; i < ejecuciones(); i++) {
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        BubbleSort.burbuja(arreglo);
                    }
    
                }
    
                case 6 -> { //incompleto
                    int tamano = tamanoArreglo();
                    for (int i = 0; i < ejecuciones(); i++) {
                        int [] arreglo = Utilerias.generarArreglo(tamano);
                        BubbleSort.burbuja(arreglo);
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

    public static int tamanoArreglo(){
        Scanner sc = new Scanner(System.in);
        int tamano;
        System.out.println("De qué tamaño quieres que sea tu arreglo");
        tamano = sc.nextInt();
        return tamano;
        
    }

    public static int ejecuciones(){
        int ejecuciones;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas pruebas del algoritmo quieres ejecutar");
        ejecuciones = sc.nextInt();
        return ejecuciones;
    }

    
}
