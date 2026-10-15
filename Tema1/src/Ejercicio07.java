import java.util.Scanner;

public class Ejercicio07 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nums;

        do {
            System.out.println("¿Cuantos numeros vas a introducir?");
            nums = teclado.nextInt();

        if (nums <= 0){
            System.out.println("Escribe un numero positivo");

        }
        } while (nums < 0);

        int suma = 0;

        for (int i = 0; i < nums; i++) {
            System.out.println("Introduce los numeros " + i);
            suma = suma + teclado.nextInt();

        }
        System.out.println("La media es " + (double) suma / nums);
    }
}
