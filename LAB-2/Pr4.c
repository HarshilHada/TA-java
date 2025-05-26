#include <stdio.h>
#include <string.h>

void main() {
    char str[100];
    int count = 0;
    printf("Enter a string: ");
    scanf("%s", str);
    for(int i = 0; str[i] != '\0'; i++) {
        count++;
    }
    printf("The length of string is: %s\n", count);
}