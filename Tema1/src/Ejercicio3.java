import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num1 = teclado.nextInt();
        System.out.println("introduce otro numero");
        int num2 = teclado.nextInt();

        if (num1 == num2) {
            System.out.println("num1 es igual a num2");
        }
        else if (num1 > num2) {
            System.out.println("num1 es mayor a num2");
        }
        else{
            System.out.println("num1 es menor a num2");
        }
    }
}
