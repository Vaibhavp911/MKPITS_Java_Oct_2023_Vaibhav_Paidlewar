#include<stdio.h>
int main()
{
    float AB,BC,CA;
    printf("Enter length of side AB: ");
    scanf("%f",&AB);
    printf("\nEnter length of side BC: ");
    scanf("%f",&BC);
    printf("\nEnter length of side CA: ");
    scanf("%f",&CA);
    if ((AB==BC)&&(BC=CA)&&(AB==CA))
    {
        printf("\n It is equilateral Triangle");
    }
    else if (((AB==BC)||(BC==CA)||(AB==CA)))
    {
        printf("\n It is isoscales Triangle");
    }
    else if ((AB!=BC)&&(BC!=CA)&&(AB!=CA))
    {
        printf("\n It is scaler Triangle");
    }
    else
    {
        printf("\n invalid");
    }
    
    
}