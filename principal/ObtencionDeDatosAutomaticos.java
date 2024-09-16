package principal;

import algoritmos.*;
import manejoDatos.Archivo;
import utilerias.*;

public class ObtencionDeDatosAutomaticos {
    public static void main(String[] args) {
        long[][] datos = new long[8][6];
        int contador = 0;
        int[] operaciones = {50, 100, 500, 800, 1000, 2000, 5000, 10000}; // Arreglo que contiene los tamaños con los que se prueban los algoritmos 
        for(int i : operaciones){
            for(int j = 0; j < 5; j++){
                int[] arrog = Utilerias.generarArreglo(i);
                int[] arrprueba = new int[i];

                // Para bubblesort
                Utilerias.resetAcciones();
                arrprueba = arrog.clone();
                BubbleSort.burbuja(arrprueba);
                datos[contador][0] += Utilerias.getAcciones();

                // Para insertionsort
                Utilerias.resetAcciones();
                arrprueba = arrog.clone();
                InsertionSort.insertionSort(arrprueba);
                datos[contador][1] += Utilerias.getAcciones();

                // Para selectionsort
                Utilerias.resetAcciones();
                arrprueba = arrog.clone();
                SelectionSort.selectionSort(arrprueba);
                datos[contador][2] += Utilerias.getAcciones();

                // Para quicksort
                Utilerias.resetAcciones();
                arrprueba = arrog.clone();
                QuickSort.quick_v1(arrprueba, 0 , arrog.length - 1);
                datos[contador][3] += Utilerias.getAcciones();

                // Para heapsort
                Utilerias.resetAcciones();
                arrprueba = arrog.clone();
                HeapSort.heapsort(arrprueba);
                datos[contador][4] += Utilerias.getAcciones();

                // Para mergesort
                Utilerias.resetAcciones();
                arrprueba = arrog.clone();
                MergeSort.mergeSort(arrprueba, 0, (arrog.length - 1));
                datos[contador][5] += Utilerias.getAcciones();
            }

            // Obtener promedios
            for(int j = 0; j < 6; j++){
                datos[contador][j] = (datos[contador][j] / 5);
            }
            
            contador++;
        }

        Archivo.guardarDatosAutomaticos(datos);
    }
}
