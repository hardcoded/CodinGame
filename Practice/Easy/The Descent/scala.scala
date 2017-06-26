import math._
import scala.util._

object Player extends App {

    // game loop
    while(true) {
        var highestMountain: Int = 0
        var highestMountainIndex: Int = 0
        for(i <- 0 until 8) {
            val mountainh = readInt // represents the height of one mountain.
            if (mountainh > highestMountain) {
                highestMountainIndex = i
                highestMountain = mountainh
            }
        }

        println(highestMountainIndex) // The index of the mountain to fire on.
    }
}
