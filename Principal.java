import java.io.IOException;
import utilerias.Menu;
public class Principal {
    public static void main (String[] args)throws IOException, InterruptedException {

        /*int [] pruebas = Utilerias.generarArreglo(20);

        BubbleSort.burbuja(pruebas);
        System.out.println(Arrays.toString(pruebas));
        System.out.println("Intercambios: " + Utilerias.getAcciones() );

        Utilerias.resetAcciones();
        System.out.println("Acciones antes de hacer quick" + Utilerias.getAcciones());
        QuickSort.quick_v1(pruebas, 0, pruebas.length-1);
        //System.out.println(Arrays.toString(pruebas));
        System.out.println("Intercambios quick: " + Utilerias.getAcciones() );*/
        //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla
        Menu.menu();

    }
}
