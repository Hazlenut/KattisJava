#include <iostream>
#include <string>

using namespace std;

int main() {
    string s;
    scanf("%s", &s);
    int a,b;
    bool player;
    bool winner;
    for(int i = 0; i < s.length(); i++) {
        if(s[i] == 'A') {
            player = true;
        }else{
            player = false;
        }
        i++;
        if(player) {
            a+= (int) s[i];
            player = false;
        }else{
            b+= (int) s[i];
            player = true;
        }

        if(a>=11 && a-b >=2) {
            winner = true;
            break;
        }
        if(b>=11 && b-a >=2) {
            winner = false;
            break;

        }
        if(a==10&& a==b) {
            if(player) {
            a+= (int) s[i];
            player = false;
                }else{
            b+= (int) s[i];
            player = true;
            }
            if(abs(a-b) ==2) {
                if(a>b) {
                    winner = true;
                    break;
                }else{
                    winner = false;
                    break;
                }
            }
        }
    }
    if(winner) {
        cout << "A";
    }else{
        cout << "B";
    }


}
