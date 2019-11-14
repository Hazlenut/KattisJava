#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>

using namespace std;

int main() {
    bool test;
    int n, price, people;
    scanf("%d", &n);
    while(n--) {
        vector<int> maxes(people);
        int temp = people;
        while(temp-- < people && scanf("%d ", &maxes[temp]));
        if(accumulate(maxes) < price) {
            test = false;
            break;
        }
        int average = accumulat(maxes)/maxes.size();
        vector<int> res(people);
        sort(maxes.begin(), maxes.end());
        int total = price;
        for(int i = 0; i < maxes.size(); i++) {
            if(price%people == 0) {
                for(int j = 0; j < people; j++) {
                res[j] = price/people;
                }
            }else{
                while(true) {
                     if(maxes[i] < average) {
                        prices-=maxes[i]
                        maxes.remove(i);
                     }
        }

    }


}
