#include <stdio.h>
#include <stdbool.h>

// #3 iz

int main() {

    int size, sum1 = 0, number, sum2 = 0;
    bool flag = false;


    scanf("%d", &size);

    for (int i = 0; i < size; ++i) {
        scanf("%d", &number);
        if (number == 0) {
            flag = !flag;
            if (flag) {
                sum1 = 0;
            }
            if (!flag) {
                sum2 = 0;
            }
        }

        if (flag) {
            sum1 += number;
        }
        if (!flag) {
            sum2 += number;
        }
    }

    if (!flag) printf("%d", sum1);
    printf("\n");
    if (flag) printf("%d", sum2);

    return 0;
}