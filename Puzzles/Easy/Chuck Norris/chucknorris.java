import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String answer = "";
        // on vérifie la taille du message
        if (MESSAGE.length() > 100){
            System.out.println( "Votre message est trop long, erreur !");
            return;
        }
        // on change le message en int
        int msg[] = new int[MESSAGE.length()];
        String message = "";
        String tmp ="";
        for (int i = 0; i < MESSAGE.length(); i++){
            msg[i] = (int)MESSAGE.charAt(i);
            tmp = Integer.toBinaryString(msg[i]);
            if (tmp.length()<7){
                for (int j = 0; j < (7-tmp.length()); j++){
                    tmp = "0" + tmp;
                }
            }
            message = message + tmp;
        }
        //System.out.println(message);
        // on traite la chaine
        if (message.length() == 0){
            answer = "";
        }
        else{
            int i = 1;
            char valeurDuBit = message.charAt(0);
            int nbDeBit = 1;
            while (i < message.length()){
                if (message.charAt(i) == valeurDuBit){ //attention
                    nbDeBit++;
                    //System.out.println("= "+nbDeByte);
                }
                else{

                    //System.out.println("!= "+nbDeByte);
                    //entrer les valeur dans la reponse
                    if (valeurDuBit == '0'){
                        answer += "00 ";
                    }
                    else{
                        answer += "0 ";
                    }
                    int j;
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
            if (valeurDuBit == '0'){
                        answer += "00 ";
                    }
                    else{
                        answer += "0 ";
                    }
                    int j;
                    for (j = 0; j < nbDeBit; j++){
                        answer += "0";
                    }
        }
        System.out.println(answer);
    }
}
