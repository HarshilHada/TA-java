#include <stdio.h>

void main() {
    int n, temp, rev = 0, rem;
    printf("Enter a Number to check if it is Palindrome or Not\n");
    scanf("%d", &n);
    temp = n;

    while(temp > 0) {
        rem = temp % 10;
        rev = rev * 10 + rem;
        temp /= 10;
    }

    if(rev == n) {
        printf("%d is a Palindrome Number\n", n);
    } else {
        printf("%d is Not a Palindrome Number\n", n);
    }

    
}
