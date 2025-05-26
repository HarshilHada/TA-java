#include <stdio.h>
void main() {
    int n, i;
    printf("Enter a Number to Print\n");
    scanf("%d", &n);

    printf("Using For Loop\n");
    for(i = 1; i <= n; i++) {
        printf("%d ", i);
    }

    printf("\nUsing While Loop\n");
    i = 1;
    while(i <= n) {
        printf("%d ", i);
        i++;
    }

    printf("\nUsing Do While Loop\n");
    i = 1;
    do {
        printf("%d ", i);
        i++;
    } while(i <= n);

    printf("\n");
    return 0;
}
