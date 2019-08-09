#include<stdio.h>
int main()
{
 int a,b,l,i;
  scanf("%d\t%d",&a,&b);
  if (a%b ==0)
    printf("%d",a);
  else if(b%a == 0)
    printf("%d",b);
  else
  {
  for(i=2; i <= a && i <= b; ++i)
    {
    if(a%i==0 && b%i==0){
      printf("%d",i);
    break;}
    else{
      printf("%d",a*b);
    break;}
  }
  }
  
  return 0;
}