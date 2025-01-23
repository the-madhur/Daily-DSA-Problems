// Area of Circle
import java.util.Scanner;

public class AreaofCircle
{
    public static float GetArea(float r)
    {
        float circleArea = (float) (3.14 *r*r);
        return circleArea;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius of Circle: ");
        float radius = sc.nextFloat();
        
        float area = GetArea(radius);
        System.out.println("Area of Circle is: "+area);
    }
    
}
