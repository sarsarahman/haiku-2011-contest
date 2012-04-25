import java.io.*;
public class q6 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException { 
		int x=0,t,k=0;
		int[] input= new int[101]; 
		DataInputStream in=new DataInputStream(System.in);
		t=Integer.parseInt(in.readLine());
		if(t>100)
		{
		System.out.println("Out of range");
		System.exit(0);
		}
		for(int i=0;i<t;i++)
		{
			input[i]=Integer.parseInt(in.readLine());
			if(0>input[i]||input[i]>100)
			{
			System.out.println("Out of range");
			System.exit(0);
			}
			if(x<input[i])
			{
				x=input[i];
			}
		}
	    	 for (k= 0; k < t; k++) { 
	    			pascal(input[k]);
	                System.out.println(" ");
	    	 }
	        }  
	static void pascal(int last){
		        int[] n= new int[101];   
		        for (int i= 0; i <=last; i++) { 
		            n[i]= 1;
		            for (int j= i; --j > 0; n[j]+= n[j-1]); 
		            	for(int j= 0; j <= i; j++)
		            		if(i==last){
		                System.out.print(n[j]+" ");}  
		        }		
}
}