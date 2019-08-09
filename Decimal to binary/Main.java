#include<stdio.h>
int main()
{
  int s,i=0;
  int a[100];
  scanf("%d",&s);
  
  while(s>0)
  {
  if(s%2 == 0)
    a[i] = 0;
  else
    a[i] = 1;
   s=s/2;
    i++;
  }
  for(i=i-1;i>=0;i--)
    printf("%d",a[i]);
  return 0;
}