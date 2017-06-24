import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X = in.nextInt();
        int Y = in.nextInt();

        int minH = 0, maxH = H - 1, minW = 0, maxW = W - 1;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            for(char c : bombDir.toCharArray()){
                switch (c){
                    case 'L':
                        maxW = X - 1;
                        break;
                    case 'R':
                        minW = X + 1;
                        break;
                    case 'U':
                        maxH = Y - 1;
                        break;
                    case 'D':
                        minH = Y + 1;
                        break;
                }
            }
            Y = (minH + maxH) / 2;
            X = (minW + maxW) / 2;
            System.out.println(X + " " + Y);
        }
    }
}
