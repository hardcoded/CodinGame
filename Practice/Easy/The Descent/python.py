import sys
import math

# game loop
while True:
    highest_mountain = 0
    highest_mountain_index = 0
    for i in xrange(8):
        mountain_h = int(raw_input())  # represents the height of one mountain.
        if mountain_h > highest_mountain:
            highest_mountain_index = i
            highest_mountain = mountain_h
    # The index of the mountain to fire on.
    print highest_mountain_index
