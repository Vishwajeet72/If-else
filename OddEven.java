import java.io.*;
public class OddEven
{
	public static void main(String args [])  throws Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 System.out.print("Enter the Number :");
	 int num = Integer.parseInt(br.readLine());
	 int rem = num % 2 ;
	 if(rem == 0)
	 {
	    System.out.print(num +" is Even . . .");

	 }
	 else
	 {
       System.out.print(num +" is odd . . . ");
	 }
	}

}