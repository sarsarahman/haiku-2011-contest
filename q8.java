import java.io.*;
public class q8 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException{
		int t,i;
		String[] result=new String[100];
		DataInputStream in=new DataInputStream(System.in);
		t=Integer.parseInt(in.readLine());
		if(t<100)
		{
			for(i=0;i<t;i++)
			{
				String[] input = new String[2];
					input = in.readLine().split(" ");
					String s1 = input[0];
					String s2 = input[1];
					if(s1.length()>100||s2.length()>100)
					{
					System.out.println("Out of range");
					System.exit(0);
					}
				if(isAnagram(s1,s2)==true)
				{
					result[i]="YES";
				}
					else
					{
						result[i]="NO";
					}
	
		}
			for(i=0;i<t;i++)
			{
				System.out.println(result[i]);
			}
	
	}
		else{
			System.out.println("Out of range");
		}
	}
	static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		char [] a1 = s1.toCharArray();
		char [] a2 = s2.toCharArray();
		for (int i = a1.length - 1; i >= 0; --i) {
		int j;
		for (j = a2.length - 1; j >= 0; --j) {
		if (a1[i] == a2[j])
			{
			a2[j]='#';
			break;
			}
		}
		if (j < 0) return false;
		}
		return true;
		}

}
