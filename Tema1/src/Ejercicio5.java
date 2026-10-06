import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 4 numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();

        double media = ((num1 + num2 + num3 + num4)/4.0);

        System.out.println("La media es " + media);

        if (num1 > media){
            System.out.println(num1 + " es mayor a la media");
        }
        if (num2 > media){
            System.out.println(num2 + " es mayor a la media");
        }
        if (num3 > media){
            System.out.println(num3 + " es mayor a la media");
        }
        if (num4 > media){
            System.out.println(num4 + " es mayor a la media");
        }
    }
}
