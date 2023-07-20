#include <iostream>

struct Node
{
    int key;
    int value;
    struct Node *left = NULL;
    struct Node *right = NULL;
};

void printTree(Node *node)
{
    if (node != NULL)
    {
        printf("%i ", node->key);
        printTree(node->left);
        printTree(node->right);
    }
}

struct Node *addNode(Node *node, int key, int value)
{
    if (node == NULL)
    {
        node = new Node;
        node->key = key;
        node->value = value;
    }
    else if (key < node->key)
    {
        node->left = addNode(node->left, key, value);
    }
    else
    {
        node->right = addNode(node->right, key, value);
    }
    return node;
}

int height(Node *node)
{
    if (node == NULL)
    {
        return 0;
    }
    return std::max(height(node->left), height(node->right)) + 1;
}

int main()
{
    int arr[10]{5, 6, 7, 3, 2, 1, 9, 8, 10, 4};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    Node *root = new Node;
    root->key = arr[0];

    for (int i = 1; i < size_t; i++)
    {
        addNode(root, arr[i], 5 * i);
    }

    printTree(root);
    printf("\nTree height: %i", height(root));
}