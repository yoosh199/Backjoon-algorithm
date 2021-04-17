#include <stdio.h>

int where_is_point(int x, int y)
{
    if (x > 0)
    {
        if (y > 0)
            return 1;
        if (y < 0)
            return 4;
    }
    else
    {
        if (y > 0)
            return 2;
        if (y < 0)
            return 3;
    }

    return 0;
}

int main()
{
    int x;
    int y;
    scanf("%d %d", &x,&y);
    if (where_is_point(x, y) == 0)
    {
        printf("사분면에 속해 있지 않습니다");
    }
    if (where_is_point(x, y) == 1)
    {
        printf("1");
    }
    if (where_is_point(x, y) == 2)
    {
        printf("2");
    }
    if (where_is_point(x, y) == 3)
    {
        printf("3");
    }
    if (where_is_point(x, y) == 4)
    {
        printf("4");
    }

    return 0;
}