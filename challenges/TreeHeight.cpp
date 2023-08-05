#include <iostream>

const int LIMITS = 100000;

struct Node
{
    bool notChecked = true;
    int value;
    int parent;
};

class HashTable
{
public:
    void add(int key, Node *node)
    {
        int index = getHash(key);
        nodes[index] = node;
    }

    struct Node *get(int key)
    {
        int index = getHash(key);
        return nodes[index];
    }

private:
    Node *nodes[LIMITS] = {NULL};

    int getHash(int key)
    {
        return key;
    }
};

HashTable *table = new HashTable;

void add(int parent, int value)
{
    Node *node = new Node;
    node->value = value;
    node->parent = parent;
    table->add(value, node);
}

int getHeight(int key)
{
    Node *node = table->get(key);
    node->notChecked = false;
    if (node->parent == -1)
    {
        return 1;
    }
    else
    {
        return getHeight(node->parent) + 1;
    }
}

int main()
{
    int arr[10]{9, 7, 5, 5, 2, 9, 9, 9, 2, -1};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    int max_height = 0;

    for (int i = 0; i < size_t; i++)
    {
        add(arr[i], i);
    }

    for (int i = 0; i < size_t; i++)
    {
        Node *node = table->get(i);
        if (node->notChecked)
        {
            int height = getHeight(i);
            if (max_height < height)
                max_height = height;
        }
    }

    std::cout << max_height;
}