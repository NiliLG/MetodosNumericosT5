package cuadratica;
public class Cuadratica {
    public static double f(double x) {
        return 2 * Math.sin(x) - Math.pow(x, 2) / 10;
    }
    public static double interpolacionCuadratica(double x0, double y0, double x1, double y1, double x2, double y2) {
        double a = y0 * (Math.pow(x1, 2) - Math.pow(x2, 2));
        a = a + y1 * (Math.pow(x2, 2) - Math.pow(x0, 2));
        a = a + y2 * (Math.pow(x0, 2) - Math.pow(x1, 2));
        double b = 2 * y0 * (x1 - x2) + 2 * y1 * (x2 - x0) + 2 * y2 * (x0 - x1);
        double y = a/b;
        return y;
    }
    public static void main(String[] args) {
        //Función:  f(x)=2senx-(x^2)/10
        double x0 = 0;
        double y0 = 0;
        double x1 = 1;
        double y1 = 1.5829;
        double x2 = 4;
        double y2 = -3.1136;
        double x3 = interpolacionCuadratica(x0, y0, x1, y1, x2, y2);
        double y3 = f(x3);
        System.out.println("x3 = " + x3);
        System.out.println("y3 = " + y3);
    }
    
}
//DATOS DE ENTRADA
/*
    x0 = 0;
    y0 = 0;
    x1 = 1;
    y1 = 1.5829;
    x2 = 4;
    y2 = -3.1136;
*/
//DATOS DE SALIDA
/*
x3 = 1.5055266166941939
y3 = 1.7690803377670445
*/