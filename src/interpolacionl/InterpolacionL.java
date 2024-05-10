package interpolacionl;
public class InterpolacionL {
    public static double interpolacionLineal(double x1, double y1, double x2, double y2, double x) {
        // y = y1 + (x - x1) * ((y2 - y1) / (x2 - x1))
        return y1 + (x - x1) * ((y2 - y1) / (x2 - x1));
    }

    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 5.0;
        double y2 = 12.0;
        double x = 3.0;
        double y = interpolacionLineal(x1, y1, x2, y2, x);
        System.out.println("x = " + x + "    y: " + y);
    }
    
}
