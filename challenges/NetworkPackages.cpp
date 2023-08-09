#include <iostream>
#include <vector>
#include <queue>

struct Package
{
    int arrival;
    int duration;
};

int main()
{
    int size, number, time = 0, count = 0;
    std::queue<Package *> packages, queue;
    std::cin >> size >> number;

    for (int i = 0; i < number; i++)
    {
        int arrival, duration;
        std::cin >> arrival >> duration;
        Package *package = new Package;
        package->arrival = arrival;
        package->duration = duration;
        packages.push(package);
    }

    for (int i = 0; i < number; i++)
    {

        int res = -1;
        Package *package = packages.front();

        if (!queue.empty())
        {
            Package *element = queue.front();
            std::cout << time << " \n";
            if(element->duration != -1 && time < element->arrival)
                time = element->arrival;
            time += element->duration;
            queue.pop();
        }

        if (count < size)
        {
            queue.push(package);
            count++;
        }
        else
        {
            if (package->arrival >= time)
            {   
                queue.push(package);
            }
            else
            {
                package->duration = -1;
                queue.push(package);
            }
        }
        packages.pop();
    }

    while (!queue.empty())
    {
        Package *element = queue.front();
        std::cout << time << "\n";
        if(element->duration != -1 && time < element->arrival)
            time = element->arrival;
        time += element->duration;
        queue.pop();
    }

    return 0;
}