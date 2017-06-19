<?php
fscanf(STDIN, "%d",
    $width // the number of cells on the X axis
);
fscanf(STDIN, "%d",
    $height // the number of cells on the Y axis
);
$grid = [];
for ($i = 0; $i < $height; $i++) {
    $grid[$i] = stream_get_line(STDIN, 31 + 1, "\n"); // width characters, each either 0 or .
}

for($y1 = 0; $y1 < $height; $y1++) {
    for($x1 = 0; $x1 < $width; $x1++) {
        if ($grid[$y1][$x1] == '0') {
            $x2 = '-1';
            $y2 = '-1';
            $x3 = '-1';
            $y3 = '-1';

            for($i = $x1+1; $i < $width; $i++) {
                if ($grid[$y1][$i] == '0') {
                    $x2 = $i;
                    $y2 = $y1;
                    break;
                }
            }

            for($i = $y1+1; $i < $height; $i++) {
                if ($grid[$i][$x1] == '0') {
                    $x3 = $x1;
                    $y3 = $i;
                    break;
                }
            }

            echo($x1." ".$y1." ".$x2." ".$y2." ".$x3." ".$y3."\n");
        }
    }
}

?>
