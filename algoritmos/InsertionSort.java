package algoritmos;
import utilerias.Utilerias;
/**
 * La clase InsertionSort proporciona el método correspondiente al algoritmo de ordenamiento insertionsort
 */
public class InsertionSort{
    /**
     * Ordena un arreglo con el algoritmo de insertionsort
     * @param array El arreglo a ordenar
     */
    public static void insertionSort(int[] array){
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            Utilerias.plusComparaciones(); // La primer comparación para entrar
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
                Utilerias.plusComparaciones(); // Las comparaciones para volver a entrar
            }  
            array[i+1] = key; 
            Utilerias.plusInserciones(); // Cada vez que inserta un valor en su posicion
        } 
    }
}


