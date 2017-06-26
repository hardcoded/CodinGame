<?php
fscanf(STDIN, "%d", $N);

for ($i = 0; $i < $N; $i++) {
    fscanf(STDIN, "%d", $P);
    $horses[$i] = $P;
}

sort($horses, SORT_NUMERIC);

$smallestDiff = $horses[1] - $horses[0];

for($i = 2 ; $i < $N; $i++ ) {
    $newDiff =  $horses[$i] - $horses[$i - 1];
    if($newDiff < $smallestDiff) {
        $smallestDiff  = $newDiff;
    }
}

echo($smallestDiff);
?>
