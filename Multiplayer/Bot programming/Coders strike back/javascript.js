let isStart = true

// game loop
while (true) {
    let inputs = readline().split(' ');
    const x = parseInt(inputs[0]);
    const y = parseInt(inputs[1]);
    const nextCheckpointX = parseInt(inputs[2]); // x position of the next check point
    const nextCheckpointY = parseInt(inputs[3]); // y position of the next check point
    const nextCheckpointDist = parseInt(inputs[4]); // distance to the next checkpoint
    const nextCheckpointAngle = parseInt(inputs[5]); // angle between your pod orientation and the direction of the next checkpoint
    let input = readline().split(' ');
    const opponentX = parseInt(input[0]);
    const opponentY = parseInt(input[1]);

    let thrust = 100
    if (isStart) {
        thrust = "BOOST"
    }

    if (nextCheckpointAngle > 90 || nextCheckpointAngle < -90) {
        thrust = 0
    }

    // You have to output the target position
    // followed by the power (0 <= thrust <= 100)
    // i.e.: "x y thrust"
    print(nextCheckpointX + ' ' + nextCheckpointY + ' ' + thrust + ' ' + thrust);
    isStart = false
}
