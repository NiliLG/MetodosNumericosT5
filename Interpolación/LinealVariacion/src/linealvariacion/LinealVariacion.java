package linealvariacion;

import java.util.Scanner;

public class LinealVariacion {
    public static double interpolacionLineal(double x1, double y1, double x2, double y2, double x) {
        return y1 + (x - x1) * ((y2 - y1) / (x2 - x1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de y1:");
        double y1 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de x2:");
        double x2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de y2:");
        double y2 = scanner.nextDouble();
        
        System.out.println("Ingrese el valor de x:");
        double x = scanner.nextDouble();
        
        double y = interpolacionLineal(x1, y1, x2, y2, x);
        System.out.println("x = " + x + ", y = " + y);
        scanner.close();
    }
}