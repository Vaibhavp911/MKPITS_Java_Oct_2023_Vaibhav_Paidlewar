#include<stdio.h>
#include<conio.h>
int main()
{
    float  A,B;
    printf("Enter Value of A: ");
    scanf("%f",&A);
    printf("\nEnter Value of B: ");
    scanf("%f",&B);
    if(A>B)
    {
        printf("\n A is greater than B");
    
    }
    else if(A<B)
    {
        printf("\n B is greater than A");
    
    }
    else if(A=B)
    {
        printf("\nA is equal to B");
    }
    else
    {
        printf("\nINVALID NUMBERS");
    }
}