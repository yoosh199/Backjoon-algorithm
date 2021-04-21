#include <stdio.h>

int main()
{
    int arr[9];
    int order, max = 0;

    for (int i = 0; i < 9; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (int j = 0; j < 9; j++)
    {
        if (arr[j] > max)
        {
            max = arr[j];
            order = j;
        }
    }

    printf("%d\n%d", max, order + 1);
    return 0;
}