#include <iostream>

class HashTable
{
public:
    void add(std::string key, std::string value)
    {
        int index = getHash(key);
        items[index] = value;
    }

    std::string get(std::string key){
        int index = getHash(key);
        return items[index];
    }

    void destroy(){
        delete [] items;
    }

private:
    int size = 5000;
    int count;

    std::string *items = new std::string[size];

    int getHash(std::string key)
    {
        int hash = 0;

        for(int i=0; i<key.size(); i++){
            hash += key[i];
        }

        return hash % size;
    }
};

int main()
{
    HashTable *table = new HashTable;

    table->add("firstname", "Mihail");
    table->add("lastname", "Larionov");

    std::cout << "My FirstName is " << table->get("firstname") << "\n";
    std::cout << "My LastName is " << table->get("lastname") << "\n";

    table->destroy();
}
