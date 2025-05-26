#include <stdio.h>

void main() {
    int n;
    printf("Enter the number of elements in the array:\n");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("The elements of the array are:\n");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
    }
    printf("\n");
    printf("The elements of the array in reverse order are:\n");
    for (int i = n - 1; i >= 0; i--) {
        printf("%d", arr[i]);
    }
    printf("\n");
}