#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for(int l = 0; l < n; l++) {
        int dig, min;
        cin >> dig >> min;
        int array[] = new int[dig];
        for(int i = 0; i < dig; i++) {
            cin >> array[i];
        }
        bool change = false;
        int high = 0;
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            if(change && array[i] == min) {
                if(total > high) {
                    high = total;
                }
                total = 0;
                continue;
            }
            total += array[i];
            if(array[i] == min) {
                change = true;
            }
            if(array[i] == array[array.length-1]) {
                if(total > high) {
                    high = total;
                }
            }
        }
        cout << high;
    }

}

