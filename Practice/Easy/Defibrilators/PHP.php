<?php

$closest = PHP_INT_MAX;
$closestName = '';

fscanf(STDIN, "%s", $LON);
fscanf(STDIN, "%s", $LAT);
fscanf(STDIN, "%d", $N);

$LON = str_replace(',', '.', $LON);
$LAT = str_replace(',', '.', $LAT);

for ($i = 0; $i < $N; $i++) {
    $defib = explode(";", stream_get_line(STDIN, 256 + 1, "\n"));
    $name = $defib[1];
    $longitude = str_replace(",", ".", $defib[4]);
    $latitude = str_replace(",", ".", $defib[5]);

    $x = ($longitude - $LON)*cos(($LAT-$latitude)/2);
    $y = $latitude - $LAT;
    $d = sqrt(pow($x, 2) + pow($y, 2)) * 6371;
    if ($d < $closest) {
        $closest = $d;
        $closestName = $name;
    }
}

echo("$closestName\n");
?>
