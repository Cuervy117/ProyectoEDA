package principal;
import java.io.IOException;
import utilerias.Menu;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args)throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Menu.menu(sc);
        sc.close();
    }
}
