import java.util.Scanner;
class AreaOfTriangle
{
    public static void main (String arg[])
    {
        Scanner s= new Scanner (System.in);
        
        System.out.println("Enter the width of the Triangle:");
        double b=s.nextDouble();
        
        System.out.println("Enter the height of the triangle:");
        double h=s.nextDouble();
         //area= (width*height)/2
          double area=(b*h)/2;
          System.out.println("Area of triangle is:"+ area);
                  
    }
}