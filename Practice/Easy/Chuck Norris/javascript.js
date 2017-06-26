var MESSAGE = readline();
let answer = "";

// on vérifie la taille du message
if (MESSAGE.length > 100){
    print( "Votre message est trop long, erreur !");
}
// on change le message en int
let msg = [];
let message = "";
let tmp ="";
for (let i = 0; i < MESSAGE.length; i++){
    msg[i] = MESSAGE.charAt(i).charCodeAt(0);
    tmp = msg[i].toString(2);
    if (tmp.length < 7){
        for (let j = 0; j < (7-tmp.length); j++) {
            tmp = "0" + tmp;
        }
    }
    message = message + tmp;
}
// on traite la chaine
if (message.length != 0){
    let i = 1;
    let valeurDuBit = message.charAt(0);
    let nbDeBit = 1;
    while (i < message.length) {
        if (message.charAt(i) == valeurDuBit){ //attention
            nbDeBit++;
        }
        else{
            //entrer les valeur dans la reponse
            answer += valeurDuBit == '0' ? "00 " : "0 ";
            let j;
            for (j = 0; j < nbDeBit; j++){
                answer += "0";
            }
            answer += " ";
            //reinitialiser valeurDuByte et nbDeByte
            valeurDuBit = message.charAt(i);
            nbDeBit = 1;
        }
        i++;
    }
    answer += valeurDuBit == '0' ? "00 " : "0 ";
    let j;
    for (j = 0; j < nbDeBit; j++){
        answer += "0";
    }
}
print(answer);
