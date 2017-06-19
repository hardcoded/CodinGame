var inputs = readline().split(' ');
var lightX = parseInt(inputs[0]); // the X position of the light of power
var lightY = parseInt(inputs[1]); // the Y position of the light of power
var initialTX = parseInt(inputs[2]); // Thor's starting X position
var initialTY = parseInt(inputs[3]); // Thor's starting Y position

// game loop
while (true) {
    var remainingTurns = parseInt(readline()); // The remaining amount of turns Thor can move. Do not remove this line.

    var directionX = "";
    var directionY = "";
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
	var direction = directionY + directionX;
	print(direction);
}
