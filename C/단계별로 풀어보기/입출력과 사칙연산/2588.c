#include <stdio.h>

int main()
{
    int firstThreeDigit, secondThreeDigit;
    int sceondOneHundred, secondTen, secondOne;
    scanf("%d", &firstThreeDigit);
    scanf("%d", &secondThreeDigit);
    secondOne = secondThreeDigit % 10;
    secondTen = (secondThreeDigit % 100 - secondOne) / 10;
    sceondOneHundred = (secondThreeDigit - secondTen - secondOne) / 100;

    printf("%d\n", firstThreeDigit * secondOne);
    printf("%d\n", firstThreeDigit * secondTen);
    printf("%d\n", firstThreeDigit * sceondOneHundred);
    printf("%d", firstThreeDigit * secondThreeDigit);

    return 0;
}