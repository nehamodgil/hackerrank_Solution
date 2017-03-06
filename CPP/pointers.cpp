#include <stdio.h>
#include<cstdlib>


void update(int *a,int *b) {
    int *temp;
    *temp = *a;

    *a += *b;
    *b = std::abs(*b - *temp);
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
