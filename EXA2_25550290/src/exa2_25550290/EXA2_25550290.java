package exa2_25550290;

import java.util.Scanner;

public class EXA2_25550290 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Numero? ");
            int num = input.nextInt();

            System.out.println("1. Primos");
            System.out.println("2. No primos");
            System.out.println("3. Salir");
            int opc = input.nextInt();

            if (opc == 3) {
                System.out.println("Saliendo...");
                break;
            }

            for (int i = 2; i <= num; i++) {

                int divisor = 0;

                // Checar si i es primo
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        divisor = 1;   // no es primo
                        break;
                    }
                }

                // imprimir
                if (opc == 1 && divisor == 0) {
                    // imprime numeros
                    System.out.print(i + " ");
                    // imprime asteriscos
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                if (opc == 2 && divisor == 1) {
                    System.out.print(i + " ");
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            System.out.println();
        }
    }
}
