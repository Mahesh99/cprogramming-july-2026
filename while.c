#include<stdio.h>
void main() {
    int i,n;
    printf("Enter n:");
    scanf("%d",&n);//10
    //for(i=1;i<=n;i++)
    i=1;
    while(i<=n) {
        printf("%d ",i);
        i++;
    }
}