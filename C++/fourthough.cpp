#include <iostream>

using namespace std;

int main() {
    int n;
    scanf("%d", &n);
    for(int i = 0; i < n; i++) {
        int res;
        scanf("%d", &res);
        int arr[] = {0,0,0};
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 4; k++) {
                        arr[0] = i;
                        arr[1] = j;
                        arr[2] = k;
                        for(int t = 0; t < arr.size(); t++) {
                            for(int x = t; x < arr.size(); x++) {
                                if(arr[t] > arr[x]) {
                                    int temp = arr[t];
                                    arr[t] = arr[x];
                                    arr[x] = temp;

                            }
                        }
                        for(int u = 0; u < arr.size(); u++) {
                            cout << arr[u] << "\n";
                        }

                    }
                    int sum = 4;
                    for(int u = 0; u < arr.size(); u++) {
                        if(arr[u] == 0) {
                            sum*=4;
                        }else if(arr[u] ==1) {
                            sum/=4;
                        }else if(arr[u] ==2) {
                            sum+=4;
                        }else{
                            sum-=4;
                        }
                    }
                    if(sum==res) {

                    }
                }
            }
        }



    }

}
