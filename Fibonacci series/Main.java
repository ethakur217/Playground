#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
 int next, first, second=1,c;
 for (c = 0; c < n; c++)
  {
    if (c <= 1)
      next = c;
    else
    {
      next = first + second;
      first = second;
      second = next;
    }
    printf("%d ", next);
  }
 
  return 0;
}
