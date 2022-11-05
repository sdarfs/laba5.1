import java.util.Scanner;

public class Points_array {
	final static int N=10; // константа на java
	public Point [] dots = new Point[N];
	int n;
	public void Init(double a, double b)
    {
        a = b = 0;
        n = 0;
    }

    public void Display(){
        int i;
        for (i = 0; i < n; i++)        
                dots[i].output();
            
    }

    public void AddDots(double m, double s) {
            Point c=new Point(m,s);
            dots[n] = c;
            n++;
    }

    public void Insert(int k, double m,double s)
    {
        int i;
        k -=1;
        for(i=n;i>k;i--)
                dots[i] = dots[i - 1];
        Point c=new Point(m,s);
        dots[k] = c;
        n++;
    }

}