package algoritmos;
import utilerias.Utilerias;
/**
 * La clase SelectionSort proporciona el método correspondiente al algoritmodo de ordenamiento correspondiente a selectionsort
 */
public class SelectionSort{
    /**
     * Ordena un arreglo con el algoritmo de selectionsort
     * @param arr El arreglo a ordenar 
     */
    public static void selectionSort(int[] arr){  
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){  
            int min = i;  
            for (int j = i + 1; j < n; j++){ 
                Utilerias.plusComparaciones(); 
                if (arr[j] < arr[min]){  
                    min = j;  
                    
                }        
            }  
            Utilerias.swap(arr, i,min);
        }  
    }  
}