#include<iostream.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
void grid(int m,int n);
int x[200],y[200],i,t;
cin>>t;
for(i=0;i<t;i++)
{
cin>>x[i]>>y[i];
}
for(i=0;i<t;i++)
{
grid(x[i],y[i]);
cout<<endl;
}


getch();

}
void grid(int m,int n)
{
if(m==n)
{
	 if(m%2==0)
	 cout<<"L";
	 else
	 cout<<"R";
}
else if(m>=2&&m>n)
{
  if(n%2==0)
	  cout<<"U";
	else
	  cout<<"D";
}
else if(m>=2&&m<=n)
{
  if(m%2==0)
	 cout<<"L";
  else
	 cout<<"R";
}
else
cout<<"R";
}