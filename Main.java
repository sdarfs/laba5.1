public class Main {
    final static int R=2;
    final static int C=3;


    public static void main(String[] args) throws Ex {
        //проверка исключений строковых, отрицательных и нулевых значений
        Triangle triangle = new Triangle();
        System.out.print("\nEnter the coordinates of the first, the second and the third points: ");
        triangle.input();
        double line1,line2,line3;
        line1 = triangle.lineLength(1);
        line2 = triangle.lineLength(2);
        line3 = triangle.lineLength(3);
        Circle circle;
        Circle.area_triangle_inside(line1,line2,line3);
        System.out.print('\n');

        //двумерный массив - arr2
        System.out.print("Двумерный массив: \n");
        int [][] A=new int [R][C];
        Line.Arr2(A,R,C);

        //одномерный массив - arr1
        System.out.print("Одномерный массив: \n");
        int [] a = new int [R];
        Line.Arr1(a,R);






        //String line = new String("1234");
        //String line_2 = new String("56");
        //int k;
        //k = line.length();
        //System.out.printf("Длина первой линии: %d",k);
        //k = line_2.length();
        //System.out.printf("\nДлина второй линии: %d",k);
        //System.out.print("\nСравнение:");
        //k = line.compareTo(line_2);
        //System.out.print(k);

        //Point firstPoint =  new Point();
        //Point secondPoint = new Point();
        //System.out.print("Enter the coordinates of the first point: ");
        //firstPoint.input();
        //System.out.print("Enter the coordinates of the second point: ");
        //secondPoint.input();

        //System.out.print("\nThe coordinates of the first point: ");
        //firstPoint.output();
        //System.out.print("\nThe coordinates of the second point: ");
        //secondPoint.output();
        //System.out.printf("\nDistance between them: %f", firstPoint.distance(secondPoint));

        //Line line = new Line();
        //System.out.print("\nEnter the coordinates of the start and the end of the line: ");
        //line.input();

        //System.out.print("\nCoordinates of the line");
        //line.output();

        //Triangle triangle = new Triangle();
        //System.out.print("\nEnter the coordinates of the first, the second and the third points: ");
        //triangle.input();
        //triangle.output();

        //Square square = new Square();
        //System.out.print("\nEnter the coordinates of the first, the second, the third and the fourth points: ");
        //square.input();
        //square.output();

        //Circle circle = new Circle();
        //System.out.print("\nEnter the coordinates of the center and the radius: ");
        //circle.input();
        //circle.output();
    }

}