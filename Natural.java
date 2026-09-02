import java.io.*;
public class Natural
{
	public static void main(String args [])  throws Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 System.out.print("Enter the Number :");
	 int num = Integer.parseInt(br.readLine());
	 if(num > 0)
	 {
	    System.out.print(num +" is a Natural Number");

	 }
	 else
	 {
       System.out.print(num +" is Not a Natural Numbaer . . . ");
	 }
	}

}