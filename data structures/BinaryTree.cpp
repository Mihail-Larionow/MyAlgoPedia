#include <iostream>

class BinaryTree
{
public:
    void add(int key, int value)
    {
        root = addNode(root, key, value);
    }

    void erase(int key)
    {
    }

    void print()
    {
        printTree(root);
    }

    int get(int key)
    {
        return getNode(root, key);
    }

    int min()
    {
        return getMin(root);
    }

    int max()
    {
        return getMax(root);
    }

    int height()
    {
        return getHeight(root);
    }

private:
    struct Node
    {
        int key;
        int value;
        struct Node *left = NULL;
        struct Node *right = NULL;
    };

    Node *root = NULL;

    void printTree(Node *node)
    {
        if (node != NULL)
        {
            printTree(node->left);
            printf("%i ", node->key);
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
            node->left = NULL;
            node->right = NULL;
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

    int getNode(Node *node, int key)
    {
        if (node == NULL)
        {
            return -1;
        }
        else if (key == node->key)
        {
            return node->value;
        }
        else if (key < node->key)
        {
            return getNode(node->left, key);
        }
        else if (key > node->key)
        {
            return getNode(node->right, key);
        }
    }

    int getHeight(Node *node)
    {
        if (node == NULL)
        {
            return 0;
        }
        return std::max(getHeight(node->left), getHeight(node->right)) + 1;
    }

    int getMin(Node *node)
    {
        if (node == NULL)
        {
            return -1;
        }
        else if (node->left == NULL)
        {
            return node->value;
        }
        else
        {
            return getMin(node->left);
        }
    }

    int getMax(Node *node)
    {
        if (node == NULL)
        {
            return -1;
        }
        else if (node->right == NULL)
        {
            return node->value;
        }
        else
        {
            return getMax(node->right);
        }
    }
};

int main()
{
    int arr[10]{5, 6, 7, 3, 2, 1, 9, 8, 10, 4};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    BinaryTree *tree = new BinaryTree;

    for (int i = 0; i < size_t; i++)
    {
        tree->add(arr[i], i);
    }

    tree->print();
    printf("\nTree height: %i", tree->height());
    printf("\nIndex of minimum: %i", tree->min());
    printf("\nIndex of maximum: %i", tree->max());
    printf("\nValue %i, Key: %i", tree->get(6), 6);
}