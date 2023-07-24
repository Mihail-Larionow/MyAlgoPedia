#include <iostream>

class SinglyLinkedList
{

public:
    void add(int key, int value)
    {
        head = addNode(head, key, value);
    }

    void erase(int key)
    {
        head = deleteNode(head, key);
    }

    void print()
    {
        printList(head);
    }

    int search(int value)
    {
        searchNode(head, value);
    }

    int get(int index)
    {
        getNode(head, index);
    }

private:
    struct Node
    {
        int key;
        int value;
        Node *next = NULL;
    };

    Node *head = NULL;

    struct Node *addNode(Node *node, int key, int value)
    {
        if (node == NULL)
        {
            node = new Node;
            node->key = key;
            node->value = value;
            node->next = NULL;
        }
        else
        {
            node->next = addNode(node->next, key, value);
        }
        return node;
    }

    struct Node *deleteNode(Node *node, int key)
    {
        if (node == NULL)
        {
            return node;
        }
        else if (node->key == key)
        {
            node->key = node->next->key;
            node->value = node->next->value;
            node->next = node->next->next;
        }
        else if (node->next->key == key)
        {
            node->next = node->next->next;
        }
        else
        {
            node->next = deleteNode(node->next, key);
        }
        return node;
    }

    void printList(Node *node)
    {
        if (node != NULL)
        {
            printf("%i ", node->value);
            printList(node->next);
        }
    }

    int searchNode(Node *node, int value)
    {
        if (node == NULL)
        {
            return -1;
        }
        else if (value == node->value)
        {
            return node->key;
        }
        else
        {
            return searchNode(node->next, value);
        }
    }

    int getNode(Node *node, int index)
    {
        if (node == NULL)
        {
            return -1;
        }
        else if (index == node->key)
        {
            return node->value;
        }
        else
        {
            return getNode(node->next, index);
        }
    }
};

int main()
{
    int arr[10]{5, 6, 7, 3, 2, 1, 9, 8, 10, 4};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    SinglyLinkedList *list = new SinglyLinkedList;

    for (int i = 0; i < size_t; i++)
    {
        list->add(i, arr[i]);
    }

    list->print();

    int value = 5;
    int index = list->search(value);

    printf("\nVlaue: %i, Key: %i\n", list->get(index), index);

    list->erase(index);

    list->print();
}