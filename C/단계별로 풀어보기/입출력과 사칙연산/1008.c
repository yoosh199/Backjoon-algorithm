#include <stdio.h>

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    while (a <= 0 || b >= 10)
    {
        printf("a <0 b<10 please\n");
        scanf("%d %d", &a, &b);
        if (a > 0 && b < 10)
            break;
    }
    printf("%.10g", (double)a / b); //%.9f
    return 0;
}