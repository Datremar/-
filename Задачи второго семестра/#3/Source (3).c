#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void searchSubStr(char *str) {

	char space[] = " ";
	char *ptr = (char*)malloc(100);
	int len = 0, count = 0;

	ptr = strstr(str, space);

	for (int i = 1; ptr[i] != ' '; i++) {
		len++;
	}

	char *subStr = (char*)malloc(len);

	for (int  i = 0; i < len + 1 ; i++) {
		subStr[i] = ptr[i];
	}

	for (int i = 0; ptr[i] != '\0'; i++) {
		if (ptr[i] == ' ') {
			count++;
		}
	}

	if (count == 1) {
		printf("\n\tThere's only one space\n");
	}
	else {
		printf("\n\tA word between spaces\n");
		for (int i = 1; i <= len; i++)
			printf("%c", subStr[i]);
	}
}


int main() {
	system("chcp 1251");
	system("cls");

	char *str = (char*)malloc(100);

	printf("\n\tEnter line:\n");
	gets(str);
	searchSubStr(str);

	return 0;
}