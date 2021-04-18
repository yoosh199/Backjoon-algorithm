#include <stdio.h>

int main()
{
    int n;

    scanf("%d", &n);
    for (int i = 1; i <= n; i++) // 총 n번 출력
    {
        for (int j = 1; j <= i; j++)
        { //각 줄에 출력되는 *의 갯수
            printf("*");
        }
        printf("\n");
    }

    return 0;
}