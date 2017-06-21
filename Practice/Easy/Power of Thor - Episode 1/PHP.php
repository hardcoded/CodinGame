<?php

fscanf(STDIN, "%d %d %d %d",
    $lightX, // the X position of the light of power
    $lightY, // the Y position of the light of power
    $initialTX, // Thor's starting X position
    $initialTY // Thor's starting Y position
);

// game loop
while (TRUE)
{
    fscanf(STDIN, "%d",
        $remainingTurns // The remaining amount of turns Thor can move. Do not remove this line.
    );

    $directionX = "";
    $directionY = "";
	if ($initialTY > $lightY) {
	   	$directionY = "N";
	   	$initialTY -= 1;
	}
	elseif ($initialTY < $lightY) {
	   	$directionY = "S";
	   	$initialTY += 1;
	}
	if ($initialTX > $lightX) {
	    $directionX = "W";
	    $initialTX -= 1;
	}
	elseif ($initialTX < $lightX) {
	   	$directionX = "E";
	    $initialTX += 1;
	}
	$direction = $directionY . $directionX;
	echo($direction . "\n");
}
?>
