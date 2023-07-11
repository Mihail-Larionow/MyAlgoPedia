#include <iostream>

int binarySearch(int arr[], int size_t, int value)
{
    int left = 0;
    int right = size_t - 1;
    while (left <= right)
    {
        int middle = (left + right) / 2;
        if (value == arr[middle])
            return middle;
        else if (value > arr[middle])
            left = middle + 1;
        else
            right = middle - 1;
    }
    return -1;
}

int main()
{
    int arr[5]{3, 2, 1, 5, 4};
    int size_t = sizeof(arr) / sizeof(arr[0]);

    std::cout << binarySearch(arr, size_t, 5); // O(log(2n))
}