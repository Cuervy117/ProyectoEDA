package algoritmos;
import utilerias.Utilerias;

public class HeapSort{
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

        Utilerias.plusComparaciones();
        if (raiz != i) {
            Utilerias.swap(arr, raiz, i);
            heapify(arr, n, raiz);
        }
    }
}
    