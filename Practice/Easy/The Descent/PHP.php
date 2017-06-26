<?php
// game loop
while (TRUE) {
    $highestMountain = 0;
    $highestMountainIndex = 0;

    for ($i = 0; $i < 8; $i++){
        fscanf(STDIN, "%d",
            $mountainH // represents the height of one mountain.
        );

        if ($mountainH > $highestMountain) {
            $highestMountainIndex = $i;
            $highestMountain = $mountainH;
        }
    }

    echo("$highestMountainIndex\n"); // The index of the mountain to fire on.
}
?>
