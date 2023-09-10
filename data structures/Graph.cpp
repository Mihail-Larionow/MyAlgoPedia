#include <iostream>
#include <vector>
#include <queue>

const int INF = 1e9;

class Graph
{
public:
    Graph(int verticles)
    {
        this->verticles = verticles;
        graph = std::vector<std::vector<int>>(verticles);
        visited = std::vector<bool>(verticles, false);
    }

    void addEdge(int from, int to, int distance, bool oriented)
    {
        edges++;
        graph[from].push_back(to);
        if (!oriented)
            graph[to].push_back(from);
    }

    void dfs(int from)
    {
        dfs(graph, from, visited);
    }

    std::vector<int> bfs(int from)
    {
        return bfs(graph, from);
    }

private:
    int verticles;
    int edges = 0;
    std::vector<std::vector<int>> graph;
    std::vector<bool> visited;

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
};

int main()
{
    int n, m, x;

    std::cin >> n >> m >> x;

    Graph g(n);

    for (int i = 0; i < m; i++)
    {
        int a, b;
        std::cin >> a >> b;
        g.addEdge(a, b, 0, false);
    }

    std::vector<int> dist = g.bfs(x);
    for (int d : dist)
    {
        if (d != INF)
            std::cout << d << " ";
        else
            std::cout << "ERR";
    }

    std::cout << "\n";

    g.dfs(x);
}