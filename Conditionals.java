import java.util.Scanner;

public class Conditionals
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        // System.out.println("Enter the marks: ");
        // int marks = sc.nextInt();
        // if(marks >=90)
        // {
        //     System.out.println("A Grade");
        // }
        // else 
        // {
        //     if(marks>=80)
        //     {
        //         System.out.println("B Grade");
        //     }
        //     else 
        //     {
        //         if(marks >=60)
        //         {
        //             System.out.println("C Grade");
        //         }
        //         else
        //         {
        //             if(marks>=40)
        //             {
        //                 System.out.println("D Garde");
        //             }
        //             else{
        //                 System.out.println("F Grade");
        //             }
        //         }
        //     }
        // }
       
        
        // if else another type

        // if(marks>=90)
        // {
        //     System.out.println("A grade");
        // }
        // else if(marks>=80)
        // {
        //     System.out.println("B grade");
        // }
        // else if(marks>=60)
        // {
        //     System.out.println("C grade");
        // }
        // else if(marks>=40)
        // {
        //     System.out.println("D Grade");
        // }
        // else
        // {
        //     System.out.println("F grade ");
        // }

        System.out.println("Enter input for broNum: ");
        int broNum =sc.nextInt();
        if(broNum ==0)
        {
            System.out.println("Baat Banjayegi");
        }
        else 
        {
            System.out.println("Baat anhi banegi");
        }



    }
}