#include <stdio.h>

int main()
{ 
   int a,b,c;
  scanf("%d,%d,%d",&a,&b,&c);
  int s= 0;
  
  if(a>b)
    s=a;
  else
    s=b;
  if(s>c)
    printf("%d",s);
  else{
    s=c;
  printf("%d",s);
  }
  return 0;
    
}