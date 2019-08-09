#include<stdio.h>
#include<math.h>
int main()
{
 float x,y;
  scanf("%f%f",&x,&y);
float d = sqrt(pow(x - 3, 2) +  
                pow(y - 4, 2) * 1.0); 
  printf("%.0f",d);
  return 0;
}