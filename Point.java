import java.util.Scanner;

public class Point {
    private double x, y;

    public Point(){}

    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }

    public boolean input(){
        double x, y;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()){
            this.x = scanner.nextDouble();
            if (scanner.hasNextDouble()){
                this.y = scanner.nextDouble();
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public void output(){
        System.out.printf("\nx = %f, y = %f", this.x, this.y);
    }

    public double distance(Point end){
        if (end == null) return -1;

         double d1 = end.x - this.x, d2 = end.y - this.y;
        return (double) Math.sqrt(d1 * d1 + d2 * d2);
    }
     public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}