import java.io.*;
import java.util.*;

public class Divisible
{
	
	public static void main(String args[]) 
	{
	Scanner sc = new Scanner (System.in);
	 System.out.print("Enter the  Number :");
	 int num = sc.nextInt();

        if (num % 5 == 0 && num % 7 == 0)
        {
            System.out.println(num + " is Divisible by 5 and 7");
        }
        else if (num % 5 == 0)
        {
            System.out.println(num + " is Divisible by 5 only");
        }
        else if (num % 7 == 0)
        {
            System.out.println(num + " is Divisible by 7 only");
        }
        else
        {
            System.out.println(num + " is not Divisible by 5 or 7");
        }
    }
}



