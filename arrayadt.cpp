#include<iostream>
#include<stdio.h>
using namespace std;
int a[15];
int length=10;
void display()
{
	for(int i=0;i<length;i++)
{
	cout<<a[i]<<" ";
}
}
void add(int x)
{
 a[length]=x;
 length++;

}
void insert(int index,int x)
{
	for(int i=length;i>index;i--)
	{
		a[i]=a[i-1];
	}
	a[index]=x;
	length++;
}
void delete7(int index)
{ 
	for(int i=index;i<length-1;i++)
	{
		a[i]=a[i+1];
	}
   length--;
}
int min()
 { int min;
 min=a[0];
 for(int i=1;i<length;i++)
      {
       if(min>a[i])
       {
	min=a[i];}
	  }
	  return min;
 }
 int max()
 { int max;
 max=a[0];
 for(int i=1;i<length;i++)
      {
       if(max<a[i])
       {
	max=a[i];}
	  }
	  return max;
 }
 void reverse()
 { int i,j;
 for(i=0,j=length-1;i<j;i++,j--)
 {int temp=a[i];
 a[i]=a[j];
 a[j]=temp;
 }
 
 }
void issorted()
 {
     for(int i=0;i<length;i++)
     {
         if(a[i]>a[i+1])
        {
		  cout<<"not sorted";
        }
     }
      cout<<"is sorted";
 }
int main()
{
int i;
int x;
int index;
for(i=0;i<10;i++)
{
	cin>>a[i];
}
 /*display();
 cout<<"input element to add ";
 cin>>x;
 add(x);
 display();
 */
/*cout<<"insert at "<<"element ";
 cin>>index>>x;
 insert(index,x);
 display();
*/
/*cout<<"delete at";
cin>>index;
 delete7(index);
 display();
 
 reverse();
 display();
 */
 issorted();
 
}