#include <stdio.h>

void main() {
    int n;
    printf("Enter the number of elements in the array:\n");
    scanf("%d", &n);
    int arr[n];
    int sum = 0;
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }
    printf("The elements of the array are:\n");
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
    }
    printf("\nSum of the elements of the array is: %d\n", sum);
    printf("Average of the elements of the array is: %d\n", sum / n);
   
}