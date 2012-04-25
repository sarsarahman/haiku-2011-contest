import java.io.*;
@SuppressWarnings("deprecation")
public class q5 {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
	int j,z,x=0;
	long[] pp=new long[1000];
	int[] no= new int[10000];
	DataInputStream in=new DataInputStream(System.in);
	z=Integer.parseInt(in.readLine());
	if(1<=z&&z<=1000)
	{
	for(j=0;j<z;j++)
	{
		no[j]=Integer.parseInt(in.readLine());
		if(0<=no[j]&&no[j]<=113)
		{ 
		if(x<no[j])
		{
			x=no[j];
		}
		}
		else
		{
		System.out.println("Out of range");
		System.exit(0);
		}
	}
	j=0;
	while(j<x)
	{
		for(int k=2;j<x;k++)
		{
			if(isprime(k)&&ispal(k))
			{
				pp[j]=k;
				j++;
			}	
		}
	}
	for(int k=0;k<z;k++)
	{
				System.out.println(pp[no[k]-1]);
	}
	}
	
	else{
		System.out.println("Out of range");
	}
	}
static boolean isprime(int num)
    {
       boolean flag=true;
       for(int i=2;i<num;i++)
       {
           if(num%i==0)
            {
               flag = false;
               break;
            }
       }
       if(flag==true)
       {
      	 return true;
       }
       else
       {
      	 return false;
       }
    }
    
static boolean ispal(int num)
    {
            int n = num;
            int reverse=0,remainder;
            while(num > 0)
            {
                  remainder = num % 10;
                  reverse = reverse * 10 + remainder;
                  num = num / 10;
             }
            if(reverse == n)
                return true;
            else
                return false;
       }
}