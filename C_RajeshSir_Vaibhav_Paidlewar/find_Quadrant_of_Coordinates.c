int main()
{
    float A,B;
    printf("Enter point A coordinates: ");
    scanf("%f",&A);
    printf("Enter point B coordinates: ");
    scanf("%f",&B);
    
    if (A==0 && B==0)
    {
        printf("\n Point is origin");
    }
    else if (A>=0 && B>=0)
    {
        printf("\n 1st Quadtant");
    }
    else if (A<=0 && B>=0)
    {
        printf("\n 2nd Quadtant");
    }
    else if (A<=0 && B<=0)
    {
        printf("\n 3rd Quadtant");
    }
    else if (A>=0 && B<=0)
    {
        printf("\n 4th Quadtant");
    }
    
    else
    {
        printf("\n point does not exit");
    }
}