#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int r = n%10;
  int q = n/1000;
  printf("%d",r+q);
  return 0;
}