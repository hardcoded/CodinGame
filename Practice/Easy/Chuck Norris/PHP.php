<?php
$MESSAGE = stream_get_line(STDIN, 100 + 1, "\n");
$answer = "";

// on vérifie la taille du message
if (strlen($MESSAGE) > 100){
    echo( "Votre message est trop long, erreur !");
}

// on change le message en int
$msg = [];
$message = "";
$tmp ="";
for ($i = 0; $i < strlen($MESSAGE); $i++) {
    $msg[$i] = ord(substr($MESSAGE, $i, 1));
    $tmp = decbin($msg[$i]);
    if (strlen($tmp) < 7){
        for ($j = 0; $j < (7-strlen($tmp)); $j++) {
            $tmp = "0".$tmp;
        }
    }
    $message = $message.$tmp;
}

// on traite la chaine
if (strlen($message) != 0) {
    $i = 1;
    $valeurDuBit = substr($message, 0, 1);
    $nbDeBit = 1;
    while ($i < strlen($message)) {
        if (substr($message, $i, 1) == $valeurDuBit) {
            $nbDeBit++;
        }
        else{
            //entrer les valeur dans la reponse
            $answer .= $valeurDuBit == '0' ? "00 " : "0 ";
            $j;
            for ($j = 0; $j < $nbDeBit; $j++) {
                $answer .= "0";
            }
            $answer .= " ";
            //reinitialiser valeurDuByte et nbDeByte
            $valeurDuBit = substr($message, $i, 1);
            $nbDeBit = 1;
        }
        $i++;
    }
    $answer .= $valeurDuBit == '0' ? "00 " : "0 ";
    $j;
    for ($j = 0; $j < $nbDeBit; $j++) {
        $answer .= "0";
    }
}
echo($answer."\n");
?>
