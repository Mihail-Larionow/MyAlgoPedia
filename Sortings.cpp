#include <iostream>

// Only for learning
void bubbleSort(int arr[], int size_t)
{
    while (size_t != 0)
    {
        int max_index = 0;
        for (int i = 1; i < size_t; i++)
        {
            if (arr[i - 1] > arr[i])
            {
                std::swap(arr[i - 1], arr[i]);
                max_index = i;
            }
        }
        size_t = max_index;
    }
}

// Fewer permutations
void selectionSort(int arr[], int size_t)
{
    for (int i = 0; i < size_t - 1; i++)
    {
        int min_index = i;
        for (int j = i + 1; j < size_t; j++)
        {
            if (arr[min_index] > arr[j])
                min_index = j;
        }
        if (min_index != i)
        {
            std::swap(arr[i], arr[min_index]);
        }
    }
}

// Fewer comparisons
void insertionSort(int arr[], int size_t)
{
    for (int i = 1; i < size_t; i++)
    {
        int sorted = i - 1;
        while (sorted > -1 && arr[sorted] > arr[sorted + 1])
        {
            std::swap(arr[sorted], arr[sorted + 1]);
            sorted--;
        }
    }
}

// Average: O(n*log(n)), Worst: O(n*n)
void quickSort(int arr[], int start, int end)
{
    if (start >= end)
        return;
    int middle = arr[(start + end) / 2];
    int left = start;
    int right = end;
    while (left <= right)
    {
        while (arr[left] < middle)
            left++;
        while (arr[right] > middle)
            right--;
        if (left <= right)
        {
            std::swap(arr[left], arr[right]);
            left++;
            right--;
        }
    }
    quickSort(arr, start, right);
    quickSort(arr, left, end);
}

void merge(int arr[], int start, int middle, int end)
{
    int leftSize = middle - start + 1;
    int rightSize = end - middle;

    int *leftArray = new int[leftSize];
    int *rightArray = new int[rightSize];

    for (int i = 0; i < leftSize; i++)
        leftArray[i] = arr[start + i];
    for (int i = 0; i < rightSize; i++)
        rightArray[i] = arr[middle + 1 + i];

    int leftIndex = 0;
    int rightIndex = 0;
    int mergeIndex = start;

    while (leftIndex < leftSize && rightIndex < rightSize)
    {
        if (leftArray[leftIndex] <= rightArray[rightIndex])
        {
            arr[mergeIndex] = leftArray[leftIndex];
            leftIndex++;
        }
        else
        {
            arr[mergeIndex] = rightArray[rightIndex];
            rightIndex++;
        }
        mergeIndex++;
    }

    while (leftIndex < leftSize)
    {
        arr[mergeIndex] = leftArray[leftIndex];
        leftIndex++;
        mergeIndex++;
    }

    while (rightIndex < rightSize)
    {
        arr[mergeIndex] = rightArray[rightIndex];
        rightIndex++;
        mergeIndex++;
    }

    delete leftArray;
    delete rightArray;
}

// Average: O(n*log(n)), Worst: O(n*log(n))
void mergeSort(int arr[], int start, int end)
{
    if (start >= end)
        return;

    int middle = start + (end - start) / 2;
    mergeSort(arr, start, middle);
    mergeSort(arr, middle + 1, end);

    merge(arr, start, middle, end);
}

int heapify(int arr[], int i, int size_t)
{
    int left = i * 2 + 1;
    int right = i * 2 + 2;
    int largest = i;

    if (left < size_t && arr[left] > arr[largest])
        largest = left;
    if (right < size_t && arr[right] > arr[largest])
        largest = right;
        
    if (i != largest)
    {
        std::swap(arr[i], arr[largest]);
        heapify(arr, largest, size_t);
    }
}

// Average: O(n*log(n)), Worst: O(n*log(n))
void heapSort(int arr[], int size_t)
{
    for (int i = size_t / 2 - 1; i >= 0; i--)
    {
        heapify(arr, i, size_t);
    }
    for (int i = size_t - 1; i >= 0; i--)
    {
        std::swap(arr[i], arr[0]);
        heapify(arr, 0, i);
    }
}

int main()
{
    int arr[10]{9, 6, 7, 3, 2, 1, 5, 8, 10, 4};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    mergeSort(arr, 0, size_t);

    for (auto &&i : arr)
    {
        printf("%i ", i);
    }
}