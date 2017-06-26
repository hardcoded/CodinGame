import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int highestMountain = 0;
            int highestMountainIndex = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (mountainH > highestMountain) {
                    highestMountainIndex = i;
                    highestMountain = mountainH;
                }
            }

            System.out.println(highestMountainIndex); // The index of the mountain to fire on.
        }
    }
}
