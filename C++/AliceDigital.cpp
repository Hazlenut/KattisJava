#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <iostream>
#include <sstream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for(int l = 0; l < n; l++) {
        int dig, m;
        cin >> dig >> m;
        vector<int> array1(dig);
        for(int i = 0; i < n; i++) {
            cin >> array1[i];
        }
        for(int i = 0; i < dig; i++) {
            cout << array1.at(i);
        }
        bool change = false;
        int high = 0;
        int total = 0;
        for(int i = 0; i < dig; i++) {
            if(change && array1.at(i) == m) {
                if(total > high) {
                    high = total;
                }
                total = 0;
                continue;
            }
            total += array1[i];
            if(array1.at(i) == m) {
                change = true;
            }
            if(array1.at(i) == array1[dig-1]) {
                if(total > high) {
                    high = total;
                }
            }
        }
        cout << high;
    }

}

