// Method for Student & Grade Problem

import java.util.Scanner;
public class StudentsGrade 
{
    public static char getGrade(int marks)
    {
        if(marks>=90)
        {
            return 'A';
        }
        else if(marks>=80)
        {
            return 'B';
        }
        else if(marks>=70)
        {
            return 'C';
        }
        else if(marks>=60)
        {
            return 'D';
        }
        else if(marks>=50)
        {
            return 'E';
        }
        else
        {
            return 'F';
        }

        // switch(marks/10)
        // {
        //     case 10: return 'A';
               // break; it is used when there is Sout use if we use return then we can use case without break but break is mandatory with case 
        //     case 9: return 'A';
        //     case 8: return 'B';
        //     case 7: return 'C';
        //     case 6: return 'D';
        //     default: return 'E';
        // }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        // char finalGrade = getGrade(marks);
        // System.out.println(finalGrade);

        for(int i =0; i<=100; i++)
        {
            char ans = getGrade(i);
            System.out.println("Grade = "+ i +" "+ ans);
        }
    }
    
}
