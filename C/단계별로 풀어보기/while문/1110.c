#include <stdio.h>

int main()
{
    int original_n, n, ten, one, t, count;
    scanf("%d", &original_n);
    count = 0;
    n = original_n;
    while (1)
    {

        ten = n / 10;
        one = n % 10;
        t = ten + one;
        n = one * 10 + t % 10;
        count++;
        if (n == original_n)
            break;
    }
    printf("%d", count);
    return 0;
}