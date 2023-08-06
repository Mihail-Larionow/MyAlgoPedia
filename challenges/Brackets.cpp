#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main()
{
    stack<char> steck;
    stack<int> steck_n;
    int n = -1;

    string s = "([](){([])})";

    for (int i = 0; i < s.length(); i++)
    {
        if (!(s[i] == '(' || s[i] == '[' || s[i] == '{' || s[i] == ')' || s[i] == ']' || s[i] == '}'))
            continue;
        if (s[i] == '(' || s[i] == '[' || s[i] == '{')
        {
            steck_n.push(i);
            steck.push(s[i]);
        }
        else if (steck.empty())
        {
            steck.push(s[i]);
            n = i;
            break;
        }
        else
        {
            if (s[i] == ')' && steck.top() == '(')
            {
                steck_n.pop();
                steck.pop();
            }
            else if (s[i] == ']' && steck.top() == '[')
            {
                steck_n.pop();
                steck.pop();
            }
            else if (s[i] == '}' && steck.top() == '{')
            {
                steck_n.pop();
                steck.pop();
            }
            else
            {
                n = i;
                break;
            }
        }
    }
    if (steck.empty())
        cout << "Success";
    else if (n != -1)
        cout << n + 1;
    else
        cout << steck_n.top() + 1;
    return 0;
}
