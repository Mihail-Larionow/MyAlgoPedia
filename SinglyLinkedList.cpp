#include <iostream>

struct Node
{
    int key;
    int value;
    Node *next = NULL;
};

void printList(Node *node)
{
    if (node != NULL)
    {
        printf("%i ", node->value);
        printList(node->next);
    }
}

int search(Node *node, int key)
{
    if (key == node->key)
    {
        return node->value;
    }
    else
    {
        return search(node->next, key);
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
    else
    {
        node->next = addNode(node->next, key, value);
    }
    return node;
}

int main()
{
    int arr[10]{5, 6, 7, 3, 2, 1, 9, 8, 10, 4};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    Node *head = new Node;
    head->key = 0;
    head->value = arr[0];

    for (int i = 1; i < size_t; i++)
    {
        addNode(head, i, arr[i]);
    }
    
    printList(head);

    int index = 4;
    printf("\nKey: %i, Value: %i", index, search(head, index));
}