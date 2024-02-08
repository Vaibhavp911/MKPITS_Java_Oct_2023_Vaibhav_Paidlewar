#include<stdio.h>
int main()
{
    int N,E;
    //float O;
    printf("Enter the no. to identify whether it is ODD or EVEN: ");
    scanf("%d",&N);
    E=N%2;
   // O=N/2;
    if (E==0)
    {
        printf("\nN is EVEN Number! ");
    }
    else
    {
        printf("\n N is ODD Number! ");
    }
    
}