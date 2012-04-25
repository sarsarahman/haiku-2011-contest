import java.io.*;
public class q3 {
	static int gcd(int a, int b)
	{
			  if(b == 0)
			  {
						 return a;
			  }
			  else
			  {
						 return gcd(b, a % b);
			  }
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException
	{
		 int a,b,t,i;
		 
			 DataInputStream in=new DataInputStream(System.in);
			 t=Integer.parseInt(in.readLine());
			 if(t>10001)
			 {
				 System.out.println("Invalid Input");
			 }
			 else
			 {
				 int[] result=new int[10001];
				 for(i=0;i<t;i++)
				 {
					 String[] input = new String[2];
					 input = in.readLine().split(" ");
					 a = Integer.parseInt(input[0]);
					 b = Integer.parseInt(input[1]);
					 result[i]=gcd(a,b);
				 }
				 for(i=0;i<t;i++)
				 {
					System.out.println(result[i]);
				 }
			 }
	}     
}
