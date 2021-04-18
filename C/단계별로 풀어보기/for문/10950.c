#include <stdio.h>

int main()
{
    int test_num;
    int a, b;

    scanf("%d", &test_num);
    for (int i = 0; i < test_num; i++)
    {
        scanf("%d %d", &a, &b);
        printf("%d\n", a + b);
    }

    return 0;
}