/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interpolacionl;

public class InterpolacionL {

    // Método para realizar la interpolación lineal
    public static double interpolacionLineal(double x1, double y1, double x2, double y2, double x) {
        // Fórmula de interpolación lineal: y = y1 + (x - x1) * ((y2 - y1) / (x2 - x1))
        return y1 + (x - x1) * ((y2 - y1) / (x2 - x1));
    }

    public static void main(String[] args) {
        // Puntos conocidos
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 12.0;

        // Punto para interpolar
        double x = 3.0;

        // Interpolar y obtener el valor de y para x = 3.0
        double y = interpolacionLineal(x1, y1, x2, y2, x);

        System.out.println("El valor interpolado de y para x = " + x + " es: " + y);
    }
    
}
