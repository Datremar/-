#include <stdio.h>
#include <stdbool.h>

// #9 iz

int minimum(int arr[], int n) {
    int min;

    if (arr[n - 1] > arr[0]) {
        min = arr[0];
    }else {
        min = arr[n - 1];
    }

    return min;
}

bool isEqual(int arr1[], int arr2[], int n) {
    bool result = true;

    for (int i = 0; i < n; ++i) {
        if (arr1[i] == arr2[i]) {
            result = true;
        }else {
            result = false;
            break;
        }
    }

    return result;
}

void sortUp(int arr[], int n) {
    int temp;
    for (int i = 0; i < n - 1; i++){
        for (int j = i + 1; j < n; j++){
            if (arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

void sortDown(int arr[], int n) {
    int temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
int main(){
    int m, n;

    scanf("%d", &m);
    scanf("%d", &n);

    int arr[m][n];
    int extraArray[m];
    int sortedArray[m];


    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%d", &arr[i][j]);
        }
    }

    for (int i = 0; i < m; ++i) {
        for (int j = 0; j < n; ++j) {
            extraArray[j] = arr[i][j];
            sortedArray[j] = arr[i][j];
        }
        sortUp(sortedArray, m);
        if (isEqual(extraArray, sortedArray, m)) {
            printf("%d", minimum(extraArray, m));
            printf(" \n");
        }
        sortDown(sortedArray, m);
        if (isEqual(extraArray, sortedArray, m)) {
            printf("%d", minimum(extraArray, m));
            printf(" \n");
        }
    }

}
