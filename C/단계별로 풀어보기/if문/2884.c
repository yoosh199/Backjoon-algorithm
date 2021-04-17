#include <stdio.h>

#define ONEDAY 24

int main()
{
    int wake_up_hour, wake_up_minute;
    scanf("%d %d", &wake_up_hour, &wake_up_minute);

    if (wake_up_minute < 45)
    {
        int alarm_hour, alarm_minute;
        alarm_hour = wake_up_hour - 1;
        alarm_minute = wake_up_minute + 60 - 45;
        if (alarm_hour < 0)
        {
            alarm_hour = ONEDAY - 1;
        }

        printf("%d %d", alarm_hour, alarm_minute);
    }
    else
    {
        printf("%d %d", wake_up_hour, wake_up_minute - 45);
    }

    return 0;
}