#include <stdio.h>

int is_leap_year(int leap_year)
{
    if ((leap_year % 4 == 0) && (leap_year % 100 != 0))
    {
        return 1;
    }
    if (leap_year % 400 == 0)
    {
        return 1;
    }

    return 0;
}

int main()
{
    int leap_year;
    scanf("%d", &leap_year);
    if (is_leap_year(leap_year) == 1)
    {
        printf("1");
    }
    else
    {
        printf("0");
    }

    return 0;
}