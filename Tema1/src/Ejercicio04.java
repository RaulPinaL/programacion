import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe tu edad");
        int num1 = teclado.nextInt();
        if (num1 >= 0 && num1 <= 100){
            if (num1 < 13){
                System.out.println("Usted es un niño");
            }
            else if (num1 < 18){
                System.out.println("Usted es un adolescente");
            }
            else if (num1 < 30){
                System.out.println("Usted es un joven");
            }

            else{
                System.out.println("Usted es un adulto");
            }
        }
        else{
            System.out.println("Introduzca una edad válida");
        }
    }
}
