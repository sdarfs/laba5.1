import java.util.Scanner;

public class Circle {
    private Point center;
    private double radius;
    public static double radius_second;

    public double getRadius() {
        return radius;
    }
    
    public boolean init(Point center, double radius){
        if (center == null && radius <= 0) return false;

        this.center = center;
        this.radius = radius;

        return  true;
    }

    public boolean input(){
        Scanner scanner = new Scanner(System.in);
        Point center = new Point();
        float radius;
        if (center.input() && scanner.hasNextDouble()) 
            return this.init(center, scanner.nextDouble());

        return false;
    }

    public void output(){
        System.out.printf("\n\nRadius = %f", this.getRadius());
        System.out.printf("\nArea = %f", this.area());
    }


    public double area(){
        return (double) (this.radius * this.radius * 3.1415926535);
    }

    public void areas(Help k){
       k.param = (int)(((Math.pow(this.radius,2)) * 3.1415926535));
    }

    public static double area_ring(Circle r){
        double area;
        if (r.radius > radius_second)
               area = 3.1415926535 * (Math.pow(r.radius,2) - Math.pow(radius_second,2));
        else
               area = 3.1415926535 * (Math.pow(radius_second,2) - Math.pow(r.radius,2));
        return area;
    }

    public static void area_triangle_inside(double l1, double l2, double l3) throws Ex{
        double radius = 0, areas;
        int p = 0;
        while(p==0){
            try{
                p = 1;
                System.out.print("\nВведите радиус окружности:");
                Scanner scanner = new Scanner(System.in);
                radius = scanner.nextDouble();
                if (radius < 0.0)
                    throw new Ex(1);
                if (radius == 0)
                    throw new Ex(2);
            }
            catch(Exception Ex){
                System.out.printf("\nОшибка ввода");
                p = 0;
            }
        }
        if (p == 1){
            areas = l1*l2*l3 /(4*radius);
            System.out.printf("\nArea = %f", areas);
        }

    }

}

