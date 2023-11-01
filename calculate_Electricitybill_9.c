#include <stdio.h>

int main() {
    int unitsConsumed;
    double totalBill = 0.0;

    // Input the units consumed
    printf("Enter units consumed: ");
    scanf("%d", &unitsConsumed);

    // Calculate the bill based on different slabs

    if (unitsConsumed <= 50) {
        // For the first 50 units
        totalBill = unitsConsumed * 2.60;
    } else if (unitsConsumed <= 100) {
        // For the next 50 units
        totalBill = 50 * 2.60 + (unitsConsumed - 50) * 3.25;
    } else if (unitsConsumed <= 200) {
        // For the next 100 units
        totalBill = 50 * 2.60 + 50 * 3.25 + (unitsConsumed - 100) * 5.00;
    } else {
        // For units above 200
        totalBill = 50 * 2.60 + 50 * 3.25 + 100 * 5.00 + (unitsConsumed - 200) * 6.50;
    }

    // Add additional charges
    totalBill += 0.10 * totalBill; // 10% additional charges

    // Display the total bill
    printf("Total Bill: Rs. %.2lf\n", totalBill);

    return 0;
}
