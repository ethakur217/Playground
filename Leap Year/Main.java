#include<stdio.h>
int main()
{
  int y;
  scanf("%d",&y);
  
  if (y%4 == 0){
    if (y%100 == 0)
      if(y%400 == 0)
        printf("LEAP YEAR");
      else
        printf("NOT LEAP YEAR");
  }
  else if(y%4 == 0 && y%100 != 0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  return 0;
}