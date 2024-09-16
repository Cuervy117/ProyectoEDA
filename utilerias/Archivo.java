package utilerias;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public static void guardarDatos(int tamano, int opcion){
        try {
            String ruta = "D:\\EDA II\\repoProyecto\\Datos.txt"; //adaptarlo a tu computadora y donde quieres guardar el archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true));
            escritor.write(tamano + "\t" + Utilerias.getAcciones());
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo" + e.getMessage());
        }
    }

<<<<<<< HEAD

    public static void reescribirArchivo() {
        String ruta = "C:\\Users\\LAP-CIT01\\Downloads\\EDA II\\ProyectoEDA\\Datos.txt";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta))) {
            escritor.write("");
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo" + e.getMessage());
        }
=======
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
>>>>>>> 3b7a308eb76f37d96a1d6e8fe26182dd2990cbae
    }
}

