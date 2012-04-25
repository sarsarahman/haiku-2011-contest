#include<iostream.h>
#include<conio.h>
#include<math.h>
void main()
{
int t,l;
unsigned long* n = NULL;
unsigned long nn;
unsigned long in=0;
void fact(unsigned long nn);
clrscr();
try
{
cin>>t;
if(t>2000)
	{
		throw 1;
	}
	n = new unsigned long[t];
	for(int l=0;l<t;l++)
	{
		cin>>in;
		if(in>=(10^9))
		{
			n[l]=in;
		}
		else
		{
			throw 2;
		}
	}
	for(l=0;l<t;l++){
	fact(n[l]);
	cout<<endl;
}
}
catch(int)
{
	cout<<"invalid input";
}
getch();
}
void fact(unsigned long nn)
{
	unsigned long sum=0;
	unsigned long fact,i=1,k=5;
	while(1)
	{
		fact=nn/(pow(k,i));
		if(fact>0)
		{
			sum+=fact;
			i++;
		}
		else
		break;
	}
	cout<<sum;
}