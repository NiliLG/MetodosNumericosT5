package cuadraticasf;

import java.util.Scanner;

public class CuadraticaSF {
    
    public static double interpola(double x0, double y0, double x1, double y1, double x2, double y2, double x) {
        double a = ((y2 - y0) / ((x2 - x0) * (x2 - x1))) - ((y1 - y0) / ((x1 - x0) * (x2 - x1)));
        double b = ((y1 - y0) / (x1 - x0)) - a * (x0 + x1);
        double c = y0 - a * Math.pow(x0, 2) - b * x0;
        double y = a * Math.pow(x, 2) + b * x + c;
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x0: ");
        double x0 = scanner.nextDouble();
        System.out.print("y0: ");
        double y0 = scanner.nextDouble();
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("x: ");
        double x = scanner.nextDouble();
        scanner.close();
        double interpolaY = interpola(x0, y0, x1, y1, x2, y2, x);
        System.out.println("x=" + x + " y: " + interpolaY);
    }
}
