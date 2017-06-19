import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        String outline = "";
        String[] str = new String[height];
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or
            str[i] = line;
        }

        for (int i = 0; i < str.length; i++) {
            // boolean strFound = false;
            String arr = str[i];// .toCharArray();
            for (int j = 0; j < arr.length(); j++) {
                boolean found = false;
                boolean foundL = false;
                boolean foundB = false;
                if (arr.charAt(j) == '0') {
                    outline = j + " " + i;
                    found = true;
                }
                if (found && j + 1 < width) {
                    for (int k = (j + 1); k < width; k++) {
                        if (arr.charAt(k) == '0') {
                            outline += " " + (k) + " " + (i);
                            foundL = true;
                            break;
                        }
                    }
                    if (!foundL) {
                        outline += " -1 -1";
                        foundL = true;
                    }

                } else {// if (j + 2 >= width) {
                    outline += " -1 -1";
                    foundL = true;
                }

                if (found && i + 1 < height) {
                    for (int k = i + 1; k < height; k++) {
                        if( str[k].charAt(j) != '.'){
                        outline += " " + (j) + " " + (k);
                        foundB = true;
                        break;
                        }
                    }
                    if (!foundB) {
                        outline += " -1 -1";
                        foundB = true;
                    }
                } else {// if (i + 2 >= width) {
                    outline += " -1 -1";
                    foundB = true;
                }

                if (found && foundL && foundB) {
                    // strFound = true;
                    System.out.println(outline);
                }
            }

        }
    }
}
