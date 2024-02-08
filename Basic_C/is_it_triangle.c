#include<stdio.h>
main()
{
    float A,B,C,Triangle;
    printf("enter angle ∠A: \n");
    scanf("%f",&A);
    printf("enter angle ∠B: \n");
    scanf("%f",&B);
    printf("enter angle ∠C: \n");
    scanf("%f",&C);
    Triangle=A+B+C;
    if (Triangle<=180)
    {
        printf("\nIt is a Triangle");
    }
    else if (Triangle<=0 || Triangle>180)
    {
        printf("\n  its not triangle");
    }
    else
    {
        printf("invalid input");
    }
    
}
