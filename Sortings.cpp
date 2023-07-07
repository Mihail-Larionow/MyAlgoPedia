#include <iostream>

//Only for learning
void bubbleSort(int arr[], int size_t)
{
    while (size_t != 0)
    {
        int max_index = 0;
        for (int i = 1; i < size_t; i++)
        {
            if (arr[i - 1] > arr[i]){
                std::swap(arr[i - 1], arr[i]);
                max_index = i;
            }
        }
        size_t = max_index;
    }
}

//Fewer permutations
void selectionSort(int arr[], int size_t){
    for(int i = 0; i < size_t -1; i++){
        int min_index = i;
        for(int j=i+1; j<size_t; j++){
            if(arr[min_index] > arr[j]) min_index = j;
        }
        if(min_index != i){
            std::swap(arr[i], arr[min_index]);
        }
    }
}

//Fewer comparisons
void insertionSort(int arr[], int size_t){
    for(int i = 1; i < size_t; i++){
        int sorted = i - 1;
        while (sorted > -1 && arr[sorted] > arr[sorted + 1])
        {
            std::swap(arr[sorted], arr[sorted + 1]);
            sorted--;
        }
    
    }
}



int main()
{
    int arr[5]{3, 2, 1, 5, 4};

    insertionSort(arr, sizeof(arr) / sizeof(arr[0]));

    for (auto &&i : arr)
    {
        printf("%i ", i);
    }
}