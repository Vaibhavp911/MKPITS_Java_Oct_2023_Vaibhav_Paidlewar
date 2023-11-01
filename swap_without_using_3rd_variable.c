#include<stdio.h>
int main()
{
    int A,B;
    printf("enter A: ");
    scanf("%d",&A);
    printf("\nenter B: ");
    scanf("%d",&B);
    A=A+B;
    B=A-B;
    A=A-B;
    printf("\nswapped values of A :%d ",A);
    printf("\nswapped values of B :%d ",B);

}