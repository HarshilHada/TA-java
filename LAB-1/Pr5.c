#include <stdio.h>
void main() {
    int n, count = 0;
    printf("Enter a Number to check if it is Prime or Not\n");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++) {
        if(n % i == 0) {
            count++;
        }
    }

    if(count == 2) {
        printf("%d is a Prime Number\n", n);
    } else {
        printf("%d is Not a Prime Number\n", n);
    }

    return 0;
}
