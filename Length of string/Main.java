#include<stdio.h>
#include<string.h>
int main()
{
char z[100];
  int i=0;
  gets(z);
  
  while(z[i] != '\0'){
  i++;
  }
  printf("%d",i);
  return 0;
}