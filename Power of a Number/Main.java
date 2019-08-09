#include <stdio.h>
int main()
{
  	int b,p;
  scanf("%d\n%d",&b,&p);
  int i;
  int sum =1;
  if(p==0)
    printf("1");
 else if(p>0){
  for(i=1;i<=p;i++){
  sum *=b;
  }
      printf("%d",sum);
  }
  else
    printf("Wrong input");
    return 0;
}