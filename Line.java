public class Line {
    private Point startPoint, endPoint;

    public Line(){}

    
    public boolean init(Point start, Point end){
        if (start == null || end == null) return false;
        this.startPoint = start;
        this.endPoint = end;
        return true;
    }

    public boolean input(){
       Point start = new Point();
       Point end = new Point();
        if (start.input() && end.input()) this.init(start,end);
        return false;
    }

    public void output(){
        System.out.print("Start of the line: ");
        this.startPoint.output();
        System.out.print("\nEnd of the line: ");
        this.endPoint.output();

        System.out.printf("\nLength of the line: %f", this.length());
    }

    public double length(){
        return this.startPoint.distance(this.endPoint);
    }
     public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    static void Arr2(int a[][],int r,int c){
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=i+j;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
        }

    }
    static void Arr1(int a[],int r){
        int i,j;
        for(i=0;i<r;i++)
        {
                a[i]=i;
        }

        for ( i = 0; i < a.length; i++) {
                System.out.print(a[i] + "\t");
            }

    }



}