import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();

        String[][] ascii = new String[H][200];
        for (int i = 0; i < H; i++) {
            ascii[i] = in.nextLine().split("");
        }

        String[] alphMaj = new String[26];
        for (int i = 0; i < 26; i++) {
            int asciiCode = 65+i;
            alphMaj[i] = String.valueOf((char) asciiCode);
        }

        String[] alphMin = new String[26];
        for (int i = 0; i < 26; i++) {
            int asciiCode = 97+i;
            alphMin[i] = String.valueOf((char) asciiCode);
        }

        String asciiArt = "";
        for (int j = 0; j < H; j++) {
            String letter = "";
            String[] t = T.split("");
            for (int i = 0; i < t.length; i++) {
                int start = 0;
                if (Arrays.asList(alphMaj).indexOf(t[i]) != -1) {
                    start = Arrays.asList(alphMaj).indexOf(t[i])*L;
                }
                else if (Arrays.asList(alphMin).indexOf(t[i]) != -1) {
                    start = Arrays.asList(alphMin).indexOf(t[i])*L;
                }
                else {
                    start = alphMaj.length*L;
                }
                int end = start + L;
                for (int k = start; k < end; k++) {
                    letter += ascii[j][k];
                }
            }
            letter += "\n";
            asciiArt += letter;
        }

        System.out.println(asciiArt);
    }
}
