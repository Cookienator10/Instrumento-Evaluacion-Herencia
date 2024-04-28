
package Geometria;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                circulo circulo = new circulo(radio);
                System.out.println("El área del círculo es: " + circulo.calcularArea());
                System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
                break;
            case 2:
                System.out.println("Ingrese la base del triángulo:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double altura = scanner.nextDouble();
                System.out.println("Ingrese el lado 1 del triángulo:");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el lado 2 del triángulo:");
                double lado2 = scanner.nextDouble();
                triangulo triangulo = new triangulo(base, altura, lado1, lado2);
                System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                break;
            case 3:
                System.out.println("Ingrese la base del rectángulo:");
                double baseRect = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectángulo:");
                double alturaRect = scanner.nextDouble();
                rectangulo rectangulo = new rectangulo(baseRect, alturaRect);
                System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
                System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}



