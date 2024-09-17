package principal;
import java.io.IOException;
import utilerias.Menu;
import java.util.Scanner;
/**
 * La clase Principal ejecuta un menu con los algoritmos de ordenamiento, ofreciendo una visualización de cada uno en diferentes casos
 */
public class Principal {
    public static void main (String[] args)throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Menu.menu(sc);
        sc.close();
    }
}
