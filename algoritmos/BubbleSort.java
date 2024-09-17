package algoritmos;

import utilerias.Utilerias;
/**
 * La clase BubbleSort proporciona el método correspondiente al algoritmo de ordenamiento bubblesort mejorado
 */
public class BubbleSort{
    /**
     * Ordena un arreglo con el algoritmo de bubblesort
     * @param arreglo El arreglo a ordenar
     */
    public static void burbuja(int [] arreglo){
        boolean bandera;
        for(int i = arreglo.length; i >=0; i--){
            bandera = false;
            for(int j = 0; j < i-1; j++){
                Utilerias.plusComparaciones(); //como en cada for se ejecuta el if, cuenta como comparación (supongo), lo de adentro ya es cuando la comparación se ejecuta
                if(arreglo[j]>arreglo[j+1]){
                    Utilerias.swap(arreglo,j , j+1);
                    bandera = true;
                }
            }
            if (!bandera ) break;
        }
    }
}