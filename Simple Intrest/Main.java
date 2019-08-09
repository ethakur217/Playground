#include<stdio.h>
int main()
{
 float P,n,r;
  scanf("%f\n%f\n%f",&P,&n,&r);
  float SI = (P*r*n)/100;
  printf("%.6f",SI);
  return 0;
}