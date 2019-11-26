#include <stdio.h>

// #5 iz

int main() {

    int n;
    scanf("%d", &n);

    int arr[n];

    for (int i = 0; i < n; ++i) {
        scanf("%d", &arr[i]);
    }

    int max = arr[1];

    for (int i = 1; i < n - 1; ++i) {
        if (arr[i] >= arr[i - 1] && arr[i] <= arr[i + 1]) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
    }


    if (n <= 2) {
        max = 0;
    }
    printf("%d", max);

    return 0;
}