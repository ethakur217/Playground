#include<stdio.h>
int main()
{
  int k,i,t=1;
  scanf("%d\n",&k);
  int a[k];
  for(i=1;i<=k;i++){
  scanf("%d ",&a[i]);
  }
  int y;
  scanf("\n%d",&y);
  
  for(i=1;i<=k;i++)
  {
  if(y == a[i]){
    printf("%d",i);
     t=0;
    break;
  }
  }
  if(t == 1)
    printf("%d isn't present in the array.",y);
  
  return 0;
}