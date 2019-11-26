#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *replaceLine(char *mainStr, char *firstStr, char *secondStr) {

	char *tempPtr = (char*)malloc(100), *ptr = (char*)malloc(100);
	ptr = strstr(mainStr, firstStr);

	strcpy(tempPtr, ptr + strlen(firstStr));
	strcat(mainStr, secondStr);
	strcpy(ptr, ptr + strlen(firstStr));
	strcpy(ptr, secondStr);
	strcat(mainStr, tempPtr);

	return mainStr;
}


int main() {
	system("chcp 1251");
	system("cls");

	char mainStr[] = {"Hello my my World!"};
	char firstStr[] = {" my"};
	char secondStr[] = {" *new string*"};

	printf(" Primal:\n%s\n\n", mainStr);
	printf(" Sub:\n%s\n\n", firstStr);

	printf(" Result:\n");
	puts(replaceLine(mainStr, firstStr, secondStr));

	return 0;
}