using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

class Player {
    static void Main(string[] args) {
        // game loop
        while (true) {
            int highestMountain = 0;
            int highestMountainIndex = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = int.Parse(Console.ReadLine()); // represents the height of one mountain.
                if (mountainH > highestMountain) {
                    highestMountainIndex = i;
                    highestMountain = mountainH;
                }
            }

            Console.WriteLine(highestMountainIndex); // The index of the mountain to fire on.
        }
    }
}
