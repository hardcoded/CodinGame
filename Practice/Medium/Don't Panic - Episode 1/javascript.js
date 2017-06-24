
const inputs = readline().split(' ');
const nbFloors = parseInt(inputs[0]); // number of floors
const width = parseInt(inputs[1]); // width of the area
const nbRounds = parseInt(inputs[2]); // maximum number of rounds
const exitFloor = parseInt(inputs[3]); // floor on which the exit is found
const exitPos = parseInt(inputs[4]); // position of the exit on its floor
const nbTotalClones = parseInt(inputs[5]); // number of generated clones
const nbAdditionalElevators = parseInt(inputs[6]); // ignore (always zero)
const nbElevators = parseInt(inputs[7]); // number of elevators

let elevators = []
for (var i = 0; i < nbElevators; i++) {
    let inputs = readline().split(' ');
    let elevatorFloor = parseInt(inputs[0]);
    let elevatorPos = parseInt(inputs[1]);
    elevators[elevatorFloor] = elevatorPos;
}

// game loop
while (true) {
    let inputs = readline().split(' ');
    let cloneFloor = parseInt(inputs[0]); // floor of the leading clone
    let clonePos = parseInt(inputs[1]); // position of the leading clone on its floor
    let direction = inputs[2]; // direction of the leading clone: LEFT or RIGHT

    if (cloneFloor < 0 || cloneFloor == exitFloor) {
        let direction2Exit = exitPos - clonePos > 0 ? "RIGHT" : "LEFT"
        result = direction2Exit != direction ? "BLOCK" : "WAIT"
    }
    else {
        let elevatorPos = elevators[cloneFloor]
        let direction2Elevator = elevatorPos - clonePos > 0 ? "RIGHT" : "LEFT"

        if (elevatorPos - clonePos === 0) {
            result = "WAIT"
        }
        else {
            result = direction2Elevator != direction ? "BLOCK" : "WAIT"
        }
    }

    print(result) // action: WAIT or BLOCK
}
