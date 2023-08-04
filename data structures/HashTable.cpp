#include <iostream>

class HashTable
{
public:
    HashTable(int tableSize = 5000)
    {
        this->tableSize = tableSize;
    }

    void add(std::string key, std::string value)
    {
        int index = getHash(key);
        items[index] = value;
        tableCount++;
    }

    std::string get(std::string key)
    {
        int index = getHash(key);
        return items[index];
    }

    int count()
    {
        return tableCount;
    }

    void destroy()
    {
        delete[] items;
    }

private:
    int tableSize;
    int tableCount = 0;

    std::string *items = new std::string[tableSize];

    int getHash(std::string key)
    {
        int hash = 0;

        for (int i = 0; i < key.size(); i++)
        {
            hash += key[i];
        }

        return hash % tableSize;
    }
};

int main()
{
    HashTable *table = new HashTable(500);

    table->add("firstname", "Mihail");
    table->add("lastname", "Larionov");

    std::cout << "My FirstName is " << table->get("firstname") << "\n";
    std::cout << "My LastName is " << table->get("lastname") << "\n";

    std::cout << "This table counts " << table->count() << " elements\n";

    table->destroy();
}
