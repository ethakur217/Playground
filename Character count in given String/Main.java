#include<stdio.h>
#include <string.h> 
int main()
{
	char s[100];
  gets(s);
  int i,k,j=1;
  int t = strlen(s);
  if(t<=20){
  while(s[i] != '\0')
  {
  while(s[k] == s[k+1]){
  		j++;
  k++;}
    
    printf("%c%d",s[i],j);
    i=i+j;
    j=1;
    k=i;
  }
  }
  else
    printf("Invalid Input");
}