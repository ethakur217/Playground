#include<stdio.h>

int main()
{

    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);  //lf is a format specifier to take double as input

    // a is the largest
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            /*
                .2lf restricts the number till 
                2 decimal places
            */
            printf("%d", b);
        }
        else
        {
            printf("%d", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("%d",a);
        }
        else
        {
            printf("%d",c);
        }
    }

    // c is the largest number of the three
    else if(a >= b)
    {
        printf("%d", a);
    }
    else
    {
        printf("\%d", b);
    }
    return 0;
}