
#include <stdio.h>

int main()
{
    int n, max, min;
    max = -1000001;
    min = 1000001;

    scanf("%d", &n);
    int arr[n];
    for (int j = 0; j < n; j++)
    {
        scanf("%d", &arr[j]);
    }

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
        if (arr[i] < min)
        {
            min = arr[i];
        }
    }

    printf("%d %d", min, max);
    return 0;
}

// for (int i = 0; i < n; i++)
//     {
//         scanf("%d", &a);
//         if (a > max)
//         {
//             max = a;
//         }
//         if (a < min)
//         {
//             min = a;
//         }
//     }

//     printf("%d %d", min, max);