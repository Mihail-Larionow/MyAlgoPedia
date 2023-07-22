#include <iostream>

void towerOfHanoi(int amount, char from, char to, char temp)
{
    if (amount == 0)
        return;

    // Moving all other disks to the third rod
    towerOfHanoi(amount - 1, from, temp, to);

    // Moving this disk to the second rod
    std::cout << "Moving disk from " << from << " to " << to << "\n";

    // Moving all other disks to the second rod
    towerOfHanoi(amount - 1, temp, to, from);
}

int main()
{
    towerOfHanoi(5, 'A', 'C', 'B');
}