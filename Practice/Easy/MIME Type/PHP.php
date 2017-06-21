<?php

fscanf(STDIN, "%d",
    $N // Number of elements which make up the association table.
);
fscanf(STDIN, "%d",
    $Q // Number Q of file names to be analyzed.
);

$types = [];
for ($i = 0; $i < $N; $i++) {
    fscanf(STDIN, "%s %s",
        $ext, // file extension
        $mime // MIME type.
    );
    $types[strtolower($ext)] = $mime;
}

for ($i = 0; $i < $Q; $i++) {
    $fname = strtolower(stream_get_line(STDIN, 500 + 1, "\n")); // One file name per line.
    if(strrpos($fname,'.') > -1) {
        $array = explode(".", $fname);
        $type = array_pop($array);
        echo($types[$type] != "" ? $types[$type]."\n" : "UNKNOWN\n");
    }
    else {
        echo("UNKNOWN\n");
    }
}
?>
