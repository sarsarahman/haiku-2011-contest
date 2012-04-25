import java.io.*;
public class q7 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int n,i,n1,n2;
		int[] result=new int[100];
		DataInputStream in=new DataInputStream(System.in);
		n=Integer.parseInt(in.readLine());
		if(n>100)
		{
		System.out.println("Out of range");
		System.exit(0);
		}
		String[] input = new String[2];
		for(i=0;i<n;i++)
		{
			input = in.readLine().split(" ");
			n1 = Integer.parseInt(input[0]);
			n2 = Integer.parseInt(input[1]);
		 	result[i]=reverse(reverse(n1)+reverse(n2));
		}
		for(i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
	}
	static int reverse(int num)
    {
         int reverse=0,remainder;
         while(num > 0)
         {
        	 remainder = num % 10;
        	 reverse = reverse * 10 + remainder;
        	 num = num / 10;
         }
         return reverse;
       }
}