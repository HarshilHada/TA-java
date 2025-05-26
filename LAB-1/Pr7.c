#include <stdio.h>

void main() {
    int n, temp, rem, sum = 0;
    printf("Enter a Number to check if it is Armstrong or Not\n");
    scanf("%d", &n);
    temp = n;

    while(temp > 0) {
        rem = temp % 10;
        sum += rem * rem * rem;
        temp /= 10;
    }

    if(sum == n) {
        printf("%d is Armstrong Number\n", n);
    } else {
        printf("%d is Not Armstrong Number\n", n);
    }

    return 0;
}
