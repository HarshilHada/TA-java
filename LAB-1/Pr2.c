#include <stdio.h>

void main() {
    int n1, n2, n3;
    printf("Enter 3 Numbers\n");
    scanf("%d %d %d", &n1, &n2, &n3);

    if(n1 > n2 && n1 > n3) {
        printf("Largest Number is: %d\n", n1);
    } else if(n2 > n1 && n2 > n3) {
        printf("Largest Number is: %d\n", n2);
    } else {
        printf("Largest Number is: %d\n", n3);
    }
}
