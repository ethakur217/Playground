#include<stdio.h>
int main()
{
  int n,m;
  int i,j;
  scanf("%d\n%d",&n,&m);
  int a1[n][m];
  int a2[n][m];
  for(i=0;i<n;i++){
  for(j=0;j<m;j++){
  scanf("%d",&a1[i][j]);
  }
  }
   for(i=0;i<n;i++){
  for(j=0;j<m;j++){
  scanf("%d",&a2[i][j]);
  }
  }
  printf("The Result is:\n");
  printf("%d %d\n",a2[0][0]-a1[0][0],a2[0][1]-a1[0][1]);
  printf("%d %d",a2[1][0]-a1[1][0],a2[1][1]-a1[1][1]);
  
  return 0;
}