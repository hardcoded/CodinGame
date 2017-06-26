<?php
fscanf(STDIN, "%d",
    $n // the number of temperatures to analyse
);
$temps = stream_get_line(STDIN, 256 + 1, "\n"); // the n temperatures expressed as integers ranging from -273 to 5526

if ($n !== 0) {
    $tab = explode(" ", $temps);
    $temp = [];
    for ($i = 0; $i < $n; $i++) {
        $temp[$i] = intval($tab[$i]);
    }
    $res = $temp[0];
    for ($j = 0; $j < $n; $j++) {
        if(abs($res) > abs($temp[$j]) || (abs($res) == abs($temp[$j]) && $res < $temp[$j])) {
            $res = $temp[$j];
        }
    }
}
else {
    $res = 0;
}

echo("$res\n");
?>
