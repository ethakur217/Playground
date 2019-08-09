#include<stdio.h>
int main()
{
  	int n,i;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++){
  scanf("%d",&a[i]);
  }
  int n1,n2,flag=0,flag1=0;
  scanf("%d%d",&n1,&n2);
  for(i=0;i<n;i++){
  if(a[i] == n1){
    printf("Element 1 index = %d\n",i);
    flag = 1;
  	}
  }
    if (flag == 0)
    printf("Element 1 index = -1\n");
    
  
    for(i=0;i<n;i++){
  if(a[i] == n2){
    printf("Element 2 index = %d",i);
    flag1 = 1;
  	}
    }
    if (flag1 == 0)
      printf("Element 2 index = -1");
  
}