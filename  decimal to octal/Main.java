#include<stdio.h>
int main()
{
  int n,i=0;
  int a[100];
  scanf("%d",&n);
  while(n>0){
    a[i] = n%8;
    n=n/8;
    i++;
  }
  
  for(i=i-1;i>=0;i--){
  printf("%d",a[i]);
  }
  return 0;
}