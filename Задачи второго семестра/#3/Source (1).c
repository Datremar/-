#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>


void deleteLine(char *firstStr, char *secondStr) {
	char *tempStr;

	while (true) {
		tempStr = strstr(firstStr, secondStr);

		if (tempStr != NULL) {
			strcpy(tempStr, tempStr + strlen(secondStr));
		}else {
			break;
		}
	}
	puts(firstStr);
}


int main() {
	system("cls");

	char firstStr[] = {"Hello my my my my my my my bIbIbI my World!"};
	char secondStr[] = {"my"};

	printf("Primal:\n%s\n\n", firstStr);
	printf("Sub:\n%s\n\n", secondStr);

	printf("Prime without sub:\n");
	deleteLine(firstStr, secondStr);

	return 0;
}