package interview;

public class Quadratic {

    public static void main(String[] args) {

        double a = 3, b = 4, c = 2;
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        if(determinant >= 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("The two roots of quadratic equation are root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        else {
            double real = -b / (2 *a);
            double img = Math.sqrt(-determinant) / (2 * a);

            System.out.format("The two roots of quadratic equation are root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", real, img, real, img);
        
        }
    }
}
