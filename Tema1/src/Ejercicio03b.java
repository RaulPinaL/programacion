import java.util.Scanner;

public class Ejercicio3b {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El numero num1 es múltiplo de 2 ");
        }
        if (num1 % 3 == 0){
            System.out.println("El número num1 es múltiplo de 3");
        }
        else{
        }
    }
}
