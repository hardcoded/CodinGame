#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{

    // game loop
    while (1) {
        int highestMountain = 0;
        int highestMountainIndex = 0;

        for (int i = 0; i < 8; i++) {
            int mountainH; // represents the height of one mountain.
            scanf("%d", &mountainH);
            if (mountainH > highestMountain) {
                highestMountainIndex = i;
                highestMountain = mountainH;
            }
        }

        printf("%d\n", highestMountainIndex); // The index of the mountain to fire on.
    }

    return 0;
}
