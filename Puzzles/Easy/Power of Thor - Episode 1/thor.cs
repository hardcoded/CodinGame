using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

class Player {
    static void Main(string[] args) {
        string[] inputs = Console.ReadLine().Split(' ');
        int lightX = int.Parse(inputs[0]); // the X position of the light of power
        int lightY = int.Parse(inputs[1]); // the Y position of the light of power
        int initialTX = int.Parse(inputs[2]); // Thor's starting X position
        int initialTY = int.Parse(inputs[3]); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = int.Parse(Console.ReadLine()); // The remaining amount of turns Thor can move. Do not remove this line.

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
	        Console.WriteLine(direction);
        }
    }
}
