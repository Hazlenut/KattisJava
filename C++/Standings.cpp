#include <iostream>
#include <vector>
#include <sstream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main()
{
    int q;
    scanf("%d", &q);
    char name[20];
    for(int i = 0; i < q; i++) {
        int n,g;
        scanf("%d",&n);
        vector<int> res;
        for(int c = 0; c < n; c++) {
            scanf("%s %d", &name, &g);
            res.push_back(g);
        }
          sort(res.begin(), res.end());
            int total = 0;
            for(int t = 0; t < res.size(); t++) {
                total += (abs(res[t] - (t+1)));
            }
            cout << total << "\n";
        }
}

