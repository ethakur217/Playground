#include<stdio.h>
int main()
{
	long int n,i;
  long int fact=1;
  scanf("%ld",&n);
  if(n == 0)
    printf("1");
  else if (n>0){
  for(i=1;i<=n;i++){
  fact = fact *i;  
  }
  printf("%ld",fact);
  }
  else 
    printf("Wrong input");
  return 0;
  }