package algoritmos;

import utilerias.Utilerias;

public class BubbleSort{
    public static void burbuja(int [] arreglo){
        for(int i = arreglo.length; i >=0; i--){
            for(int j = 0; j < i-1; j++){
                Utilerias.plusComparaciones(); //como en cada for se ejecuta el if, cuenta como comparación (supongo), lo de adentro ya es cuando la comparación se ejecuta
                if(arreglo[j]>arreglo[j+1]){
                    Utilerias.swap(arreglo,j , j+1);
                }

            }
        }
    }
}