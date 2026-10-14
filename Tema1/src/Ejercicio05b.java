import java.util.Scanner;

public class Ejercicio5b {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1;
        int contador = -1;
        do {
            System.out.println("Escribe un numero (negativo para terminar)");
            num1 = teclado.nextInt();
            contador++;
        } while (num1>=0 );
        System.out.println("Has introducido " + contador  + " numeros positivos");
    }
}
