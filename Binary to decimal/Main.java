#include<stdio.h>
#include<math.h>
int main()
{
  int b,sum,i=0;
  scanf("%d",&b);
  while(b>0)
  {
  if(b%10 == 1)
    sum = sum + pow(2,i);
  b=b/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}