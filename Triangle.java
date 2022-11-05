public class Triangle {
    private Point firstPoint, secondPoint, thirdPoint;

    public Triangle(){}
    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public boolean init(Point first, Point second, Point third){
        if (first == null || second == null || third == null) return false;

        this.firstPoint = first;
        this.secondPoint = second;
        this.thirdPoint = third;

        return true;
    }

    public boolean input(){
        Point first = new Point();
        Point second = new Point();
        Point third = new Point();
        if (first.input() && second.input() && third.input())
            return this.init(first, second, third);

        return false;
    }

    public void output(){

        System.out.print("first point of triangle");
        this.firstPoint.output();

        System.out.print("\nsecond point of triangle");
        this.secondPoint.output();

        System.out.print("\nthird point of triangle");
        this.thirdPoint.output();


        System.out.print("\nlengths of lines\n");
        System.out.printf("first line = %f", this.lineLength(1));
        System.out.printf("\nsecond line = %f", this.lineLength(2));
        System.out.printf("\nthird line= %f", this.lineLength(3));

        System.out.printf("\n\nPerimeter of triangle = %f", this.perimeter());
        System.out.printf("\nArea of triangle= %f", this.area());
    }

    public double lineLength(int lineNumber){
        return switch (lineNumber) {
            case 1 -> this.firstPoint.distance(this.secondPoint);
            case 2 -> this.secondPoint.distance(this.thirdPoint);
            case 3 -> this.thirdPoint.distance(this.firstPoint);
            default -> -1;
        };
    }

    public float perimeter(){
        float perimeter = 0;
        for (int i = 1; i < 4; i++) {
            perimeter += this.lineLength(i);
        }

        return perimeter;
    }

    public float area(){
        float semiPerimeter = this.perimeter() / 2;
        return (float) Math.sqrt(semiPerimeter * (semiPerimeter - this.lineLength(1)) *
                (semiPerimeter - this.lineLength(2) * (semiPerimeter - this.lineLength(3))));
    }
}