#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter A: ");
    scanf("%d",&a);
    printf("\nenter B: ");
    scanf("%d",&b);
    c=b;
    b=a;
    a=c;
    printf("\nswapped values of A :%d ",a);
    printf("\nswapped values of B :%d ",b);
}