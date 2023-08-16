#include <iostream>
#include <vector>

int euclid(int a, int b)
{
    if (a == 0)
        return b;
    return euclid(b % a, a);
}

int main()
{
    int n, m;
    std::vector<int> a, b;

    std::cin >> n >> m;

    for (int i = 0; i < n; i++)
    {
        int x;
        std::cin >> x;
        a.push_back(x);
    }

    for (int i = 0; i < m; i++)
    {
        int x;
        std::cin >> x;
        b.push_back(x);
    }

    int nod = euclid(b[0], b[1]);

    for (int i = 2; i < b.size(); i++)
    {
        nod = euclid(nod, b[i]);
    }

    int q = 0;
    int x = a[0];

    for (int i = 1; i < a.size(); i++)
    {
        x = (x * a[i]) / euclid(x, a[i]);
    }

    for (int i = x; i <= nod; i += x)
    {
        if (nod % i == 0)
            q++;
    }

    std::cout << q << "\n";
}
