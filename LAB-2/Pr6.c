#include <stdio.h>
#include <string.h>

void main() {
    char input[100];
    printf("Enter a string:\n");
    scanf("%s", input);
    char copy[100];
    for(int i = 0; input[i] != '\0'; i++) {
        copy[i] = input[i];
    }
    printf("The copied string is: %s\n", copy);

}