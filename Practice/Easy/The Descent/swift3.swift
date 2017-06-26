import Glibc
import Foundation

public struct StderrOutputStream: TextOutputStream {
    public mutating func write(_ string: String) { fputs(string, stderr) }
}
public var errStream = StderrOutputStream()

// game loop
while true {
    var highestMountain = 0
    var highestMountainIndex = 0
    for i in 0...7 {
        let mountainH = Int(readLine()!)! // represents the height of one mountain.
        if (mountainH > highestMountain) {
            highestMountainIndex = i;
            highestMountain = mountainH;
        }
    }
    print(highestMountainIndex) // The index of the mountain to fire on.
}
