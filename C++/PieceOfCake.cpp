#include<iostream>

using namespace std;

int main() {
    int s, h, v;
    scanf("%d %d %d", &s, &h, &v);
    int hh,hv;
    if(s-h >= h) {
        hh=s-h;
    }else{
        hh=h;
    }
    if(s-v >= v) {
        hv=s-v;
    }else{
        hv=v;
    }
    cout << 4*hh*hv;

}
