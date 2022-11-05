public class Square {
    private Point firstPoint, secondPoint, thirdPoint, fourthPoint;

    public Square(){}

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public Point getFourthPoint() {
        return fourthPoint;
    }

    public boolean init(Point first, Point second, Point third, Point fourth){
        if (first == null || second == null || third == null || fourth == null) return false;
        double d1 = first.distance(second), d2 = second.distance(third), d3 = third.distance(fourth), d4 = fourth.distance(first);

        if (d1 == 0 || d2 == 0 || d3 == 0 || d4 == 0 ||                             
                first.distance(third) == 0 || second.distance(fourth) == 0 ||
                d1 != d3 || d1 != d4 || d2 != d3 || d2 != d4) {   
            return false;
        }

        this.firstPoint = first;
        this.secondPoint = second;
        this.thirdPoint = third;
        this.fourthPoint = fourth;

        return true;
    }

   public  boolean input(){
        Point first = new Point();
        Point second = new Point();
        Point third = new Point();
        Point fourth = new Point();
        if (first.input() && second.input() && third.input() && fourth.input())
            return this.init(first, second, third, fourth);

        return false;
    }

    public void output(){
        System.out.print("first point of square");
        this.firstPoint.output();

        System.out.print("\nsecond point of square");
        this.secondPoint.output();

        System.out.print("\nthird point of square");
        this.thirdPoint.output();

        System.out.print("\nfourth point of square");
        this.fourthPoint.output();


        System.out.printf("\n\nLine length = %f", this.lineLength());


        System.out.printf("\n\nPerimeter of square = %f", this.perimeter());
        System.out.printf("\nArea of square= %f", this.area());
    }

    public double lineLength(){
        return this.firstPoint.distance(secondPoint);
    }

    public double perimeter(){
        return this.lineLength() * 4;
    }

    public double area(){
        return this.lineLength() * this.lineLength();
    }
}