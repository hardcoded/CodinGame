#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int lightX; // the X position of the light of power
    int lightY; // the Y position of the light of power
    int initialTX; // Thor's starting X position
    int initialTY; // Thor's starting Y position
    cin >> lightX >> lightY >> initialTX >> initialTY; cin.ignore();

    // game loop
    while (1) {
        int remainingTurns; // The remaining amount of turns Thor can move. Do not remove this line.
        cin >> remainingTurns; cin.ignore();

        string directionX = "";
        string directionY = "";
	    if (initialTY > lightY) {
	        directionY = "N";
	       	initialTY --;
	    }
	    else if (initialTY < lightY) {
	       	directionY = "S";
	       	initialTY ++;
	    }
	    if (initialTX > lightX) {
		    directionX = "W";
		    initialTX --;
	    }
	    else if (initialTX < lightX) {
	     	directionX = "E";
		    initialTX ++;
	    }
	    string direction = directionY + directionX;
	    cout << direction << endl;
    }
}
