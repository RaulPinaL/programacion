import java.util.Scanner;

public class ExamenPracticoT1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

           //System.out.printf("Introduce el nombre del piloto");
            //int nombrePiloto = teclado.nextInt();

        System.out.println("Introduce el numero de vueltas");

        int vueltas = teclado.nextInt();

    if (vueltas < 3 || vueltas > 10){
        System.out.println("Escribe un numero entre 3 y 10");
    }

        System.out.println("Escribe tu tiempo objetivo en segundos");
    double tiemobj = teclado.nextInt();

    if (tiemobj <= 0){
        System.out.println("El numero ha de ser mayor a 0");
    }



    for (int i = vueltas; i < 0; i--) {
        System.out.println("Introduce el tiempo empleado en la vuelta" + vueltas);

    }


    }
}
