#include<iostream>
#include<algorithm>
#include <vector>
#include<string>
using namespace std;

int main()
{
    int b,d,c,l;
    int count = 0;
    cin >> b >> d>> c>> l;
    int bl, dl, cl;
    bl = l/b;
    dl = l/d;
    cl = l/c;
    for(int i = 0; i <= bl; i++) {
        for(int j = 0; j <= dl; j++) {
            for(int k = 0; k <= cl; k++) {
                if(b*i + d*j + k*c == l ) {
                    count++;
                    cout << i << " " << j << " " << k << " " << "\n";
                }
            }
        }
    }
    if(count == 0) {
        cout << "impossible"<<endl;
    }
    }

