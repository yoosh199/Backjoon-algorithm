#include <stdio.h>

int main()
{
    int n, space, star;

    scanf("%d", &n);
    for (int i = 1; i <= n; i++)                 // 총 n번 출력
    {                                            // n개 까지 출력이면 n개의 문자 공간이 있는데 공간 = 공백+별
        for (space = 1; space <= n - i; space++) // 여기는 공백
        {
            printf(" ");
        }
        for (star = space; star <= n; star++) // 여기는 별
        {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}