#include<stdio.h>
int main()
{
 int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int ben,black,rem;
  
  ben = a*b/100;
  black = (a-ben)*c/100;
  rem = a-(ben+black);
  printf("%d\n%d\n%d",ben,black,rem/3);
  return 0;
  
}