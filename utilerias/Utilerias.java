package utilerias;
import java.util.Random;
/**
 * La clase Utilerias proporciona métodos necesarios para el conteo de operaciones dentro de los algoritmos, al igual que métodos necesarios en dichos algoritmos
 * Tambien posee atributos de clase los cuales nos ayudan en el analisis de la complejidad de los algoritmos
 */
public class Utilerias {

    private static long intercambios;
    private static long comparaciones;
    private static long inserciones;
    private static long acciones;
    /**
     * Método que intercambia de lugares a dos elementos de un mismo arreglo
     * @param arr El arreglo donde se realizará el intercambio 
     * @param val1 El indice del primer elemento 
     * @param val2 El indice del segundo elemento
     */
    public static void swap(int[] arr, int val1, int val2){
        int aux = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = aux;
        Utilerias.plusIntercambios();
    }
    /**
     * Genera un arreglo con valores aleatorios
     * @param tamaño El tamaño deseado del arreglo 
     * @return Devuelve un arreglo con valores enteros aleatorios
     */
    public static int[] generarArreglo(int tamaño){
        int[] arr = new int[tamaño];
        Random rand = new Random();
        for(int i = 0; i < tamaño; i ++ ){
            arr[i] = rand.nextInt(100000) + 1;
        }
        return arr;
    }
    /**
     * Resetea los atributos de clase
     */
    public static void resetAcciones(){
        intercambios = 0;
        comparaciones = 0;
        inserciones = 0;
    }
    /**
     * Suma todas las acciones realizadas hasta el momento
     * @return Devuelve las acciones totales realizadas hasta el momento
     */
    public static long getAcciones(){
        acciones = intercambios + comparaciones + inserciones;
        return acciones;
    }
    /**
     * Incrementa en uno los intercambios realizados
     */
    public static void plusIntercambios(){
        intercambios++;
    }
    /**
     * Incremente en uno las inserciones realizadas
     */
    public static void plusInserciones(){
        inserciones++;
    }
    /**
     * Incrementa en uno las comparaciones realizadas
     */
    public static void plusComparaciones(){
        comparaciones++;
    }

}
