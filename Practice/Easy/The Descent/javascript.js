// game loop
while (true) {

    let mountainHeight = 0;
    let highestMountain = 0;
    let highestMountainIndex = 0;
    for (var i = 0; i < 8; i++) {
        mountainHeight = parseInt(readline()); // represents the height of one mountain.
        if (mountainHeight > highestMountain) {
            highestMountainIndex = i;
            highestMountain = mountainHeight;
        }
    }

    print(highestMountainIndex); // The index of the mountain to fire on.
}
