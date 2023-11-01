#include<stdio.h>
int main()
{
    int P,C,M,AVG;
    printf("Enter P Marks: ");
    scanf("%f",&P);
    printf("Enter C Marks: ");
    scanf("%f",&C);
    printf("Enter M Marks: ");
    scanf("%f",&M);

    AVG=(P+C+M)/3;
    if((P&&C&&M<=100)||AVG<=100)
    {
        if((P&&C&&M>=50)||AVG>=50)
        {
            printf("\nCongratulation you are PASSED!");
        }
        else
        {
            printf("\nmarks are above 100 is each subject is not valid");
        }
    }
    else
    {
        if((P&&C&&M<50)&& AVG<50)
        {
            printf("\n fail");
        }
        else
        {
             printf("\ninvalid number");
        }
    }
  
}