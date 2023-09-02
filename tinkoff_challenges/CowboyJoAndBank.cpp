#include <iostream>
#include <vector>
#include <stack>

bool robbery(std::vector<int> &banknotes, std::stack<int> &queue, int k, int s, int m)
{
    if (s > m)
    {
        return false;
    }
    else if (s == m)
    {
        return true;
    }
    for (int i = k; i < banknotes.size(); i++)
    {
        int x = banknotes[i];
        if (robbery(banknotes, queue, i + 1, s + x, m))
        {
            queue.push(x);
            return true;
        }
    }
    return false;
}

int main()
{
    int n, m;
    std::stack<int> queue;
    std::vector<int> banknotes;

    std::cin >> m >> n;

    for (int i = 0; i < n; i++)
    {
        int x;
        std::cin >> x;
        banknotes.push_back(x);
        banknotes.push_back(x);
    }

    robbery(banknotes, queue, 0, 0, m);

    if (queue.size() > 0)
        std::cout << queue.size() << "\n";
    else
        std::cout << -1;

    while (!queue.empty())
    {
        std::cout << queue.top() << " ";
        queue.pop();
    }

    return 0;
}