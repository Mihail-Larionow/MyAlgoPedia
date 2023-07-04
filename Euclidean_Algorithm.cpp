#include <iostream>

int EuclideanAlgorithm(int a, int b)
{
    if (a == 0)
        return b;
    return EuclideanAlgorithm(b % a, a);
}

int main()
{
    std::cout << EuclideanAlgorithm(15, 21);
}