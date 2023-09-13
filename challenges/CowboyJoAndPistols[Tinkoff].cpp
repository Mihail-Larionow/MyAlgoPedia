#include <iostream>

int main()
{
    int n, m, k = 0;
    std::cin >> n >> m;

    for (int i = 0; i < n; i++)
    {
        int x;
        std::cin >> x;
        if (x > k && x <= m)
            k = x;
    }

    std::cout << k;

    return 0;
}