/*

*/
#include<stdio.h>
#include<conio.h>
#include <string.h>
int main()
{
    int acc_Type, mobile_NUMBER[9],result;
    char Name[100], user_ID[6]="MKPITS",email_domain[50],Email[100],Password[100],c_PASSWORD[100], user_INPUT[6];

    printf("WELCOME ^ ^\n Enter 1 to LOG IN Or Enter 2 for CREATE ACCOUNT\n");
    scanf("%d",&acc_Type);
    if(acc_Type==2)
    {
        printf("Enter all details to create Account\n");
        printf("Enter Name: ");
        scanf("%s",&Name);
        printf("\nEnter E-mail name: ");
        scanf("%s",&Email);
        printf("\nEnter domain name: ");
        scanf("%s",&email_domain);
        printf("\nyou have %s@%s.com",&Email,&email_domain);
        printf("\nEnter Mobile No: ");
        scanf("%d",&mobile_NUMBER);
        printf("\nEnter user ID: ");
        scanf("%s",&user_INPUT);
        
           /*result = strcmp(user_ID, user_INPUT);
                if (result==0)
                    {
                        printf("\n ADMIN CONTROL ACCESS ");
                        
                    }
                 else if (result!=0)
                 {
                    
                    printf("\n NOT ADMIN ");
                 }
                 else
                    {
                        printf("\n NOT an ADMIN ");
                        
                    }
            */

           for (int i = 0; i < sizeof(user_ID[6]) / sizeof(user_INPUT[6]); i++)
                        {
                            if (user_ID[i] == user_INPUT[i])
                            {
                                printf("\n ADMIN CONTROL ACCESS");
                                
                            }
                            else
                            {
                                printf("\n NOT ADMIN");   
                            }
                        }

        printf("\n Enter password: ");
        scanf("%s",&Password);
        printf("\n Confirm password: ");
        scanf("%s",&c_PASSWORD);
                for (int i = 0; i < sizeof(Password[100]) / sizeof(c_PASSWORD[100]); i++)
                    {
                        if (Password[i] != c_PASSWORD[i])
                            {
                                printf("\n Password is not equal");
                                return 0;
                            }
                        else
                            {
                                printf("\n Password is confirmed.");   
                            }
                    }
    }
        else if (acc_Type==1)
            {
                /* code */
                printf("\nEnter E-mail name: ");
                scanf("%s",&Email);
                printf("\nEnter domain name: ");
                scanf("%s",&email_domain);
                printf("\nyou have %s@%s.com",&Email,&email_domain);
                printf("\n Enter password: ");
                scanf("%s",&Password);
                printf("\n Confirm password: ");
                scanf("%s",&c_PASSWORD);
                    for (int i = 0; i < sizeof(Password[100]) / sizeof(c_PASSWORD[100]); i++)
                        {
                            if (Password[i] != c_PASSWORD[i])
                            {
                                printf("\n Password is not equal");
                                return 0;
                            }
                            else
                            {
                                printf("\n Password is confirmed.");   
                            }
                        }
            }
        else
            {
                printf("\n ERROR LOADING PAGE RELOAD THE PAGE");
            }            
}