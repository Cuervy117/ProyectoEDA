package algoritmos;
import utilerias.Utilerias;
/**
 * La clase QuickSort proporciona métodos necesarios en el algoritmo de ordenamiento quicksort
 */
public class QuickSort{
    /**
     * Ordena un arreglo desde una posición inicial hasta una posición final  de forma recursiva 
     * @param arreglo El arreglo a ordenar
     * @param inicio La posición en donde se inicia el ordenamiento
     * @param fin La posición en donde terminará el ordenamiento
     */
    public static void quick_v1(int [] arreglo, int inicio, int fin){
        if(inicio < fin){
           int pivot = partition(arreglo, inicio, fin);
           quick_v1(arreglo, inicio, pivot - 1);
           quick_v1(arreglo, pivot + 1, fin);
        }
    }
    /**
     * Compara los elementos del arreglo bajo cierto criterio hasta encontrar la posición final del ultimo elemento
     * @param arreglo El arreglo a modificar
     * @param inicio La posición del primer elemento a considerar
     * @param fin La posición del ultimo elemento a considerar
     * @return Devuelve la posición final del elemento que fue ordenado 
     */
    private static int partition(int [] arreglo, int inicio, int fin){
        int pivot = arreglo[fin];
        int i = inicio - 1;
        for(int j = inicio; j <= fin -1; j++) {
            Utilerias.plusComparaciones(); // Para cada ejecución
            if( arreglo [j] <= pivot){
                i = i + 1;
                Utilerias.swap(arreglo, i, j);
            }
        }
        Utilerias.swap(arreglo, i + 1, fin);
        return i + 1;
    }
}