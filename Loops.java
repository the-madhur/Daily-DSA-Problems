public class Loops 
{
    public static void main(String[] args) 
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("For Loop");
        }
        
        for(int i =0;i<3;i++)
        {
            System.out.println("Madhur");
        }

        for(int i =5;i>0;i--)
        {
            System.out.println("Negative");
        }

        for(int i =0;i<5;i=i+2)
        {
            System.out.println("Madhur");
        }

        for(int i =1;i<10;i=i*2)
        {
            System.out.print(i);
        }

        for(int i =100;i>0;i=i/2)
        {
            System.out.println(i);
        }

        for(int i =5;(i>=0 && i<=10);i++)
        {
            System.out.println(i);
        }

        // is it mandatory to write all conditions inside for 
        // so now we can also write as this 
        int i =0;
        for( ; ; )
        {
            if(i<5)
            {
                System.out.println(i);
                i=i+1;
            }
        }
    }
    
}
