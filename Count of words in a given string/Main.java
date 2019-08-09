#include<stdio.h>
#include<string.h>

int main()
{
  char z[100];
  gets(z);
  int i,j=0;
  while(z[i] != '\0'){
  if(z[i] == ' ')
    j++;
    i++;
  }
  printf("%d",j+1);
  return 0;
}