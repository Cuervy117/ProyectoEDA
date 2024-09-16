package utilerias;
import java.util.Random;
public class Utilerias {

    private static long intercambios;
    private static long comparaciones;
    private static long inserciones;
    private static long acciones;
    
    public static void swap(int[] arr, int val1, int val2){
        int aux = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = aux;
        Utilerias.plusIntercambios();
    }

    public static int[] generarArreglo(int tamaño){
        int[] arr = new int[tamaño];
        Random rand = new Random();
        for(int i = 0; i < tamaño; i ++ ){
            arr[i] = rand.nextInt(100000) + 1;
        }
        return arr;
    }

    public static void resetAcciones(){
        intercambios = 0;
        comparaciones = 0;
        inserciones = 0;
    }

    public static long getAcciones(){
        acciones = intercambios + comparaciones + inserciones;
        return acciones;
    }

    public static void plusIntercambios(){
        intercambios++;
    }

    public static void plusInserciones(){
        inserciones++;
    }

    public static void plusComparaciones(){
        comparaciones++;
    }

}
