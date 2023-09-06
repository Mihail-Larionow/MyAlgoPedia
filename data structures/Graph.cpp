#include <iostream>
#include <vector>
#include <queue>

const int INF = 1e9;

void dfs(std::vector<std::vector<int>> &graph, int v, std::vector<bool> &visited)
{
    visited[v] = true;
    std::cout << v << " ";
    for (int to : graph[v])
    {
        if (!visited[to])
            dfs(graph, to, visited);
    }
}

std::vector<int> bfs(std::vector<std::vector<int>> &graph, int start)
{
    std::vector<int> dist(graph.size(), INF);
    std::queue<int> q;
    dist[start] = 0;
    q.push(start);

    while (!q.empty())
    {
        int v = q.front();
        q.pop();

        for (int to : graph[v])
        {
            if (dist[to] > dist[v] + 1)
            {
                dist[to] = dist[v] + 1;
                q.push(to);
            }
        }
    }
    return dist;
}

int main()
{
    int n, m, x;

    std::cin >> n >> m >> x;

    std::vector<std::vector<int>> graph(n);
    std::vector<bool> visited(n, false);

    for (int i = 0; i < m; i++)
    {
        int a, b;
        std::cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }

    std::vector<int> dist = bfs(graph, x);
    for (int d : dist)
    {
        if (d != INF)
            std::cout << d << " ";
        else
            std::cout << "ERR";
    }

    dfs(graph, x, visited);
}