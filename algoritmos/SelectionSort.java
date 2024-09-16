package algoritmos;
import utilerias.Utilerias;

public class SelectionSort{

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