package BloqueI.RicardoJoseph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.println("Escoja una opción de la calculadora ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int choice = sc.nextInt();
            if(choice == 5) {
                System.out.println("Saliendo");
                break;
            }
            System.out.println("Ingresa un número");
            int num1 = sc.nextInt();
            System.out.println("Ingresa el segundo número");
            int num2 = sc.nextInt();

            switch(choice) {
                case 1:
                    calculator.setOperation(new BasicOperations.Addition());
                    break;
                case 2:
                    calculator.setOperation(new BasicOperations.Subtract());
                    break;
                case 3:
                    calculator.setOperation(new BasicOperations.Multiplication());
                    break;
                case 4:
                    calculator.setOperation(new BasicOperations.Division());
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            try {
                int result = calculator.calculate(num1, num2);
                System.out.println("El resultado es: " + result);
            }catch(ArithmeticException e) {
                System.out.println("Error" );
            }
        }

    }
}
