#include<stdio.h>
#include <string.h>
int main()
{
  char ch;
  char c[10]={'a','e','i','o','u','A','E','I','O','U'};
  int i,flag;
  scanf("%c",&ch);
  for(i=0;i<10;i++){
  if (ch == c[i]){
    printf("Vowel");
    flag =1;
    break;
    }
  }
  if (flag != 1)
  printf("Consonant");
  
  return 0;
}