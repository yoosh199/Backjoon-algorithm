#include <stdio.h>

int main()
{
    int n, x, a;
    int x_list[] = {0};
    scanf("%d %d", &n, &x);

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a);
        if (a < x)
            printf("%d\n", a);
    }

    return 0;
}