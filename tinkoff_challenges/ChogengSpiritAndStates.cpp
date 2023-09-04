#include <algorithm>
#include <iostream>
#include <vector>
#include <queue>

const int INF = 1e9;

struct Edge
{
    int from;
    int to;
    int distance;
};

void sort(std::vector<Edge *> &edges)
{
    for (int i = 1; i < edges.size(); i++)
    {
        int sorted = i - 1;
        while (sorted > -1 && edges[sorted]->distance > edges[sorted + 1]->distance)
        {
            std::swap(edges[sorted], edges[sorted + 1]);
            sorted--;
        }
    }
}

bool bfs(std::vector<std::vector<int>> &graph, int start, int end)
{
    std::vector<bool> visited(graph.size(), false);
    std::queue<int> q;
    visited[start] = true;
    q.push(start);

    while (!q.empty())
    {
        int v = q.front();
        q.pop();

        for (int to : graph[v])
        {
            if (to == end)
                return true;
            if (!visited[to])
            {
                visited[to] = true;
                q.push(to);
            }
        }
    }
    return false;
}

int main()
{
    int n, m;

    std::cin >> n >> m;

    std::vector<Edge *> edges;
    std::vector<std::vector<int>> graph(n + 1);

    for (int i = 0; i < m; i++)
    {
        int a, b, d;
        std::cin >> a >> b >> d;
        graph[a].push_back(b);
        graph[b].push_back(a);

        Edge *edge = new Edge();
        edge->distance = d;
        edge->from = a;
        edge->to = b;

        edges.push_back(edge);
    }

    sort(edges);

    for (Edge *edge : edges)
    {
        graph[edge->from].erase(std::find(graph[edge->from].begin(), graph[edge->from].end(), edge->to));
        graph[edge->to].erase(std::find(graph[edge->to].begin(), graph[edge->to].end(), edge->from));

        if (!bfs(graph, edge->from, edge->to))
        {
            std::cout << edge->distance - 1;
            break;
        }
    }

    return 0;
}