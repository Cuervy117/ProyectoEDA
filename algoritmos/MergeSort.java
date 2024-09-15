package algoritmos;
import utilerias.Utilerias;
public class MergeSort{

    public static void mergeSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int mid = izq + (der - izq) / 2;
            mergeSort(arr, izq, mid);
            mergeSort(arr, mid + 1, der);

            merge(arr, izq, mid, der);
        }
    }

    private static void merge(int[] arr, int izq, int mid, int der) {
        int inicioSubArr2 = mid + 1;

        Utilerias.plusComparaciones();
        if (arr[mid] <= arr[inicioSubArr2]) {
            return;
        }

        Utilerias.plusComparaciones();
        while (izq <= mid && inicioSubArr2 <= der) {
            Utilerias.plusComparaciones();
            if (arr[izq] <= arr[inicioSubArr2]) {
                izq++;
            } else {
                int value = arr[inicioSubArr2];
                int index = inicioSubArr2;

                Utilerias.plusComparaciones();
                while (index != izq) {
                    arr[index] = arr[index - 1];
                    Utilerias.plusInserciones();
                    index--;
                    Utilerias.plusComparaciones();
                }
                arr[izq] = value;
                Utilerias.plusInserciones();

                izq++;
                mid++;
                inicioSubArr2++;
                Utilerias.plusComparaciones();
            }
        }
    }
}
