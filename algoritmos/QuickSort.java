package algoritmos;
import utilerias.Utilerias;
public class QuickSort{
    public static void quick_v1(int [] arreglo, int inicio, int fin){
        if(inicio < fin){
           int pivot = partition(arreglo, inicio, fin);
           quick_v1(arreglo, inicio, pivot - 1);
           quick_v1(arreglo, pivot + 1, fin);
        }
    }
    
    private static int partition(int [] arreglo, int inicio, int fin){
        int pivot = arreglo[fin];
        int i = inicio - 1;
        for(int j = inicio; j <= fin -1; j++) {
            Utilerias.plusComparaciones(); //como en cada for se ejecuta el if, cuenta como comparación (supongo)
            if( arreglo [j] <= pivot){
                i = i + 1;
                Utilerias.swap(arreglo, i, j);
            }
        }
        Utilerias.swap(arreglo, i + 1, fin);
        return i + 1;
    }
}