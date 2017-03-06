#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a, b, n, i;
    const char * arr[] = {"","one","two","three","four","five","six","seven","eight","nine"};

    cin>>a;
    cin>>b;

    for(i=a; i<=b; i++){
        if(1<=i && i<=9) {
            printf("%s\n", arr[i]);
        }
        else if(i>9 && i%2==0){
            printf("even\n");
        }
        else{
            printf("odd\n");
        }
    }
    return 0;
}
