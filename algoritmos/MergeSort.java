package algoritmos;
import utilerias.Utilerias;
/**
 * La clase MergeSort proporciona los métodos necesarios en la ejecución del algoritmo mergesort
 */
public class MergeSort{
    /**
     * Ordena un arreglo desde una posición inicial hasta una posición final de forma recursiva
     * @param arr El arreglo a ordenar
     * @param izq La posición del primer elemento a considerar
     * @param der La posición del ultimo elemento a considerar
     */
    public static void mergeSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int mid = izq + (der - izq) / 2;
            mergeSort(arr, izq, mid);
            mergeSort(arr, mid + 1, der);

            merge(arr, izq, mid, der);
        }
    }
    /**
     * Combina dos subarreglos en el mismo lugar, sin crear arreglos adicionales
     * @param arr El arreglo a combinar
     * @param izq La posición del primer elemento del primer subarreglo
     * @param mid La posición del ultimo elemento del primer subarreglo
     * @param der La posición del ultimo elemento del segundo subarreglo
     */
    private static void merge(int[] arr, int izq, int mid, int der) {
        int inicioSubArr2 = mid + 1;

        Utilerias.plusComparaciones();
        if (arr[mid] <= arr[inicioSubArr2]) {
            return;
        }

        while (izq <= mid && inicioSubArr2 <= der) {
            Utilerias.plusComparaciones();
            if (arr[izq] <= arr[inicioSubArr2]) {
                izq++;
            } else {
                int value = arr[inicioSubArr2];

                System.arraycopy(arr, izq, arr, izq + 1, inicioSubArr2 - izq); // Optimización de merge
                arr[izq] = value;
                Utilerias.plusInserciones();

                izq++;
                mid++;
                inicioSubArr2++;
            }
        }
    }
}
