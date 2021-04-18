#include <stdio.h>

int main()
{
    int a, b;
    int i = 0;
    while (scanf("%d %d", &a, &b) != EOF) //eof 처리 ctrl+z 누르면 파일의끝(그만 입력하겠다는 의미)
    {
        printf("%d\n", a + b);
    }

    return 0;
}