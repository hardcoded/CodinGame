import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        double closest = Double.MAX_VALUE;
        String closestName = "";

        Scanner in = new Scanner(System.in);
        double LON = Double.parseDouble(in.next().replace(",", "."));
        double LAT = Double.parseDouble(in.next().replace(",", "."));
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String[] defibs = in.nextLine().split(";");
            String name = defibs[1];
            double longitude = Double.parseDouble(defibs[4].replace(",", "."));
            double latitude = Double.parseDouble(defibs[5].replace(",", "."));
            double x = (longitude - LON)*Math.cos((LAT-latitude)/2);
            double y = latitude - LAT;
            double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 6371;
            if (d < closest) {
                closest = d;
                closestName = name;
            }
        }
        System.out.println(closestName);
    }
}
