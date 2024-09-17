package manejoDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archivo {
    public static void guardarDatosAutomaticos(long[][] datos) throws URISyntaxException{// Función que guarda los datos de una matriz en un archivo .txt
        try {
            Path packageActual = Paths.get(Archivo.class.getResource("Archivo.class").toURI()).getParent(); // Obtenemos el directorio del package
            Path directorio = packageActual.resolve("DatosGuardados"); // Creamos la carpeta en caso de que no existe
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
            }
            Path ruta = directorio.resolve("Datos.txt"); // Agregamos al directorio creado anteriormente el nombre del archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta.toFile(), false));
            for(int i = 0; i < datos.length; i++){
                for(int j = 0; j < datos[i].length; j++){
                    escritor.write(datos[i][j] + "\t");
                }
                escritor.newLine();
            }
            System.out.println("Datos guardados exitosamente");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo" + e.getMessage());
        }  
    }
}

