#include <iostream>
#include <vector>

int main()
{
    std::vector<int> s;
    int n, m, d, k = 0;

    std::cin >> n;
    for (int i = 0; i < n; i++)
    {
        int a;
        std::cin >> a;
        s.push_back(a);
    }

    std::cin >> d >> m;

    for (int i = 0; i < s.size() - m + 1; i++)
    {
        int sum = 0;
        for (int j = 0; j < m; j++)
        {
            sum += s[i + j];
        }
        if (sum == d)
        {
            k++;
        }
    }

    std::cout << k;
    
}