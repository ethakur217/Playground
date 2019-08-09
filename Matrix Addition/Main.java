#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d%d",&n,&m);
  int a1[n][m];
  int a2[n][m];
  int i,j;
  for(i=0;i<n;i++){
  for(j=0;j<n;j++){
  scanf("%d",&a1[i][j]);
  }
  }
   for(i=0;i<n;i++){
  for(j=0;j<n;j++){
  scanf("%d",&a2[i][j]);
  }
  }
  printf("%d %d\n",a1[0][0]+a2[0][0],a1[0][1]+a2[0][1]);
  printf("%d %d\n",a1[1][0]+a2[1][0],a1[1][1]+a2[1][1]);
  return 0;
}