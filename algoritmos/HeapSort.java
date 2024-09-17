package algoritmos;
import utilerias.Utilerias;
/**
 * La clase Heapsort proporciona los métodos necesarios para el algoritmo de ordenamiento heapsort
 */
public class HeapSort{
    /**
     * Ordena un arreglo con el algoritmo de heapsort
     * @param arr El arreglo a ordenar 
     */
    public static void heapsort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            Utilerias.swap(arr, 0, i);
            heapify(arr, i, 0);
        }

    }
    /**
     * Crea o reorganiza un heap a partir de un arreglo
     * @param arr El arreglo del cual se creará el heap
     * @param n Tamaño total del arreglo 
     * @param i El elemento a considerar como raiz 
     */
    private static void heapify(int arr[], int n, int i) {
        int raiz = i; 
        int izq = 2 * i + 1; 
        int der = 2 * i + 2; 

        Utilerias.plusComparaciones();
        if (izq < n && arr[izq] > arr[raiz]) {
            raiz = izq;
        }

        Utilerias.plusComparaciones();
        if (der < n && arr[der] > arr[raiz]) {
            raiz = der;
        }

        if (raiz != i) {
            Utilerias.swap(arr, raiz, i);
            heapify(arr, n, raiz);
        }
    }
}
    