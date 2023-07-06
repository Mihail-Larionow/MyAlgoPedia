#include <iostream>
#include <vector>

bool isPrime(int n)
{
    if (n < 2)
        return 0;
    if (n == 2)
        return 1;
    if (n % 2 == 0)
        return 0;
    for (int i = 3; (i * i) <= n; i += 2)
    {
        if (n % i == 0)
            return 0;
    }
    return 1;
}

void countPrimes(int n)
{
    int sum = 0;
    std::vector<bool> primes(n, true);
    for (int i = 2; i < n; i++)
    {
        if (primes[i])
        {
            printf("%i ", i);
            for (int j = i * 2; j < n; j += i)
            {
                primes[j] = false;
            }
        }
    }
}

int main()
{
    int n = 21;
    printf("%i\n", isPrime(n));
    countPrimes(n); // O(n*log(n))
}