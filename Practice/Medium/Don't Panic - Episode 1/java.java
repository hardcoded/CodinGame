import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbFloors = in.nextInt(); // number of floors
        int width = in.nextInt(); // width of the area
        int nbRounds = in.nextInt(); // maximum number of rounds
        int exitFloor = in.nextInt(); // floor on which the exit is found
        int exitPos = in.nextInt(); // position of the exit on its floor
        int nbTotalClones = in.nextInt(); // number of generated clones
        int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
        int nbElevators = in.nextInt(); // number of elevators

        int[] elevators = new int[nbElevators];
        for (int i = 0; i < nbElevators; i++) {
            int elevatorFloor = in.nextInt(); // floor on which this elevator is found
            int elevatorPos = in.nextInt(); // position of the elevator on its floor
            elevators[elevatorFloor] = elevatorPos;
        }

        // game loop
        while (true) {
            int cloneFloor = in.nextInt(); // floor of the leading clone
            int clonePos = in.nextInt(); // position of the leading clone on its floor
            String direction = in.next(); // direction of the leading clone: LEFT or RIGHT
            String result = "WAIT";

            if (cloneFloor < 0 || cloneFloor == exitFloor) {
                String direction2Exit = exitPos - clonePos > 0 ? "RIGHT" : "LEFT";
                result = !direction2Exit.equals(direction) ? "BLOCK" : "WAIT";
            }
            else {
                int elevatorPos = elevators[cloneFloor];
                String direction2Elevator = elevatorPos - clonePos > 0 ? "RIGHT" : "LEFT";

                if (elevatorPos - clonePos == 0) {
                    result = "WAIT";
                }
                else {
                    result = !direction2Elevator.equals(direction) ? "BLOCK" : "WAIT";
                }
            }

            System.out.println(result); // action: WAIT or BLOCK
        }
    }
}
