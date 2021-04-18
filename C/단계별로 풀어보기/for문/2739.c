#include <stdio.h>

int main()
{
    int num;
    scanf("%d", &num);
    for (int i = 1; i < 10; i++)
    {
        if (i == 9)
        {
            printf("%d * %d = %d", num, i, num * i);
        }
        else
        {
            printf("%d * %d = %d\n", num, i, num * i);
        }
    }
    return 0;
}