#include <stdio.h>

// #1

//Git Test

int main() {
    char str;
    int turn;
    int direction = NULL;
    int result;

    scanf("%c", &str);
    scanf("%d", &turn);

    switch (str) {
        case 'N':
            direction = 0;
            break;
        case 'S':
            direction = 2;
            break;
        case 'W':
            direction = 3;
            break;
        case 'E':
            direction = 1;
            break;
    }

    result = direction + turn;

    if (result > 3) {
        result = 0;
    }

    if (result < 0) {
        result = 3;
    }

    switch (result) {
        case 0:
            printf("North");
            break;
        case 1:
            printf("East");
            break;
        case 2:
            printf("South");
            break;
        case 3:
            printf("West");
            break;
        case NULL:
            printf("Error");
            break;
    }


    return 0;
}