#include <iostream>
#include <vector>

void check(std::vector<int> &cards, std::vector<int> &combination, int &l, int &r)
{
    l = -1;
    r = -1;

    for (int i = 0; i < cards.size(); i++)
    {
        if (cards[i] != combination[i])
        {
            if (l == -1)
                l = i;
            r = i;
        }
    }
}

void sort(std::vector<int> &cards, int l, int r)
{
    for (int i = l + 1; i < r + 1; i++)
    {
        int sorted = i - 1;
        while (sorted > l - 1 && cards[sorted] > cards[sorted + 1])
        {
            std::swap(cards[sorted], cards[sorted + 1]);
            sorted--;
        }
    }
}

int main()
{

    int n, l, r;
    std::vector<int> cards, combination;

    std::cin >> n;
    for (int i = 0; i < n; i++)
    {
        int x;
        std::cin >> x;
        cards.push_back(x);
    }

    for (int i = 0; i < n; i++)
    {
        int x;
        std::cin >> x;
        combination.push_back(x);
    }

    check(cards, combination, l, r);

    if (l != -1)
        sort(cards, l, r);

    check(cards, combination, l, r);

    if (l != -1)
        std::cout << "NO";
    else
        std::cout << "YES";

    return 0;
}