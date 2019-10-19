#include <iostream>
#include <vector>
#include <set>
using namespace std;
bool checkWork(int x) {
    bool dig = false;
    bool divis = false;
    int total = x;
    vector<int> numbers;
   while(x>0)
{
   numbers.push_back(x%10);
   x/=10;
}
    set<int> aset(numbers.begin(), numbers.end());
    dig = (numbers.size() == aset.size());
    int num = 0;
    for(int i: aset) {
        if(i!=0) {
        if(total%i == 0) {
            num++;
        }
        }
    }
    divis = (aset.size() == num);
    if(divis && dig) {
        return true;
    }else{
        return false;
    }

}


int main()
{
    int a, b;
    cin >> a>> b;
    int total = 0;
    for(int i = a; i <= b; i++) {
        if(checkWork(i)) {
                total++;
            }
        }
    cout << total;
}
