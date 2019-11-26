#include <stdio.h>
#include <malloc.h>

// #7 iz

//realloc + fix

int main() {

    int n, k = 0, tmp;
    int *arr;

    scanf("%d", &n);

    arr = (int*)calloc(n, sizeof(int));

    for (int i = 0; i < n; ++i) {
        scanf("%d", &arr[i]);
    }

    for (int i = n; i >= 0; --i) {
        if (arr[i] < 0) {
            arr = (int*)realloc(arr, n * sizeof(int));
            for (int j = n + k; j > i + 1; --j) {
                arr[j] = arr[j - 1];
            }
            k++;
            arr[i + 1] = 0;
        }
    }

    for (int i = 0; i <= n + k - 1; ++i) {
        printf("%d", arr[i]);
        printf(" ");
    }

    free(arr);

    return 0;
}