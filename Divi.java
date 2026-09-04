import java.io.*;

public class Divi
{
	
	public static void main(String args[]) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

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



