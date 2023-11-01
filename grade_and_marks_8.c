#include <stdio.h>

int main() {
    int mark;

    printf("Enter the mark: ");
    scanf("%d", &mark);

    if (mark >= 90) {
        printf("Grade: A+\n");
    } else if (mark >= 80) {
        printf("Grade: A\n");
    } else if (mark >= 70) {
        printf("Grade: B\n");
    } else if (mark >= 60) {
        printf("Grade: C\n");
    } else if (mark >= 50) {
        printf("Grade: D\n");
    } else {
        printf("Grade: F (Fail)\n");
    }

    return 0;
}
