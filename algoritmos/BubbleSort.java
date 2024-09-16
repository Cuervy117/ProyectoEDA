package algoritmos;

import utilerias.Utilerias;

public class BubbleSort{
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
            if (!bandera ){
                break;
            }
        }
    }
}