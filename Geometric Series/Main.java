#include<stdio.h>
#include<math.h>
int main()
{
  int a,d,s;
  scanf("%d",&a);
  
  if(a%2 == 0){
  d = (a/2)-1;
    s = pow(3,d);
  }
  else
  {
  d = (a-1)/2;
    s = pow(2,d);
  }
  printf("%d",s);
  return 0;
}