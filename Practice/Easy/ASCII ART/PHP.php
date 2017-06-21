<?php

fscanf(STDIN, "%d",
    $L
);
fscanf(STDIN, "%d",
    $H
);
$T = stream_get_line(STDIN, 256 + 1, "\n");

$ascii = [];
for ($i = 0; $i < $H; $i++) {
    $ascii[$i] = stream_get_line(STDIN, 1024 + 1, "\n");
}

$alphMaj = [];
for ($i = 0; $i < 26; $i++) {
    $alphMaj[$i] = chr(65+$i);
}

$alphMin = [];
for ($i = 0; $i < 26; $i++) {
    $alphMin[$i] = chr(97+$i);
}

$asciiArt = "";
for ($j = 0; $j < $H; $j++) {
    $letter = "";
    for ($i = 0; $i < strlen($T); $i++) {
        $start = 0;
        if (($start = array_search($T[$i], $alphMaj)) !== FALSE) {
            $start *= $L;
        }
        else if (($start = array_search($T[$i], $alphMin)) !== FALSE) {
            $start *= $L;
        }
        else {
            $start = sizeof($alphMaj)*$L;
        }
        $end = $start + $L;
        for ($k = $start; $k < $end; $k++) {
            $letter = $letter.$ascii[$j][$k];
        }
    }
    $letter .= "\n";
    $asciiArt .= $letter;
}

echo($asciiArt);
?>
