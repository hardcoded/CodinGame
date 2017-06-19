import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        int res;
        if (n != 0) {
            String tab[] = temps.split(" ");
            int temp[] = new int[n];
            int i;
            for (i = 0; i < n; i++) {
                temp[i] = Integer.parseInt(tab[i]);
            }
            res = temp[0];
            int j;
            for (j = 0; j < n; j++) {
                if(Math.abs(res) > Math.abs(temp[j]) || (Math.abs(res) == Math.abs(temp[j]) && res < temp[j])) {
                    res = temp[j];
                }
            }
        }
        else {
            res = 0;
        }
        System.out.println(res);
    }
}
