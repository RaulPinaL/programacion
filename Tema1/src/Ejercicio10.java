import java.util.Scanner;

    public class Ejercicio10 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;

        do{
            System.out.println("Introduce un numero entero positivo");

            num1 = teclado.nextInt();
        }while (num1 < 0);

        long factorial = 1;

        for (int i = 1; i <= num1; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num1 + " es " + factorial);

        }
    }
