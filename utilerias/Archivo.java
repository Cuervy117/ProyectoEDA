package utilerias;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    public static void guardarDatos(){
        try {
            String ruta = "C:\\Users\\LAP-CIT01\\Downloads\\EDA II\\ProyectoEDA\\Datos.txt"; //adaptarlo a tu computadora y donde quieres guardar el archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true));
            escritor.write("Acciones: " + "\t" + Utilerias.getAcciones());
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo" + e.getMessage());
        }
    }
}
