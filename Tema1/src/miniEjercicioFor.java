public class miniEjercicioFor { //sumar los nº del 1 al 10 usando for
    static void main(String[] args) {
        int num1 = 0;
        for (int contador = 1; contador <= 10; contador++){

            num1 += contador;
            System.out.println("La suma es " + num1);
        }
        System.out.println("El numero final es: " + num1);
        }
    }
