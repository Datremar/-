#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include <locale.h>

// #2

bool isPrime(int num) {
        bool result = true;
        if (num % 2 == 0) {
            result = false;
        }else if (num < 0 && num % 3 == 0) {
            result = false;
        }else  {
            for (int i = 1; i < num; i += 2) {
                if (num % i == 0 && i != 1) {
                    result = false;
                }
            }
        }

        if (num == 0 || num == 1) {
            result = false;
        }
        return result;
}


int main() {
    srand(time(NULL));

    int num;
    int numOfRandDigits;

    scanf("%d", &numOfRandDigits);

    for (int i = 0; i < numOfRandDigits; i++) {
        num = rand()%10000;
        printf("%d", num); printf(" ");
        if (isPrime(num)) {
            printf("true");
        }else {
            printf("false");
        }
        printf("\n");
    }

    return 0;
}