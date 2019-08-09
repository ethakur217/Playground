#include <stdio.h>
int main() {
	char ch, s;
  scanf("%c",&s);
  
  if(s >= 'a' && s <= 'z')
    ch = s-32;
  else if(s >= 'A' && s <= 'Z')
    ch = s+32;
  
  printf("%c",ch);
    
	return 0;
}