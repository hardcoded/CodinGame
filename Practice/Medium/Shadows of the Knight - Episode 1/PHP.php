<?php

fscanf(STDIN, "%d %d",
    $W, // width of the building.
    $H // height of the building.
);
fscanf(STDIN, "%d",
    $N // maximum number of turns before game over.
);
fscanf(STDIN, "%d %d",
    $X,
    $Y
);

$minH = 0; $maxH = $H - 1; $minW = 0; $maxW = $W - 1;

// game loop
while (TRUE) {
    fscanf(STDIN, "%s",
        $bombDir // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
    );

    foreach(str_split($bombDir) as $c) {
        switch ($c){
            case 'L':
                $maxW = $X - 1;
                break;
            case 'R':
                $minW = $X + 1;
                break;
            case 'U':
                $maxH = $Y - 1;
                break;
            case 'D':
                $minH = $Y + 1;
                break;
        }
    }
    $Y = intval(($minH + $maxH) / 2);
    $X = intval(($minW + $maxW) / 2);
    // the location of the next window Batman should jump to.
    echo("$X $Y\n");
}
?>
