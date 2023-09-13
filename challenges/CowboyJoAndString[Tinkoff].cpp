#include <iostream>
#include <map>

bool check(std::map<char, int> &alphabet)
{
    if (alphabet['s'] < 1)
        return false;
    if (alphabet['h'] < 1)
        return false;
    if (alphabet['e'] < 1)
        return false;
    if (alphabet['r'] < 1)
        return false;
    if (alphabet['i'] < 1)
        return false;
    if (alphabet['f'] < 2)
        return false;
    return true;
}

void decrease(std::map<char, int> &alphabet)
{
    alphabet['s']--;
    alphabet['h']--;
    alphabet['e']--;
    alphabet['r']--;
    alphabet['i']--;
    alphabet['f']--;
    alphabet['f']--;
}

int main()
{
    std::map<char, int> alphabet;
    std::string s;
    int k = 0;

    std::cin >> s;

    for (int i = 0; i < s.length(); i++)
    {
        char c = s[i];

        if (alphabet.find(c) == alphabet.end())
            alphabet[c] = 1;
        else
            alphabet[c]++;
    }

    while (check(alphabet))
    {
        k++;
        decrease(alphabet);
    }

    std::cout << k;

    return 0;
}