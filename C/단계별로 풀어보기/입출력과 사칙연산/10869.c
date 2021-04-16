#include <stdio.h>

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    while (a < 1 || b > 10000)
    {
        printf("a >=0 b >=10000 please\n");
        scanf("%d %d", &a, &b);
        if (a >= 1 && b <= 10000)
            break;
    }
    printf("%d\n", a + b);
    printf("%d\n", a - b);
    printf("%d\n", a * b);
    printf("%d\n", a / b);
    printf("%d\n", a % b);

    return 0;
}