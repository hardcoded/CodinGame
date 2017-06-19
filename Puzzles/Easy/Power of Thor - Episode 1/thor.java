import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt();
	        String directionX = "";
        	String directionY = "";
	        if (this.initialTY > this.lightY) {
	        	directionY = "N";
	        	this.initialTY --;
	        }
	        else if (this.initialTY < this.lightY) {
	        	directionY = "S";
	        	this.initialTY ++;
	        }
	        if (this.initialTX > this.lightX) {
		        directionX = "W";
		        this.initialTX --;
	        }
	        else if (this.initialTX < this.lightX) {
	        	directionX = "E";
		        this.initialTX ++;
	        }
	        String direction = directionY + directionX;
	        System.out.println(direction);
        }
    }
}
