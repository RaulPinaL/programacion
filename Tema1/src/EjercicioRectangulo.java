import java.util.Scanner;

public class EjercicioRectangulo {
    static void main(String[] args) {

        int altura;
        int anchura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura del rectangulo");
        altura = teclado.nextInt();
        System.out.println("Introduce la anchura del rectangulo");
        anchura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*  ");    -   ººººººººººººººººººººººººººººººººººººººººººººººººººººººººº

            }
            System.out.println();
        }
    }

}



