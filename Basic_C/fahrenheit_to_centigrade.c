#include<stdio.h>
int main()
{
    float F, C, TEMP;
printf("Enter temp. in fahrenheit: ");
scanf("%f",&F);
C=(F-32)*0.556;
printf("Temp. in centigrade: %f",C);
}