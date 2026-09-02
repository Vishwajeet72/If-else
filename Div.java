import java.io.*;
public class Div
{
	public static void main(String args [])  throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 System.out.print("Enter the First Number :");
	 int num1 = Integer.parseInt(br.readLine());
	 System.out.print("Enter the Second Number :");
	 int num2= Integer.parseInt(br.readLine());
	 int result = num1/num2 ;
	 if(num2 == 0)
	 {
	    System.out.print("Div = " + result );

	 }
	 else
	 {
       System.out.print("Can Not Perform Division...");
	 }
	}

}