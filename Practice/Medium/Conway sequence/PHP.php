<?php

fscanf(STDIN, "%d",
    $R
);
fscanf(STDIN, "%d",
    $L
);

function ligneSuiv($ligne) {
    $suiv = [];
    $lastC = $ligne[0];
    $cpt = 0;
    foreach($ligne as $c) {
        if ($c == $lastC) {
            $cpt++;
        }
        else {
            array_push($suiv, (string) $cpt);
            array_push($suiv, $lastC);
            $lastC = $c;
            $cpt = 1;
        }
    }
    array_push($suiv, (string) $cpt);
    array_push($suiv, $lastC);
    return $suiv;
}

function conway($seed,$size) {
    $ligne = [(string) $seed];
    for ($i = 0; $i < $size; $i++) {
        $ligne = ligneSuiv($ligne);
    }
    echo sizeof($ligne) > 1 ? join(" ", $ligne) : join($ligne);
}

this.conway($R, $L-1);
?>
