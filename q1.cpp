#include<conio.h>
#include<iostream.h>
void main()
{
  long int i,result,t;
	clrscr();
	try
	{
		i=result=0;
		cin>>t;
		if(t>1000)
		{
			throw 1;
		}
		for(int l=0;l<t;l++)
		{
			cin>>i;
			if(-1000<=i && i<=1000)
			{
				if(i>=0)
				{
					result=result+i;
				}
			}
			else
			{
				throw 2;
			}


		}
	}
	catch(int)
	{
	cout<<"Out of range";
	}
cout<<result;
getch();
}

