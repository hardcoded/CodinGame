<?php
fscanf(STDIN, "%d %d %d %d %d %d %d %d",
    $nbFloors, // number of floors
    $width, // width of the area
    $nbRounds, // maximum number of rounds
    $exitFloor, // floor on which the exit is found
    $exitPos, // position of the exit on its floor
    $nbTotalClones, // number of generated clones
    $nbAdditionalElevators, // ignore (always zero)
    $nbElevators // number of elevators
);

$elevators = [];
for ($i = 0; $i < $nbElevators; $i++) {
    fscanf(STDIN, "%d %d",
        $elevatorFloor, // floor on which this elevator is found
        $elevatorPos // position of the elevator on its floor
    );
    $elevators[$elevatorFloor] = $elevatorPos;
}

// game loop
while (TRUE) {
    fscanf(STDIN, "%d %d %s",
        $cloneFloor, // floor of the leading clone
        $clonePos, // position of the leading clone on its floor
        $direction // direction of the leading clone: LEFT or RIGHT
    );

    if ($cloneFloor < 0 || $cloneFloor == $exitFloor) {
        $direction2Exit = $exitPos - $clonePos > 0 ? "RIGHT" : "LEFT";
        $result = $direction2Exit != $direction ? "BLOCK" : "WAIT";
    }
    else {
        $elevatorPos = $elevators[$cloneFloor];
        $direction2Elevator = $elevatorPos - $clonePos > 0 ? "RIGHT" : "LEFT";

        if ($elevatorPos - $clonePos === 0) {
            $result = "WAIT";
        }
        else {
            $result = $direction2Elevator != $direction ? "BLOCK" : "WAIT";
        }
    }

    echo("$result\n"); // action: WAIT or BLOCK
}
?>
