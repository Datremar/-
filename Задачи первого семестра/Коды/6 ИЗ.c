#include <stdio.h>

// #6

//fix

int main() {

    int n;
    scanf("%d", &n);

    int arr[n];
    int sum = 0;
    int flag = -2;

    for (int i = 0; i < n; i++) {
        arr[i] = scanf("%d", &arr[i]);
    }

    for (int i = 0; i < n - 1; i++) {
        int difference = arr[i + 1] - arr[i];
        if ((difference > 0) && (flag != 1)) {
            flag = 1;
            sum = sum + 1;
            continue;
        }

        if ((difference < 0) && (flag != -1)) {
            flag = -1;
            sum = sum + 1;
            continue;
        }

        if ((difference == 0) && (flag != 0)) {
            flag = 0;
            sum = sum + 1;
            continue;
        }
    }

    printf("%d", sum);

    return 0;
}