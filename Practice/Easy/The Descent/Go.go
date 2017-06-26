package main

import "fmt"

func main() {
    for {
        var highestMountain int = 0
        var highestMountainIndex int = 0
        for i := 0; i < 8; i++ {
            // mountainH: represents the height of one mountain.
            var mountainH int
            fmt.Scan(&mountainH)
            if mountainH > highestMountain {
                highestMountainIndex = i
                highestMountain = mountainH
            }
        }

        fmt.Println(highestMountainIndex) // The index of the mountain to fire on.
    }
}
