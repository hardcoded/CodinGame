#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {

    // game loop
    while (1) {
            int highestMountainIndex = 0;
            int highestMountain = 0;
        for (int i = 0; i < 8; i++) {
            int mountainH; // represents the height of one mountain.
            cin >> mountainH; cin.ignore();
            if (mountainH > highestMountain) {
                highestMountainIndex = i;
                highestMountain = mountainH;
            }
        }

        cout << highestMountainIndex << endl; // The index of the mountain to fire on.
    }
}
