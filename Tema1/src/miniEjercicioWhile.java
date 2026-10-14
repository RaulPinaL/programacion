import java.util.Scanner;

public class miniEjercicioWhile {
    static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.println("Introduce un numero");

        int num1 = teclado.nextInt();
        int contador = 2;

        if (num1 >= 2) {
            while (num1 % contador != 0) {

                contador++;
            }
            System.out.println("El primer divisor es " + contador);
        }
        else{
                System.out.println("Introduzca un numero válido");
            }


    }
}
