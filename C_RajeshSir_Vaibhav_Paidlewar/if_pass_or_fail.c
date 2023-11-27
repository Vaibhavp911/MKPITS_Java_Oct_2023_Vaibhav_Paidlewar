#include<stdio.h>
int main()
{
    int Math;
    printf("Enter the marks you got: ");
    scanf("%d",&Math);
    if(Math>=50 && Math<=100)
    {
        printf("\nYou have cleared the subject!");
    }
    else if (Math>=0 && Math<50)
    {
        printf("\nFailed in Maths");
    }
    else
    {
        printf("INVALID MARKS");
    }
    
}