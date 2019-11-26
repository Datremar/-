#include <stdio.h>

// #4 iz

int main() {

    int n, k, num;
    int deltaN = -1, deltaK = -1;

    printf("Num of packs: k = ");
    scanf("%d", &k);

    printf("\n");

    printf("Num of nums: n = ");
    scanf("%d", &n);

    for (int i = 0; i < k; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%d", &num);
            if (num == 2) {
                deltaK = i;
                deltaN = j;
            }
        }
        if (deltaK == -1 && deltaN == -1) {
            printf("No 2's was found \n");
        }else {
            printf("2 found at coordinates: k = ");
            printf("%d", ++deltaK);
            printf(" n = ");
            printf("%d", ++deltaN);
            printf("\n");
        }
        deltaK = -1;
        deltaN = -1;
    }

    return 0;
}