#include<stdio.h>
int main()
{
  int d;
  scanf("%d",&d);
  
  int y = d/365;
  int week = (d-(365*y))/7;
  int days = (d-(365*y))-week*7;
  printf("%d\n%d\n%d",y,week,days);
  return 0;
  
}