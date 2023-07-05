#include <iostream>

int euclideanAlgorithm(int a, int b)
{
    if (a == 0)
        return b;
    return euclideanAlgorithm(b % a, a);
}

void commonFactors(int a, int b) {
    int nod = euclideanAlgorithm(a, b);
    for(int i=1; i<=nod; i++){
        if(nod % i == 0) std::cout << i << " ";
    }
}

int main()
{
    std::cout << euclideanAlgorithm(15, 21) << "\n";
    commonFactors(15, 21);
}