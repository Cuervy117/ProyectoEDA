package utilerias;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public static void guardarDatos(){
        try {
            String ruta = "D:\\EDA II\\repoProyecto\\Datos.txt"; //adaptarlo a tu computadora y donde quieres guardar el archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true));
            escritor.write("Acciones: " + "\t" + Utilerias.getAcciones());
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo" + e.getMessage());
        }
    }

    public static void guardarDatosAutomaticos(String[] algoritmos, long[][] datos){
        try {
            String ruta = "D:\\EDA II\\repoProyecto\\Datos.txt"; //adaptarlo a tu computadora y donde quieres guardar el archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, false));
            //escritor.newLine();
            /*for(int e = 0; e < 6; e++){
                escritor.write(algoritmos[e] + "\t");
            }*/
            //escritor.newLine();
            //int tamanos = 50;
            for(int i = 0; i < datos.length; i++){
                //escritor.write(tamanos + "\t");
                for(int j = 0; j < datos[i].length; j++){
                    escritor.write(datos[i][j] + "\t");
                }
                //tamanos += 50;
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo" + e.getMessage());
        }  
    }
}
