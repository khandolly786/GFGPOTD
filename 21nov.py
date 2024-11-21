#include <iostream>
using namespace std;

bool isPrime(int n) {
    // Edge case: numbers less than 2 are not prime
    if (n <= 1) {
        return false;
    }
    
    // Check for factors from 2 to sqrt(n)
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false; // Found a factor, not prime
        }
    }
    
    return true; // No factors found, prime
}

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    if (isPrime(num)) {
        cout << num << " is a prime number." << endl;
    } else {
        cout << num << " is not a prime number." << endl;
    }

    return 0;
}
