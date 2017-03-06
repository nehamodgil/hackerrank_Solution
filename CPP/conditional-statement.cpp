#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int n;

    const char * a[] = {"","one","two","three","four","five","six","seven","eight","nine"};

    cin >> n;

    if(1<=n && n<=9) {
        printf("%s", a[n]);
    }
    else {
        printf("Greater than 9");
    }

    return 0;
}
