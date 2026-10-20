import java.util.Scanner;

public class EjercicioCuadrado {
    static void main(String[] args) {

        int altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura del arbol");
        altura = teclado.nextInt();
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
