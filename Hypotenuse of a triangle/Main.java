#include<stdio.h>
#include <math.h>
int main()
{
  float s1,s2;
  scanf("%f\n%f",&s1,&s2);
  float h = sqrt(s1*s1+s2*s2);
  printf("%.2f",h);
  return 0;
}