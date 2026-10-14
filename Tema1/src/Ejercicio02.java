import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduzca otro numero");
        int num2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Su suma es " + (num1 + num2 ));
        System.out.println("Su resta es " + (num1 - num2));
        System.out.println("Su multiplicacion es " + (num1 * num2));
        System.out.println("Su division es " + (num1 / num2));
    }
}
