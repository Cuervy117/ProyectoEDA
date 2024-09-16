import algoritmos.*;
import utilerias.*;

public class ObtencionDeDatosAutomaticos {
    public static void main(String[] args) {
        long[][] datos = new long[1000][6];
        int contador = 0;
        String[] algoritmos = {"BubbleSort", "InsertionSort", "SelectionSort", "QuickSort" , "HeapSort", "MergeSort"};
        // Cambiar el limite de i para la cantidad de iteraciones
        for(int i = 50; i < 10001; i += 50){
            for(int j = 0; j < 5; j++){
                int[] arrog = Utilerias.generarArreglo(i);

                // Para bubblesort
                int[] arrprueba = arrog;
                BubbleSort.burbuja(arrprueba);
                datos[contador][0] += Utilerias.getAcciones();
                Utilerias.resetAcciones();

                // Para insertionsort
                arrprueba = arrog;
                InsertionSort.insertionSort(arrprueba);
                datos[contador][1] += Utilerias.getAcciones();
                Utilerias.resetAcciones();

                // Para selectionsort
                arrprueba = arrog;
                SelectionSort.selectionSort(arrprueba);
                datos[contador][2] += Utilerias.getAcciones();
                Utilerias.resetAcciones();

                // Para quicksort
                arrprueba = arrog;
                QuickSort.quick_v1(arrprueba, 0 , arrog.length - 1);
                datos[contador][3] += Utilerias.getAcciones();
                Utilerias.resetAcciones();

                // Para heapsort
                arrprueba = arrog;
                HeapSort.heapsort(arrprueba);
                datos[contador][4] += Utilerias.getAcciones();
                Utilerias.resetAcciones();

                // Para mergesort
                arrprueba = arrog;
                MergeSort.mergeSort(arrprueba, 0, (arrog.length - 1));
                datos[contador][5] += Utilerias.getAcciones();
                Utilerias.resetAcciones();
            }

            // Obtener promedios
            for(int j = 0; j < 6; j++){
                datos[contador][j] = datos[contador][j] / 5;
            }
            
            contador++;
        }
        Archivo.guardarDatosAutomaticos(algoritmos, datos);
    }
}
