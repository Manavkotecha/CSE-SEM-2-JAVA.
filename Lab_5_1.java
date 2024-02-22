import java.util.*;

class Circle {
    int radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Lab_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Radius:");
        int r = sc.nextInt();
        Circle c = new Circle();
        c.radius = r;
        double area = c.area();
        System.out.println("Area" + area);
        sc.close();
    }
}
