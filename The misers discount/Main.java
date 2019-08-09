#include<stdio.h>
int main()
{
  float i1,i2,d;
  float t, dp, as;
  scanf("%f%f%f",&i1,&i2,&d);
  t = i2+i1;
  dp = t -( t*(d/100));
  as = t - dp;
  printf("%.2f\n",t);
  printf("%.2f\n",dp);
  printf("%.2f",as);
  return 0;
}