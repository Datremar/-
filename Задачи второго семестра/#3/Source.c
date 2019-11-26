#include <stdio.h>
#include <string.h>
#include <stdlib.h>


void deleteLine(char *firstStr, char *secondStr) {
    char *tempStr = strstr(firstStr, secondStr);

    if (tempStr != NULL){
        strcpy(tempStr, tempStr + strlen(secondStr));
    }
    puts(firstStr);
}


int main() {
    system("chcp 1251");
    system("cls");

    char firstStr[] = { "Hello my World!" };
    char secondStr[] = { "my" };

    printf("Primal string:\n%s\n\n", firstStr);
    printf("Substring:\n%s\n\n", secondStr);

    printf("Primal without sub:\n");
    deleteLine(firstStr, secondStr);

    return 0;
}