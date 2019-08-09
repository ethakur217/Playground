#include<stdio.h>

int main()
{
float a,r;
  float s;
  scanf("%f\n%f",&a,&r);
  
  s = (2*3.14*r*a)/360;
  printf("%.2f",s);
  return 0;

}