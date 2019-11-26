#include <stdio.h>

// iz 8

int main() {

    int size, resultingSize, k = 0;
    scanf("%d", &size);
    resultingSize = size;
    int arr[size], n = 0;

    for (int i = 0; i < size; ++i) {
        scanf("%d", &arr[i]);
    }

    for (int m = 0; m < size; ++m) {
        for (int i = 0; i < size - k; ++i) {
            for (int j = i + 1; j < size - k; ++j) {
                if (arr[i] == arr[j]) {
                    n++;
                    if (n > 2) {
                        for (int l = i; l < size - k; ++l) {
                            arr[l] = arr[l + 1];
                        }
                        ++k;
                        --resultingSize;
                        n = 0;
                    }
                }
            }
        }
    }

    printf("Array: ");
    for (int i = 0; i < size - k; ++i) {
        printf("%d", arr[i]);
        printf(" ");
    }
    printf("\n");
    printf("Arrray's size: ");
    printf("%d", resultingSize);

    return 0;
}