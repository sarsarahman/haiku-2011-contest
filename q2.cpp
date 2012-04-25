#include<iostream.h>
#include<conio.h>
#include<math.h>
void main()
{
	int t;
	void two(unsigned long y);
		unsigned long* n = NULL;
		unsigned long x=0;
		unsigned long max=10000000000;
		try
		{
		cin>>t;
		if(t>10000)
		throw 1;
			n = new unsigned long[t];
			for(int i=0;i<t;i++)
			{
				cin>>n[i];
				if(n[i]>max)
				{
				throw 2;
				}
				if(x<n[i])
				x=n[i];
			}
			for(int j=0;j<t;j++)
			{
				two(n[j]);
			}

		}
	catch(int)
	{cout<<"Out of range";}
  getch();
}
void two(unsigned long y)
{
unsigned long z= 0;
for(int k=0;z<=y;k++)
z=pow(2,k);
cout<<z<<endl;
}