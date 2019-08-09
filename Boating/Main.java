#include<stdio.h>
int main()
{
  int t,a,c;
  scanf("%d%d%d",&t,&a,&c);
  int sum = (a*75)+(c*30);
  if(t > sum)
    printf("Boat is stable");
  else
    printf("Boat will drow");
  return 0;
}