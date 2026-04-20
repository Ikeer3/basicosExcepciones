import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

//        Crea un programa que pida un número al usuario con Scanner - nextInt().
//        Investiga qué excepciones puede lanzar este metodo.
//        Captura la excepción si el usuario introduce algo que no es un número, y sigue pidiendo el número.


        Scanner escaner = new Scanner(System.in);
        boolean numeroCorrecto = false;
        int numeroTeclado = 0;

        System.out.print("\nIntroduce un número entero: ");
        while (!numeroCorrecto) {
            try {
                numeroTeclado = escaner.nextInt();
                numeroCorrecto = true;
            } catch (Exception e) {
                System.out.println("Valor incorrecto!!");
                System.out.print("Introduce otro número: ");
                escaner.nextLine();
            }
        }
        System.out.println("El número " + numeroTeclado + " ha sido añadido correctamente!!");
    }
}