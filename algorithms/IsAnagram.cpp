#include <iostream>
#include <algorithm>

bool isAnagram(std::string s1, std::string s2)
{
    std::sort(s1.begin(), s1.end());
    std::sort(s2.begin(), s2.end());
    if(s1 == s2) return true;
    else return false;
}

int main()
{
    std::string s1 = "anagram";
    std::string s2 = "mangara";
    std::cout << isAnagram(s1, s2);
}