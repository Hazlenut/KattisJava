#include<iostream>
#include<string>
using namespace std;
int main()
{
    int q;
    cin >> q;
    for(int i = 0; i < q; i++) {
        string n;
        cin >> n;
        int total = 0;
        bool sec = false;
        int a;
        for(int i = n.length()-1; i >= 0; i--) {

            a=(n[i]-48);
            if(sec) {
                a = 2*a;
            }
            if(a > 9) {
                a = (a%10) + (a/10);
            }
            total+=a;
            sec = !sec;
        }
        if(total%10==0) {
            cout << "PASS"<<endl;
        }else{
            cout << "FAIL"<<endl;
        }
    }
}
